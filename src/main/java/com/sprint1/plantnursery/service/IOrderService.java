package com.sprint1.plantnursery.service;
import java.util.List;

import com.sprint1.plantnursery.entity.OrderTable;

/*Controller Class for Order Controller*/

public interface IOrderService {
	OrderTable addOrder(OrderTable order);
	
	OrderTable deleteOrder(int bookingId);
	
	OrderTable viewOrder(int bookingId);
	
	List<OrderTable> viewAllOrders();
	
	
	OrderTable updateOrder(OrderTable order,int bookingId);
	
	
}