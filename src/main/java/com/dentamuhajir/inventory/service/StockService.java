package com.dentamuhajir.inventory.service;

import com.dentamuhajir.inventory.model.Stock;

import java.util.List;

public interface StockService {
    Stock createStock(Stock stock);
    List<Stock> listAllStocks();
    Stock updateStock(Long id,Stock stock);
    void deleteStock(Long id);
}
