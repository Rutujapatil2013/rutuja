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

import com.Company.request.UsersRequest;
import com.Company.response.UsersResponse;
import com.Company.service.UsersService;

@RestController
//@RequestMapping("/companies")
public class UsersController {

	@Autowired
	private UsersService usersService ;
	
    @GetMapping(path = "/getusers")
	List<UsersResponse> getUsers(){
		return usersService.getData();
	}
    
//    @GetMapping(path="/id")
//    public ResponseEntity<CompanyResponse> getUsers(@RequestParam(name="idUser", required=false, defaultValue="1") Long id){
//    	return companyService.getCompanyById(id);
//    }
    
	@GetMapping(path="/getusers/{id}")
	UsersResponse getUsersById(@PathVariable Long id)
	{
		return usersService.getUsersById(id);
	}
	
	
	@PostMapping(path = "/addusers")
	UsersResponse getUsersById(@RequestBody UsersRequest usersRequest) {
			return usersService.addUsers(usersRequest);
   }
	
	@PutMapping("/updateusers/{id}")
	UsersResponse update(@RequestBody UsersRequest usersRequest,@PathVariable Long id)
	{
		return usersService.updateUsers(usersRequest,id);
	}
	
	
//	//Delete data
//	@DeleteMapping("/deletedata/{id}")
//	CompanyResponse deleteData(@PathVariable int id)
//	{
//		return companyService.deleteCompany(id);
//	}
	
}

