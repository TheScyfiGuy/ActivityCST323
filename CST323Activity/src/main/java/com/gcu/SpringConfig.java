package com.gcu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



import com.gcu.business.OrdersBusinessInterface;
import com.gcu.business.OrdersBusinessService;
import com.gcu.business.SecurityBusinessService;

@Configuration
@ComponentScan(basePackages = "com.gcu")
public class SpringConfig 
{
	@Bean(name="ordersBusinessService", initMethod="init", destroyMethod="destroy")
	public OrdersBusinessInterface getOrdersBuisness()
	{
		return new OrdersBusinessService();
	}
	

	
}
