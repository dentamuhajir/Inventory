package com.dentamuhajir.inventory.service;

import com.dentamuhajir.inventory.dto.StockCreateRequestDTO;
import com.dentamuhajir.inventory.model.Stock;

import java.util.List;

public interface StockService {
    Stock createStock(StockCreateRequestDTO dto);
    List<Stock> listStocks();
    Stock detailStock(Long id);
    Stock updateStock(Long id, Stock stock);
    void deleteStock(Long id);
}
