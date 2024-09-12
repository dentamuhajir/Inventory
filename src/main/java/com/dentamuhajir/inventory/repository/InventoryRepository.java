package com.dentamuhajir.inventory.repository;

import com.dentamuhajir.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
