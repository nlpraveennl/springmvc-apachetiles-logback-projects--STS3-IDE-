package com.pvn.mvctiles.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pvn.mvctiles.model.User;
import com.pvn.mvctiles.validators.UserValidator;

@Controller
@SessionAttributes
public class UserController
{
	Logger OUT = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserValidator validator;
	
	/**
	 * @param model
	 * @return
	 * Validation Example
	 */
	@RequestMapping("/userValidation")
	public String userValidation(Model model)
	{
		OUT.info("userValidation");
		model.addAttribute("user", new User());
		return "userValidation";
	}
	
	@RequestMapping(value = "/userValidationSubmit.html", method = RequestMethod.POST)
	public String selectSubmit(Model model,@Validated @ModelAttribute("user") User user, BindingResult result)
	{
		OUT.info("userValidationSubmit");
		validator.validate(user, result);
		OUT.info("hasError: {}, Errors: {}", result.hasErrors(), result.getAllErrors());
		return "userValidation";
	}
}
