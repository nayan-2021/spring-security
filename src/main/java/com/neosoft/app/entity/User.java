package com.neosoft.app.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name="User")
@AllArgsConstructor	
@NoArgsConstructor
@ToString
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String username;
	private String email;
	private String password;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_roles",joinColumns = @JoinColumn(name="user_id"),
	inverseJoinColumns = @JoinColumn(name="role_id"))
	private Set<Role> role=new HashSet<Role>();
	
	public User(String username,String email,String password)
	{
		this.username=username;
		this.email=email;
		this.password=password;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getRoles() {
		return role;
	}
	public void setRoles(Set<Role> role) {
		this.role = role;
	}
	

}
