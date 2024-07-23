package com.huynhnghia.Inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.huynhnghia.Inventoryservice.model.Inventory;
import com.huynhnghia.Inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("ihone_13");
			inventory.setQuantity(100);
			
			Inventory inventory1 = new Inventory();
			inventory1.setSkuCode("iphone_13_red");
			inventory1.setQuantity(0);
			
			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}

}
