package com.example.webservicespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservicespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
