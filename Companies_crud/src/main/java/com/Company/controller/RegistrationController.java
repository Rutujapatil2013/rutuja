package com.Company.controller;
import java.math.BigInteger;
import java.util.List;

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

import com.Company.request.RegistrationRequest;
import com.Company.response.RegistrationResponse;
import com.Company.service.RegistrationService;



@RestController
//@RequestMapping("/companies")
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService ;
	
    @GetMapping(path = "/getregistration")
	List<RegistrationResponse> getRegistration(){
		return registrationService.getData();
	}
    
//    @GetMapping(path="/id")
//    public ResponseEntity<CompanyResponse> getUsers(@RequestParam(name="idUser", required=false, defaultValue="1") Long id){
//    	return companyService.getCompanyById(id);
//    }
    
	@GetMapping(path="/getregistration/{id}")
	RegistrationResponse getRegistrationById(@PathVariable Long id)
	{
		return registrationService.getRegistrationById(id);
	}
	
	
	@PostMapping(path = "/addregistration")
	RegistrationResponse getRegistrationById(@RequestBody RegistrationRequest registrationRequest) {
			return registrationService.addRegistration(registrationRequest);
   }
	
	@PutMapping("/updateregistration/{id}")
	RegistrationResponse update(@RequestBody RegistrationRequest registrationRequest,@PathVariable Long id)
	{
		return registrationService.updateRegistration(registrationRequest,id);
	}
	
	
//	//Delete data
//	@DeleteMapping("/deletedata/{id}")
//	CompanyResponse deleteData(@PathVariable int id)
//	{
//		return companyService.deleteCompany(id);
//	}
	
}

