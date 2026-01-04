package com.edge.app.saas.edgeapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edge.app.saas.edgeapp.models.User;
import com.edge.app.saas.edgeapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	/*
	 * @PersistenceContext private EntityManager entityManager;
	 */

	
	public User findUser(String user)
	{
		return userRepository.findByLogin(user);
	}
	
	
	/*
	 * public List<Object[]> customQuery(int id) { Query nativeQuery =
	 * entityManager.
	 * createNativeQuery("SELECT usr.id_account, acc.NAME, usr.id_role, role.role_name AS ROLE_NAME\r\n"
	 * + "FROM saasapp.user_account_relation usr\r\n" +
	 * "INNER JOIN saasapp.account acc on acc.id_account = usr.id_account\r\n" +
	 * "INNER JOIN saasapp.role role on role.id_role = usr.id_role\r\n" +
	 * "WHERE usr.id_user = :id AND usr.flag_last_connection=1;\r\n" +
	 * "").setParameter("id",id); return nativeQuery.getResultList(); }
	 */

}
