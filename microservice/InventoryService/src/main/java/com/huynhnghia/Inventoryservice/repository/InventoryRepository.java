package com.huynhnghia.Inventoryservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huynhnghia.Inventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	Optional<Inventory> findBySkuCode(String SkuCode);

}
