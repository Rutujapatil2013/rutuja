package com.Company.repository;

import org.springframework.stereotype.Repository;

import com.Company.entity.AddressEntity;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface AddressRepository extends JpaRepository<AddressEntity,Long>{
	
	List<AddressEntity> findAll();
	Optional<AddressEntity> findById(Long id);
}