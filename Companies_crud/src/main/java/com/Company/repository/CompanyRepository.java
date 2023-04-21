
package com.Company.repository;

import org.springframework.stereotype.Repository;
import com.Company.entity.CompanyEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity,Long>{
	
	List<CompanyEntity> findAll();
	Optional<CompanyEntity> findById(Long id);
}