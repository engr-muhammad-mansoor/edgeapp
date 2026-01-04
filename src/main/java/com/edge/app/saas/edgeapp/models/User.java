package com.edge.app.saas.edgeapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id_user;
    @Column(nullable = false, length = 50)
    private String login;
    private String password;

    public User() {}

    public User(int id_user, String login, String password) {
        super();
        this.id_user = id_user;
        this.login = login;
        this.password = password;
    }

    public int getId_user() {
        return id_user;
    }

    public String getLogin() { return login; }

    public String getPassword() { return password; }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setLogin(String login) { this.login = login; }

    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return "User [id=" + id_user + ", login=" + login + ", password=" + password + "]";
    }
}
