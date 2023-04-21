package com.Company.service;
import java.util.List;
import org.springframework.stereotype.Component;

import com.Company.entity.RegistrationEntity;
import com.Company.request.RegistrationRequest;
import com.Company.response.RegistrationResponse;


@Component
public interface RegistrationService {
 
	 public List<RegistrationResponse> getData();
	 
	 public RegistrationResponse getRegistrationById(Long id);
	 
	 public RegistrationResponse addRegistration(RegistrationRequest registrationRequest);
	 
	 public RegistrationResponse updateRegistration(RegistrationRequest registrationRequest,Long id);
	 
	 public String deleteRegistration(Long id);
 
}