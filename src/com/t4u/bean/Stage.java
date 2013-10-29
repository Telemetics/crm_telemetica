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
@Table(name = "T4U_STAGE", catalog = "T4U_DB")
public class Stage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="STAGE_ID")
	private int stageId;
	@Column(name="STAGE_NAME")
	private String stageName;
	@Column(name="DESCRIPTION")
	private String description;
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
	

	public int getStageId() {
		return stageId;
	}

	public void setStageId(int stageId) {
		this.stageId = stageId;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
}
