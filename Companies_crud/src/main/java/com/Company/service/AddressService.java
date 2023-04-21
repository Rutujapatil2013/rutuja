package com.Company.service;
import java.util.List;
import org.springframework.stereotype.Component;
import com.Company.request.AddressRequest;
import com.Company.response.AddressResponse;


@Component
public interface AddressService {
 
	 public List<AddressResponse> getData();
	 
	 public AddressResponse getAddressById(Long id);
	 
	 public AddressResponse addAddress( AddressRequest addressRequest);
	 
	 public AddressResponse updateAddress(AddressRequest addressRequest,Long id);
	 
	 public String deleteAddress(Long id);
 
}