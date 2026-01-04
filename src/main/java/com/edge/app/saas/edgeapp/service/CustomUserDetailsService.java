package com.edge.app.saas.edgeapp.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.edge.app.saas.edgeapp.config.CustomUserDetails;
import com.edge.app.saas.edgeapp.models.User;
import com.edge.app.saas.edgeapp.repository.UserRepository;


@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByLogin(username);
		
		if(user == null)
		{
			throw new UsernameNotFoundException("user not found");
		}
		return new CustomUserDetails(user);
	}
	

}
