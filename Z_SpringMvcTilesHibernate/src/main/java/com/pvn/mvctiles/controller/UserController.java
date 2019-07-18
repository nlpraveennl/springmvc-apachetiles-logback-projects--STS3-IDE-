package com.pvn.mvctiles.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pvn.mvctiles.model.UserDetails;

@Controller
@SessionAttributes
public class UserController
{
	Logger OUT = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/addUserDetails", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("userDetails") UserDetails userDetails, BindingResult result)
	{
		OUT.info("addUserDetails.html");
		return "redirect:userDetails.html";
	}

	@RequestMapping("/userDetails")
	public String showContacts(Model m)
	{
		OUT.info("userDetails.html");
		m.addAttribute("command", new UserDetails());
		return "userDetails";
	}

	@RequestMapping(value = "/authenticateUser.html", method = RequestMethod.POST)
	public String authenticateUser(@ModelAttribute("userDetails") UserDetails userDetails, BindingResult result)
	{
		OUT.info("authenticateUser.html");
		return "redirect:userDetails.html";
	}

	@RequestMapping("/login")
	public String login(Model m)
	{
		OUT.info("login.html");
		m.addAttribute("command", new UserDetails());
		return "login";
	}
}
