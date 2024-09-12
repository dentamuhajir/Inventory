package com.dentamuhajir.inventory.controller;

import com.dentamuhajir.inventory.model.Stock;
import com.dentamuhajir.inventory.service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/stock")
public class StockController {
    private StockService stockService;

    @GetMapping
    public ResponseEntity<List<Stock>> findAllStock() {
        List<Stock> stockList = stockService.listAllStocks();
        return new ResponseEntity<>(stockList, HttpStatus.OK);
    }

}
