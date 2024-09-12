package com.dentamuhajir.inventory.service.impl;


import com.dentamuhajir.inventory.dto.StockCreateRequestDTO;
import com.dentamuhajir.inventory.model.Stock;
import com.dentamuhajir.inventory.repository.StockRepository;
import com.dentamuhajir.inventory.service.StockService;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class StockServiceImpl implements StockService {
    private StockRepository stockRepository;

    @Override
    public Stock createStock(StockCreateRequestDTO dto) {
        Stock stock = new Stock();
        stock.setItemName(dto.getItemName());
        stock.setStockQuantity(dto.getStockQuantity());
        stock.setSerialNumber(dto.getSerialNumber());
        stock.setAdditionalInfo(dto.getAdditionalInfo());
        stock.setImage(dto.getImage());
        stock.setCreatedAt(new Date());
        stock.setCreatedBy("Admin");
        stock.setUpdatedAt(new Date());
        stock.setUpdatedBy("Admin");

        return stockRepository.save(stock);
    }

    @Override
    public List<Stock> listStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock detailStock(Long id) {
        return stockRepository.findById(id).get();
    }

    @Override
    public Stock updateStock(Long id, Stock stock) {
        Stock existingStock = stockRepository.findById(id).get();
        existingStock.setItemName(stock.getItemName());
        return stockRepository.save(existingStock);
    }

    @Override
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }


}
