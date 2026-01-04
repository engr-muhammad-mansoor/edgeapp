package com.edge.app.saas.edgeapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idRole;
    
    @Column(nullable = false, length = 50)
	private String role_name;
	@Column(nullable = false)
	private String role_description;

    public Role() {}

    public Role(int idRole, String role_name, String role_description) {
        super();
        this.idRole = idRole;
        this.role_name = role_name;
        this.role_description = role_description;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int id_role) {
        this.idRole = id_role;
    }

    public String getRole_description() {
        return role_description;
    }

    public void setRole_description(String role_description) {
        this.role_description = role_description;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) { this.role_name = role_name; }
}
