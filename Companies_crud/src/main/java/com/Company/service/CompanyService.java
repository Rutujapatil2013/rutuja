package com.Company.service;
import java.util.List;
import org.springframework.stereotype.Component;
import com.Company.request.CompanyRequest;
import com.Company.response.CompanyResponse;


@Component
public interface CompanyService {
 
	 public List<CompanyResponse> getData();
	 
	 public CompanyResponse getCompanyById(Long id);
	 
	 public CompanyResponse addCompany(CompanyRequest companyRequest);
	 
	 public CompanyResponse updateCompany(CompanyRequest companyRequest,Long id);
	 
	 public String deleteCompany(Long id);
 
}