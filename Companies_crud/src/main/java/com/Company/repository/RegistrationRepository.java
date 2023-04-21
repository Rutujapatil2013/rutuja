package com.Company.repository;

import org.springframework.stereotype.Repository;
import com.Company.entity.RegistrationEntity;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface RegistrationRepository extends JpaRepository<RegistrationEntity,Long>{
	
	List<RegistrationEntity> findAll();
	Optional<RegistrationEntity> findById(Long id);
}
