package com.t4u.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.t4u.bean.Area;
import com.t4u.crm.validators.RegionValidator;

public class AreaValidator implements Validator{

	RegionValidator regionValidator;
	
	@Autowired(required = true)
	public AreaValidator(RegionValidator regionValidator) {
		this.regionValidator = regionValidator;
	}
	
	@Override
	public boolean supports(Class<?> obj) {
		return obj.isAssignableFrom(Area.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		
		Area area = (Area) obj;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "areaName", "AreaName is empty.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "areaType", "AreaType is empty.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "Description is empty.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "Address is empty.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "City is empty.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", "State is empty.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "Country is empty.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pincode", "Pincode is empty.");
		
		try{
			errors.pushNestedPath("region");
			ValidationUtils.invokeValidator(regionValidator, area.getRegion(), errors);
			
		}finally{
			errors.popNestedPath();
		}
		
		
	}

}
