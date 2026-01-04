package com.edge.app.saas.edgeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edge.app.saas.edgeapp.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    
}