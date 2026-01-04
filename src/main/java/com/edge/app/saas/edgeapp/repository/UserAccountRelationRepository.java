package com.edge.app.saas.edgeapp.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.edge.app.saas.edgeapp.models.UserAccountRelation;

@Repository
public interface UserAccountRelationRepository extends JpaRepository<UserAccountRelation, Integer> {
	
	
	@Query(value = "SELECT usr.id_account, acc.NAME, usr.id_role, role.role_name AS ROLE_NAME FROM saasapp.user_account_relation usr INNER JOIN saasapp.account acc on acc.id_account = usr.id_account INNER JOIN saasapp.role role on role.id_role = usr.id_role WHERE usr.id_user =:id AND usr.flag_last_connection=1",nativeQuery = true)
	public List<Map<String,Object>> getUserDetailsById(@Param("id") int id);
    
}
