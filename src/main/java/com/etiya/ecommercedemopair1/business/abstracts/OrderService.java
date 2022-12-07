package com.etiya.ecommercedemopair1.business.abstracts;

import com.etiya.ecommercedemopair1.entities.concretes.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
}
