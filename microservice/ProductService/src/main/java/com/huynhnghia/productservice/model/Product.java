package com.huynhnghia.productservice.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
}
