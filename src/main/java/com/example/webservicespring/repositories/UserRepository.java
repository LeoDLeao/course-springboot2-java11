package com.example.webservicespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservicespring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
