package com.dentamuhajir.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockCreateRequestDTO {
    private long id;
    private String itemName;
    private Integer stockQuantity;
    private Integer serialNumber;
    private String additionalInfo;
    private String image;
    private Date createdAt;
    private String createdBy;
    private Date updatedAt;
    private String updatedBy;
}
