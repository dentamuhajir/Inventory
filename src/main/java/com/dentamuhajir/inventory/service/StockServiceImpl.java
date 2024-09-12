package com.dentamuhajir.inventory.service;


import com.dentamuhajir.inventory.model.Stock;
import com.dentamuhajir.inventory.repository.StockRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StockServiceImpl implements StockService {
    private StockRepository stockRepository;

    @Override
    public Stock createStock(Stock stock) {
        return null;
    }

    @Override
    public List<Stock> listAllStocks() {
        return stockRepository.findAll();
    }
}
