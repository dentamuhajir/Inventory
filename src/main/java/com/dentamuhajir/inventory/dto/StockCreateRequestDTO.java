package com.dentamuhajir.inventory.dto;

import lombok.Data;

@Data
public class StockCreateRequestDTO {
    private String itemName;
    private Integer stockQuantity;
    private Integer serialNumber;
    private String additionalInfo;
    //private String image;
}
