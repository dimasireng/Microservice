package com.rachel.order.vo;

import lombok.Data;
import com.rachel.order.model.Order;

@Data
public class ResponseTemplate {
    Order order;
    Produk produk;
}
