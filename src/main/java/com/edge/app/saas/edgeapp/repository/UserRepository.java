package com.edge.app.saas.edgeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edge.app.saas.edgeapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
		
	User findByLogin(String login);
    
}
