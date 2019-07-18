package com.pvn.mvctiles.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController
{
	@Autowired
	SessionFactory sessionFactory;
	
	@RequestMapping("/hello")
	public String helloWorld(Model m)
	{
		String message = "Hello World, Spring MVC Example";
		m.addAttribute("message", message);
		
		return "hello";
	}
}
