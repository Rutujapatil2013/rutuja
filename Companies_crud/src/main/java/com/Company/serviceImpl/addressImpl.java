package com.Company.serviceImpl;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Company.entity.AddressEntity;
import com.Company.repository.AddressRepository;
import com.Company.request.AddressRequest;
import com.Company.response.AddressResponse;
import com.Company.service.AddressService;
import com.Company.transformer.RequestConverter;
import com.Company.transformer.ResponseConverter;


@Component
public class addressImpl implements AddressService{

	//Bean 
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ResponseConverter responseConverter;
	
	@Autowired
	private RequestConverter requestConverter;
	
	@Override
	public List<AddressResponse> getData() {
		List<AddressEntity> userList = addressRepository.findAll();		
		return responseConverter.toAddressResponseList(userList);
	}
	
	@Override
	public AddressResponse getAddressById(Long id) {
		Optional<AddressEntity> addressData = addressRepository.findById(id);
		if(addressData.isPresent()) {
		return responseConverter.toAddressResponse(addressData.get());
		}
		return null;
	}
	
	@Override
	public AddressResponse addAddress(final AddressRequest userRequest) {
		final AddressEntity addressData = requestConverter.toAddressEntity(userRequest);
		final AddressEntity savedAddressEntity = addressRepository.save(addressData);
		return responseConverter.toAddressResponse(savedAddressEntity);
	}

//	@Override
//	public CompanyResponse updateCompany(Long id, CompanyEntity user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	@Override
	public AddressResponse updateAddress(AddressRequest addressRequest,Long id) {
	    Optional<AddressEntity> addressData = addressRepository.findById(Long.valueOf(id));
	    if(addressData.isPresent()) {
	        AddressEntity addressEntity = addressData.get();
	        addressEntity.setId(addressRequest.getId());
	        addressEntity.setCompanyId(addressRequest.getCompanyId());
	        addressEntity.setCity(addressRequest.getCity());
	        addressEntity.setState(addressRequest.getState());
	        addressEntity.setCountry(addressRequest.getCountry());
	        addressEntity.setPincode(addressRequest.getPincode());
	        
	        AddressEntity updatedAddressEntity = addressRepository.save(addressEntity);
	        return responseConverter.toAddressResponse(updatedAddressEntity);
	    }
	    return null;
	}
	
	@Override
	public String deleteAddress(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
