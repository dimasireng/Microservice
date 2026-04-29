package com.digidaw.notification_service.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.digidaw.notification_service.model.Order;
import com.digidaw.notification_service.service.NotificationService;

@Component
public class OrderListener {
    @Autowired
    private NotificationService notificationService;

    @RabbitListener(queues = "order.notification.queue")     //rabbitlistener menerima pesan dari queue 
    public void receiveOrder(Order order) {
        System.out.println("Order Baru Diterima");
        System.out.println("ID Order: " + order.getId());
        System.out.println("Email: " + order.getEmail());       // terima data order
        System.out.println("Username: " + order.getUsername());
        notificationService.sendEmail(order);                   // ngirim email
    }
}
