package com.Company.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.Company.entity.UsersEntity;
import com.Company.repository.UsersRepository;
import com.Company.request.UsersRequest;
import com.Company.response.UsersResponse;
import com.Company.service.UsersService;
import com.Company.transformer.RequestConverter;
import com.Company.transformer.ResponseConverter;


@Component
public class userdImpl implements UsersService{

	//Bean 
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private ResponseConverter responseConverter;
	
	@Autowired
	private RequestConverter requestConverter;
	
	@Override
	public List<UsersResponse> getData() {
		List<UsersEntity> userList = usersRepository.findAll();		
		return responseConverter.toUsersResponseList(userList);
	}
	
	@Override
	public UsersResponse getUsersById(Long id) {
		Optional<UsersEntity> usersData = usersRepository.findById(id);
		if(usersData.isPresent()) {
		return responseConverter.toUsersResponse(usersData.get());
		}
		return null;
	}
	
	@Override
	public UsersResponse addUsers(final UsersRequest usersRequest) {
		final UsersEntity usersData = requestConverter.toUsersEntity(usersRequest);
		final UsersEntity savedUsersEntity = usersRepository.save(usersData);
		return responseConverter.toUsersResponse(savedUsersEntity);
	}

//	@Override
//	public CompanyResponse updateCompany(Long id, CompanyEntity user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	@Override
	public UsersResponse updateUsers(UsersRequest usersRequest,Long id) {
	    Optional<UsersEntity> usersData = usersRepository.findById(Long.valueOf(id));
	    if(usersData.isPresent()) {
	    	UsersEntity usersEntity = usersData.get();
	    	usersEntity.setId(usersRequest.getId()); 
	    	usersEntity.setCompanyId(usersRequest.getCompanyId());
	    	usersEntity.setFirstName(usersRequest.getFirstName());
	    	usersEntity.setLastName(usersRequest.getLastName());
	    	usersEntity.setType(usersRequest.getType());
	    	usersEntity.setEmail(usersRequest.getEmail());
	        
	    	UsersEntity updatedUsersEntity = usersRepository.save(usersEntity);
	        return responseConverter.toUsersResponse(updatedUsersEntity);
	    }
	    return null;
	}

	
	@Override
	public String deleteUsers(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

