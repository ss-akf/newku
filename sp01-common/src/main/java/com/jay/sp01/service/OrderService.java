package com.jay.sp01.service;

import com.jay.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);


}
