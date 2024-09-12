package com.dentamuhajir.inventory.service;


import com.dentamuhajir.inventory.model.Stock;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StockServiceImpl implements StockService {


    @Override
    public Stock createStock(Stock stock) {
        return null;
    }

    @Override
    public List<Stock> listAllStocks() {
        return null;
    }
}
