package com.t4u.bean;// default package
// Generated Oct 18, 2013 10:45:48 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T4uSupport generated by hbm2java
 */
@Entity
@Table(name = "T4U_SUPPORT", catalog = "T4U_DB")
public class Support implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SUPPORT_ID")
	private int supportId;
	@Column(name = "SUPPORT_TYPE")
	private String supportType;
	@Column(name = "SUPPORT_NAME")
	private String supportName;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "ETA")
	private String eta;
	@OneToOne
	@JoinColumn(name="STATUS_ID")
	private WorkStatus workStatus;
	public WorkStatus getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(WorkStatus workStatus) {
		this.workStatus = workStatus;
	}

	@Column(name = "CLOSURE_NOTE")
	private String closureNote;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIMESTAMP")
	private Date createTimestamp;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIMESTAMP")
	private Date updateTimestamp;
	@OneToOne
	@JoinColumn(name = "CREATED_USER_ID")
	private User createdUser;
	@OneToOne
	@JoinColumn(name = "UPDATED_USER_ID")
	private User updatedUser;
	@OneToOne
	@JoinColumn(name="REQUESTED_USER_ID")
	private User requestedUser;
	@OneToOne
	@JoinColumn(name="ASSIGNED_USER_ID")
	private User assignedUser;

	public int getSupportId() {
		return supportId;
	}

	public void setSupportId(int supportId) {
		this.supportId = supportId;
	}

	public String getSupportType() {
		return supportType;
	}

	public void setSupportType(String supportType) {
		this.supportType = supportType;
	}

	public String getSupportName() {
		return supportName;
	}

	public void setSupportName(String supportName) {
		this.supportName = supportName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	

	public String getClosureNote() {
		return closureNote;
	}

	public void setClosureNote(String closureNote) {
		this.closureNote = closureNote;
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

	public User getRequestedUser() {
		return requestedUser;
	}

	public void setRequestedUser(User requestedUser) {
		this.requestedUser = requestedUser;
	}

	public User getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(User assignedUser) {
		this.assignedUser = assignedUser;
	}

	public User getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(User updatedUser) {
		this.updatedUser = updatedUser;
	}

}
