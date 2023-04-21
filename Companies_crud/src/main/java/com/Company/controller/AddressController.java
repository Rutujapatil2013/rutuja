package com.Company.controller;
import java.math.BigInteger;
import java.util.List;

import com.Company.request.AddressRequest;
import com.Company.response.AddressResponse;
import com.Company.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
//@RequestMapping("/companies")
public class AddressController {

	@Autowired
	private AddressService addressService ;
	
    @GetMapping(path = "/getaddress")
	List<AddressResponse> getAddress(){
		return addressService.getData();
	}
    
//    @GetMapping(path="/id")
//    public ResponseEntity<CompanyResponse> getUsers(@RequestParam(name="idUser", required=false, defaultValue="1") Long id){
//    	return companyService.getCompanyById(id);
//    }
    
	@GetMapping(path="/getaddress/{id}")
	AddressResponse getAddressById(@PathVariable Long id)
	{
		return addressService.getAddressById(id);
	}
	
	
	@PostMapping(path = "/addaddress")
	AddressResponse getAddressById(@RequestBody AddressRequest addressRequest) {
			return addressService.addAddress(addressRequest);
   }
	
	@PutMapping("/updateaddress/{id}")
	AddressResponse update(@RequestBody AddressRequest addressRequest,@PathVariable Long id)
	{
		return addressService.updateAddress(addressRequest,id);
	}
	
	
//	//Delete data
//	@DeleteMapping("/deletedata/{id}")
//	CompanyResponse deleteData(@PathVariable int id)
//	{
//		return companyService.deleteCompany(id);
//	}
	
}

