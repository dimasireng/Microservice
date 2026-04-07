package com.digidaw.notification_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.digidaw.notification_service.model.Order;

@Service
public class NotificationService {
    @Autowired
    private JavaMailSender mailSender;
    
    public void sendEmail(Order order) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(order.getEmail());
        message.setSubject("Order Confirmation");
        String emailContent = String.format("Thank you for your order! Your order details:\n\n" 
            + "Order ID: " + order.getId() + "\n"   
            + "Product ID: " + order.getId_produk() + "\n"
            + "ID Pelanggan: " + order.getId_pelanggan() + "\n"
            + "Price: " + order.getHarga() + "\n"
            + "Quantity: " + order.getJumlah() + "\n"
            + "Total Price: " + order.getTotal() + "\n"
            + "Order Date: " + order.getTanggal());
                
    
        message.setText(emailContent);
        mailSender.send(message);
       
        System.out.println("Email berhasil dikirim ke: " + order.getEmail());
    }

}
