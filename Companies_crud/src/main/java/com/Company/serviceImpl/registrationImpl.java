package com.Company.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Company.entity.RegistrationEntity;
import com.Company.repository.RegistrationRepository;
import com.Company.request.RegistrationRequest;
import com.Company.response.RegistrationResponse;
import com.Company.service.RegistrationService;
import com.Company.transformer.RequestConverter;
import com.Company.transformer.ResponseConverter;


@Component
public class registrationImpl implements RegistrationService{

	//Bean 
	@Autowired
	private RegistrationRepository registrationRepository;
	
	@Autowired
	private ResponseConverter responseConverter;
	
	@Autowired
	private RequestConverter requestConverter;
	
	@Override
	public List<RegistrationResponse> getData() {
		List<RegistrationEntity> userList = registrationRepository.findAll();		
		return responseConverter.toRegistrationResponseList(userList);
	}
	
	@Override
	public RegistrationResponse getRegistrationById(Long id) {
		Optional<RegistrationEntity> registrationData = registrationRepository.findById(id);
		if(registrationData.isPresent()) {
		return responseConverter.toRegistrationResponse(registrationData.get());
		}
		return null;
	}
	
	@Override
	public RegistrationResponse addRegistration(final RegistrationRequest registrationRequest) {
		final RegistrationEntity RegistrationData = requestConverter.toRegistrationEntity(registrationRequest);
		final RegistrationEntity savedRegistrationEntity = registrationRepository.save(RegistrationData);
		return responseConverter.toRegistrationResponse(savedRegistrationEntity);
	}

//	@Override
//	public CompanyResponse updateCompany(Long id, CompanyEntity user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	@Override
	public RegistrationResponse updateRegistration(RegistrationRequest registrationRequest,Long id) {
	    Optional<RegistrationEntity> registrationData = registrationRepository.findById(Long.valueOf(id));
	    if(registrationData.isPresent()) {
	    	RegistrationEntity registrationEntity = registrationData.get();
	    	registrationEntity.setId(registrationRequest.getId()); 
	    	registrationEntity.setCompanyId(registrationRequest.getCompanyId());
	    	registrationEntity.setLegalName(registrationRequest.getLegalName());
	    	registrationEntity.setRegistrationId(registrationRequest.getRegistrationId());
	    	registrationEntity.setDateOfRegister(registrationRequest.getDateOfRegister());
	        
	        RegistrationEntity updatedRegistrationEntity = registrationRepository.save(registrationEntity);
	        return responseConverter.toRegistrationResponse(updatedRegistrationEntity);
	    }
	    return null;
	}

	@Override
	public String deleteRegistration(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

