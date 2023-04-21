package com.Company.service;
import java.util.List;
import org.springframework.stereotype.Component;
import com.Company.request.UsersRequest;
import com.Company.response.UsersResponse;


@Component
public interface UsersService {
 
	 public List<UsersResponse> getData();
	 
	 public UsersResponse getUsersById(Long id);
	 
	 public UsersResponse addUsers(UsersRequest usersRequest);
	 
	 public UsersResponse updateUsers(UsersRequest usersRequest,Long id);
	 
	 public String deleteUsers(Long id);
 
}