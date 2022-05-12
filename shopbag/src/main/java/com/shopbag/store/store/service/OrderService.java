package com.shopbag.store.store.service;

import java.util.List;

import com.shopbag.store.store.domain.Order;
import com.shopbag.store.store.domain.Payment;
import com.shopbag.store.store.domain.Shipping;
import com.shopbag.store.store.domain.ShoppingCart;
import com.shopbag.store.store.domain.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
