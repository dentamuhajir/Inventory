package com.dentamuhajir.inventory.controller;

import com.dentamuhajir.inventory.dto.StockCreateRequestDTO;
import com.dentamuhajir.inventory.model.Stock;
import com.dentamuhajir.inventory.service.StockService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/stocks")
public class StockController {
    private StockService stockService;

    @PostMapping
    public ResponseEntity<Stock> createStock(@RequestBody StockCreateRequestDTO dto) {
        try {
            Stock createdStock = stockService.createStock(dto);
            return new ResponseEntity<>(createdStock, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<Stock>> findAllStock() {
        try {
            List<Stock> stockList = stockService.listStocks();
            return new ResponseEntity<>(stockList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stock> updateStock(@PathVariable Long id, @RequestBody Stock stock) {
        try {
            Stock updatedStock = stockService.updateStock(id, stock);
            if (updatedStock != null) {
                return ResponseEntity.ok(updatedStock);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Stock> detailStock(@PathVariable Long id) {
        try {
            Stock detailStock = stockService.detailStock(id);
            return new ResponseEntity<>(detailStock, HttpStatus.OK);

        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStock(@PathVariable Long id) {
        stockService.deleteStock(id);
        return ResponseEntity.ok().build();
    }
}
