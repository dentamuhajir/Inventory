package com.dentamuhajir.inventory.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="stocks")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "item_name", nullable = false)
    private String itemName;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "serial_number", unique = true)
    private Integer serialNumber;

    @Column(name = "additional_info", columnDefinition = "JSON")
    private String additionalInfo;

    @Column(name = "image")
    private String image;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "updated_by")
    private String updatedBy;
}
