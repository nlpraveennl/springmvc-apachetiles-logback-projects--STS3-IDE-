package com.pvn.mvctiles.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pvn.mvctiles.model.UserDetails;
import com.pvn.mvctiles.service.UserService;
import com.pvn.mvctiles.validators.UserValidator;

@Controller
@SessionAttributes
public class UserController
{
	Logger OUT = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserValidator validator;
	
	@Autowired
	UserService userService;
	
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
	public String authenticateUser(@ModelAttribute("login") UserDetails userDetails, BindingResult result)
	{
		validator.validate(userDetails, result);
		
		if(result.hasErrors())
		{
			result.getFieldErrors().forEach(error -> 
			{
				OUT.debug("Field: {}, Error: {}",error.getField(), error.getCode());
			});
			return "login";
		}
		UserDetails userDetailsTO = userService.authenticateUser(userDetails);
		if(userDetailsTO == null)
		{
			OUT.info("Username or Password Incorrect");
			result.addError(new ObjectError("userName", "Username or Password Incorrect"));
			return "login";
		}
		return "redirect:userDetails.html";
	}

	@RequestMapping({"/login", "/"})
	public String login(Model model)
	{
		OUT.info("login.html");
		model.addAttribute("login", new UserDetails());
		return "login";
	}
}
