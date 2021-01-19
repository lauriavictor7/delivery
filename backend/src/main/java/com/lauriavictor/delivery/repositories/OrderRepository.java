package com.lauriavictor.delivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lauriavictor.delivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
