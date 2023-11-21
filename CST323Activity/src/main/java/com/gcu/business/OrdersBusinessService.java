package com.gcu.business;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import com.gcu.data.OrdersDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessInterface 
{
	public void test() {
		System.out.println("Hello from the OrdersBuisnessService");
	}
	
	@Autowired 
	OrdersDataService service;

	
	@Override
    public List<OrderModel> getOrders() 
	{
        List<OrderEntity> ordersEntity = service.findAll();
        
        List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
        for(OrderEntity entity : ordersEntity)
        {
        	ordersDomain.add(new OrderModel(
        			entity.getId(), 
        			entity.getOrderNo(), 
        			entity.getProductName(), 
        			entity.getPrice(), 
        			entity.getQuantity()));
        }
        return ordersDomain;
    }
	@Override
	public void init() 
	{
		
		System.out.println("This is a Test");
	}
  
	@Override
	public void destroy() 
	{
		System.out.println("This is also a Test");
	}
	
}
