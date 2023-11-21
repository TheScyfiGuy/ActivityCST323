package com.gcu.business;

import org.springframework.stereotype.Service;

@Service
public class SecurityBusinessService 
{
	public boolean authentication(String username, String password)
	{
		System.out.println("Hello from the SecurityBusinessService");
		return true;
	}
}
