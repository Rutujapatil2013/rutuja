package com.Company.repository;

import org.springframework.stereotype.Repository;
import com.Company.entity.UsersEntity;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,Long>{
	
	List<UsersEntity> findAll();
	Optional<UsersEntity> findById(Long id);
}