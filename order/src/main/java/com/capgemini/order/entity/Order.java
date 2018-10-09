package com.capgemini.order.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ordertable")
public class Order {

	@Id
	private int orderId;
	private float ordersTotal;
	private LocalDate date;
	private int customerId;
	public Order() {
		super();
	}
	public Order(int orderId, float ordersTotal, LocalDate date, int customerId) {
		super();
		this.orderId = orderId;
		this.ordersTotal = ordersTotal;
		this.date = date;
		this.customerId = customerId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getOrdersTotal() {
		return ordersTotal;
	}
	public void setOrdersTotal(float ordersTotal) {
		this.ordersTotal = ordersTotal;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", ordersTotal=" + ordersTotal + ", date=" + date + ", customerId="
				+ customerId + "]";
	}

	
	
}
