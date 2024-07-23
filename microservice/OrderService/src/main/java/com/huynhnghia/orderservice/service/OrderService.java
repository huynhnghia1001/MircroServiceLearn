package com.huynhnghia.orderservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.huynhnghia.orderservice.dto.OrderLineItemsDto;
import com.huynhnghia.orderservice.dto.OrderRequest;
import com.huynhnghia.orderservice.model.Order;
import com.huynhnghia.orderservice.model.OrderLineItems;
import com.huynhnghia.orderservice.repository.OrderRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

	private final OrderRepository orderRepository;
	
	public void placeOrder(OrderRequest orderRequest) {
		Order order = new Order();
		order.setOrderNumber(UUID.randomUUID().toString());

		List<OrderLineItems> orderLineItems = orderRequest.getOrderLineItemsDto()
			.stream()
			.map(this::mapToDto)
			.toList();
		
		order.setOrderLineItemsList(orderLineItems);
		
		orderRepository.save(order);
	}
	
	public OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
		OrderLineItems orderLineItems = new OrderLineItems();
		orderLineItems.setPrice(orderLineItemsDto.getPrice());
		orderLineItems.setQuantity(orderLineItemsDto.getQuantity());
		orderLineItems.setSkuCode(orderLineItemsDto.getSkuCode());
		return orderLineItems;
	}
}
