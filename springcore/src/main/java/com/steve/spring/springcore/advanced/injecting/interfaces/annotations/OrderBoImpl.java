package com.steve.spring.springcore.advanced.injecting.interfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("bo")
public class OrderBoImpl implements OrderBo {

	@Autowired
	@Qualifier("dao2")
	private OrderDAO orderDao;

	@Override
	public void order() {
		System.out.println("Inside Order BO");
		orderDao.order();
	}

	public OrderDAO getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDAO orderDao) {
		this.orderDao = orderDao;
	}

}
