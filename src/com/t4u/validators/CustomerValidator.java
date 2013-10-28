package com.t4u.validators;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.t4u.bean.Customer;

@Component
public class CustomerValidator implements Validator{
	
	
	@Override
	public boolean supports(Class<?> obj) {
		return obj.isAssignableFrom(Customer.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {

		Customer customer = (Customer) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "customerName", "Customer name is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "customerType", "CustomerType is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telephone1", "Telephone1 is Empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fax", "Fax is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Email is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "Address is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "Address is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pincode", "pincode is empty");

		if(customer.getTelephone1() != null && !customer.getTelephone1().equals("") && !Pattern.matches("\\d{10}", customer.getTelephone1())){
			errors.reject("telephone1", "Telephone1 is not proper");
		}
		if(customer.getTelephone2() != null && !customer.getTelephone2().equals("") && !Pattern.matches("\\d{10}", customer.getTelephone2())){
			errors.reject("telephone2", "Telephone2 is not proper");
		}
		if(customer.getFax() != null && !customer.getFax().equals("") && !Pattern.matches("\\d+", customer.getFax().toString())){
			errors.reject("fax", "Area is empty");
		}
		if(customer.getEmail() != null && !customer.getEmail().trim().equals("") && !Pattern.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", customer.getEmail().trim())){
			errors.reject("email", "Email is empty");
		}
		if(customer.getPincode() != null && customer.getPincode() != 0 && !Pattern.matches("\\d+",customer.getPincode().toString())){
			errors.reject("pincode", "Pincode is empty");
		}
		if(customer.getArea().getAreaName() == null || customer.getArea().getAreaName().trim().equals("")){
			errors.reject("area", "Area is empty");
		}
		if(customer.getRegion().getRegionName() == null || customer.getRegion().getRegionName().trim().equals("")){
			errors.reject("region", "Area is empty");
		}
	}

	
}
