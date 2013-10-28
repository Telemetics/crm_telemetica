package com.t4u.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.t4u.bean.Region;

public class RegionValidator implements Validator {

	
	@Override
	public boolean supports(Class<?> obj) {
		return obj.isAssignableFrom(Region.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "regionName", "RegionName is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "regionType", "RegionType is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "Description is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "Address is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "City is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", "State is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "Country is empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pincode", "Pincode is empty");
		
	}

}
