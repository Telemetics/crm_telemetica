package com.t4u.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t4u_reason", catalog = "t4u_db")
public class Reason {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reasonId;
	private String reasonCode;
	private String reasonText;
	@Column( columnDefinition = "TINYINT(1)")
	private boolean activeFlag;
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTimestamp;
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTimestamp;
	@OneToOne
	private User createdUser;
	@OneToOne
	private User updatedUser;
	@OneToOne
	private Oppurtunity oppurtunity;
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
	public boolean isActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(boolean activeFlag) {
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
	public Oppurtunity getOppurtunity() {
		return oppurtunity;
	}
	public void setOppurtunity(Oppurtunity oppurtunity) {
		this.oppurtunity = oppurtunity;
	}

}
