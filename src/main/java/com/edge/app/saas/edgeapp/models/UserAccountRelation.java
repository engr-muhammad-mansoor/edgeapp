package com.edge.app.saas.edgeapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_account_relation")
public class UserAccountRelation implements Serializable  {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(nullable = false , name="uar_id")
	private int uar_id;
	
    
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    
    @ManyToOne
    @JoinColumn(name = "id_account")
    private Account account;


    @ManyToOne
    @JoinColumn(name = "id_role")
    private Role role;

    private boolean flagLastConnection;

    public UserAccountRelation() {
    }

    public UserAccountRelation(User user, Account account, Role role, boolean flagLastConnection) {
        this.user = user;
        this.account = account;
        this.role = role;
        this.flagLastConnection = flagLastConnection;
    }

    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean getFlagLastConnection() {
        return flagLastConnection;
    }

    public void setFlagLastConnection(boolean flagLastConnection) {
        this.flagLastConnection = flagLastConnection;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
