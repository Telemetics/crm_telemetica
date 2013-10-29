package com.t4u.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T4U_REASON", catalog = "T4U_DB")
public class Reason {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="REASON_ID")
	private int reasonId;
	@Column(name="REASON_CODE")
	private String reasonCode;
	@Column(name="REASON_TEXT")
	private String reasonText;
	@Column(name="ACTIVE_FLAG")
	private String activeFlag;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIMESTAMP")
	private Date createTimestamp;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_TIMESTAMP")
	private Date updateTimestamp;
	@OneToOne
	@JoinColumn(name="CREATED_USER_ID")
	private User createdUser;
	@OneToOne
	@JoinColumn(name="UPDATED_USER_ID")
	private User updatedUser;
	
	public int getReasonId() {
		return reasonId;
	}
	public void setReasonId(int reasonId) {
		this.reasonId = reasonId;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReasonText() {
		return reasonText;
	}
	public void setReasonText(String reasonText) {
		this.reasonText = reasonText;
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
	

}
