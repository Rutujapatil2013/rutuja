package com.Company.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Company.entity.CompanyEntity;
import com.Company.repository.CompanyRepository;
import com.Company.request.CompanyRequest;
import com.Company.response.CompanyResponse;
import com.Company.service.CompanyService;
import com.Company.transformer.RequestConverter;
import com.Company.transformer.ResponseConverter;


@Component
public class companyImpl implements CompanyService{

	//Bean 
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private ResponseConverter responseConverter;
	
	@Autowired
	private RequestConverter requestConverter;
	
	@Override
	public List<CompanyResponse> getData() {
		List<CompanyEntity> userList = companyRepository.findAll();		
		return responseConverter.toCompanyResponseList(userList);
	}
	
	@Override
	public CompanyResponse getCompanyById(Long id) {
		Optional<CompanyEntity> companyData = companyRepository.findById(id);
		if(companyData.isPresent()) {
		return responseConverter.toCompanyResponse(companyData.get());
		}
		return null;
	}
	
	@Override
	public CompanyResponse addCompany(final CompanyRequest userRequest) {
		final CompanyEntity companyData = requestConverter.toCompanyEntity(userRequest);
		final CompanyEntity savedUserEntity = companyRepository.save(companyData);
		return responseConverter.toCompanyResponse(savedUserEntity);
	}

//	@Override
//	public CompanyResponse updateCompany(Long id, CompanyEntity user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	@Override
	public CompanyResponse updateCompany(CompanyRequest companyRequest,Long id) {
	    Optional<CompanyEntity> companyData = companyRepository.findById(Long.valueOf(id));
	    if(companyData.isPresent()) {
	        CompanyEntity companyEntity = companyData.get();
	        companyEntity.setId(companyRequest.getId()); 
	        companyEntity.setCompanyId(companyRequest.getCompanyId());
	        companyEntity.setCompanyName(companyRequest.getCompanyName());
	        companyEntity.setPhoneNumber(companyRequest.getPhoneNumber());
	        companyEntity.setIsDeleted(companyRequest.getIsDeleted());
	        
	        CompanyEntity updatedCompanyEntity = companyRepository.save(companyEntity);
	        return responseConverter.toCompanyResponse(updatedCompanyEntity);
	    }
	    return null;
	}

	
	@Override
	public String deleteCompany(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
