package com.t4u.crm.bean;// default package
// Generated Oct 18, 2013 10:45:48 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * T4uUserRoles generated by hbm2java
 */
@Entity
@Table(name = "t4u_user_roles", catalog = "t4u_db")
public class UserRole implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userRoleId;
	private String userRole;
	private String description;
	
	@ManyToOne
	private User createdUser;
	@ManyToOne
	private User updatedUser;
	
	@OneToMany(mappedBy="userRole",fetch=FetchType.LAZY)
	private Set<User> t4uUsers = new HashSet<User>(0);
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<User> getT4uUsers() {
		return t4uUsers;
	}
	public void setT4uUsers(Set<User> t4uUsers) {
		this.t4uUsers = t4uUsers;
	}
	public User getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(User createdUser) {
		this.createdUser = createdUser;
	}
	public User getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(User updatedUser) {
		this.updatedUser = updatedUser;
	}

}