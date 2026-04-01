package com.dimas.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dimas.order.model.Order;
import com.dimas.order.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public Order getOrderById(long id){
        return orderRepository.findById(id).orElse(null);
    }

    public Order createOrder(Order order){
        return orderRepository.save(order);
    }

    public void deleteOrder(long id){
        orderRepository.deleteById(id);
    }
}
