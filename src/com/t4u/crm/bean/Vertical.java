package com.t4u.crm.bean;// default package
// Generated Oct 18, 2013 10:45:48 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T4uVertical generated by hbm2java
 */
@Entity
@Table(name = "t4u_vertical", catalog = "t4u_db")
public class Vertical implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int verticalId;
	@OneToMany(mappedBy="vertical")
	private Set<Account> accounts=new HashSet<Account>();
	private String verticalName;
	private String verticalType;
	private String description;
	private String activeFlag;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;

	@ManyToOne
	private User createdUser;
	@ManyToOne
	private User updatedUser;
	/*@OneToMany(mappedBy="vertical")
	private Set<Account> accounts=new HashSet<Account>();*/
	@OneToOne
	private Oppurtunity oppurtunity;
	
	public int getVerticalId() {
		return verticalId;
	}
	public void setVerticalId(int verticalId) {
		this.verticalId = verticalId;
	}
	
	public String getVerticalName() {
		return verticalName;
	}
	public void setVerticalName(String verticalName) {
		this.verticalName = verticalName;
	}
	public String getVerticalType() {
		return verticalType;
	}
	public void setVerticalType(String verticalType) {
		this.verticalType = verticalType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public Date getCreateTimestamp() {
		return createTimestamp;
	}
	public void setCreateTimestamp(Date createTimestamp) {
		this.createTimestamp = createTimestamp;
	}
	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}
	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
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
	/*public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}*/
	public Oppurtunity getOppurtunity() {
		return oppurtunity;
	}
	public void setOppurtunity(Oppurtunity oppurtunity) {
		this.oppurtunity = oppurtunity;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}

}
