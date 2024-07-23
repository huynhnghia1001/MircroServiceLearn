package com.huynhnghia.Inventoryservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huynhnghia.Inventoryservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {

	private final InventoryRepository inventoryRepository;
	
	@Transactional(readOnly = true)
	public boolean isInStock(String skuCode) {
		return inventoryRepository.findBySkuCode(skuCode).isPresent();
	}
}
