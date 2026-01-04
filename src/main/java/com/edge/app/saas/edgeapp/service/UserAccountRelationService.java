package com.edge.app.saas.edgeapp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.edge.app.saas.edgeapp.models.UserAccountRelation;
import com.edge.app.saas.edgeapp.repository.UserAccountRelationRepository;

@Service
public class UserAccountRelationService {
	
	@Autowired
	UserAccountRelationRepository userAccountRelationRepository;
	
	
	public List<Map<String,Object>> findUserDetails(int id)
	{
		return userAccountRelationRepository.getUserDetailsById(id);
	}

}
