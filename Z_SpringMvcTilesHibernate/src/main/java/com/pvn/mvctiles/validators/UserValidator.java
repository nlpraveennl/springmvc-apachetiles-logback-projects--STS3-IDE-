package com.pvn.mvctiles.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pvn.mvctiles.model.UserDetails;

@Component
public class UserValidator implements Validator
{

	public boolean supports(Class<?> candidate)
	{
		return UserDetails.class.isAssignableFrom(candidate);
	}

	public void validate(Object obj, Errors errors)
	{
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "login.required", new String[] { "Username" }, "Field is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "login.required", new String[] { "Password" }, "Field is required.");
	}
}
