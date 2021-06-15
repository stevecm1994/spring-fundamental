package com.steve.spring.springcore.advanced.injecting.interfaces;

public class OrderBoImpl implements OrderBo {

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
