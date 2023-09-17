package com.medplus.online_shopping.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.medplus.online_shopping.entities.OrderList;
import com.medplus.online_shopping.service.OrderService;

@SpringBootTest
class OrderListDaoTest {
	@Autowired
	OrderService service;

	
	
	@Test
	void testGetByIdTrue() {
		Optional<OrderList> orderList = service.getOrderByOid(9);
		assertTrue(!orderList.isEmpty());
	}

	@Test
	void testGetByIdFalse() {
		Optional<OrderList> orderList = service.getOrderByOid(9);
		assertFalse(orderList.isEmpty());
	}

	@Test
	void testGetOrderListByIdTrue() {
		List<OrderList> orderList = service.getOrderList(1200);
		assertTrue(!orderList.isEmpty());
	}

	@Test
	void testGetOrderListByIdFalse() {
		List<OrderList> orderList = service.getOrderList(1200);
		assertFalse(orderList.isEmpty());
	}
}
