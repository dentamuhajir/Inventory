package com.dentamuhajir.inventory.dto;

import lombok.Data;

@Data
public class StockDetailResponseDTO {
    private String itemName;
    private Integer stockQuantity;
    private Integer serialNumber;
    private String additionalInfo;
    private String image;
}