package com.edge.app.saas.edgeapp.controller;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edge.app.saas.edgeapp.config.CustomUserDetails;
import com.edge.app.saas.edgeapp.models.User;
import com.edge.app.saas.edgeapp.models.UserAccountRelation;
import com.edge.app.saas.edgeapp.repository.UserRepository;
import com.edge.app.saas.edgeapp.service.UserAccountRelationService;
import com.edge.app.saas.edgeapp.service.UserService;



@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserAccountRelationService userAccountRelationService;
	
	
	@GetMapping("/hello")
	public String page()
	{
		
		CustomUserDetails customUser =(CustomUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		//System.out.println("user==="+customUser.getUsername());
		User user = userService.findUser(customUser.getUsername()) ;
		int id = user.getId_user();
		List<Map<String,Object>> list = userAccountRelationService.findUserDetails(id);
		int size  =list.size();
		 
		System.out.println("size if result ="+size);
		Map<String,Object> maps =list.get(0);
		System.out.println("acount name chk");
		String account_name =(String) maps.get("NAME");
		System.out.println("acount name ="+account_name);
		String role_name =(String) maps.get("ROLE_NAME");
		Integer id_account =(Integer) maps.get("id_account");
		Integer id_role =(Integer) maps.get("id_role");
		
				
		return "Aller vers la page d'accueil en écrivant le message suivant : Bienvenue "+user.getLogin()+" / "+user.getId_user()+ " dans votre Espace "+account_name+ "/ "+id_account+" avec le ROLE "+role_name+" / "+id_role;
	}
	@GetMapping("/helo")
	public String hello() {
		return "welcome";
	}


}
