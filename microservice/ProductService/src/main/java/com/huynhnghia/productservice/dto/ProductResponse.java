package com.huynhnghia.productservice.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductResponse {

	private String id;
	private String name;
	private String description;
	private BigDecimal price;
}
