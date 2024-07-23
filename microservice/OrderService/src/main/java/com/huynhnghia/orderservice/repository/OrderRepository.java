package com.huynhnghia.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.huynhnghia.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
