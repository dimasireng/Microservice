package com.dimas.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dimas.order.model.Order;

public interface  OrderRepository extends JpaRepository<Order, Long> {

}
