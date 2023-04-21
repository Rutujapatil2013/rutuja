package com.Company.controller;
import java.math.BigInteger;
import java.util.List;
import java.lang.String;

import com.Company.entity.CompanyEntity;
import com.Company.request.CompanyRequest;
import com.Company.response.CompanyResponse;
import com.Company.service.CompanyService;

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
public class CompanyController {

	@Autowired
	private CompanyService companyService ;
	
    @GetMapping(path = "/getcompany")
	List<CompanyResponse> getCompany(){
		return companyService.getData();
	}
    
//    @GetMapping(path="/id")
//    public ResponseEntity<CompanyResponse> getUsers(@RequestParam(name="idUser", required=false, defaultValue="1") Long id){
//    	return companyService.getCompanyById(id);
//    }
    
	@GetMapping(path="/getcompany/{id}")
	CompanyResponse getCompanyById(@PathVariable Long id)
	{
		return companyService.getCompanyById(id);
	}
	
	
	@PostMapping(path = "/addcompany")
	CompanyResponse getCompanyById(@RequestBody CompanyRequest companyRequest) {
			return companyService.addCompany(companyRequest);
   }
	
	@PutMapping("/updatecompany/{id}")
	CompanyResponse update(@RequestBody CompanyRequest companyRequest,@PathVariable Long id)
	{
		return companyService.updateCompany(companyRequest,id);
	}
	
	
//	//Delete data
//	@DeleteMapping("/deletedata/{id}")
//	CompanyResponse deleteData(@PathVariable int id)
//	{
//		return companyService.deleteCompany(id);
//	}
	
}
