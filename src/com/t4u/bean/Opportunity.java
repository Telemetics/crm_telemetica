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
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * T4uOppurtunity generated by hbm2java
 */
@Entity
@Table(name = "T4U_OPPORTUNITY", catalog = "T4U_DB")
public class Opportunity implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="OPPORTUNITY_ID")
	private int oppurtunityId;
	@Column(name="OPPORTUNITY_NAME")
	private String oppurtunityName;
	@Column(name="NO_OF_VEHICLES")
	private Integer numberOfVehicles;
	@Temporal(TemporalType.DATE)
	@Column(name="EXPECTED_CLOSURE_DATE")
	private Date expectedClosureDate;
	@Column(name="REMARK")
	private String remark;
	@Column(name="DESCRIPTION")
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIMESTAMP")
	private Date createTimestamp;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_TIMESTAMP")
	private Date updateTimestamp;
	@Column(name="ACTIVE_FLAG")
	private String activeFlag;
	@Column(name="CONTACT_PERSON")
	private String contactPerson;
	
	@Column(name = "TELEPHONE_1")
	private String mobile;
	@Column(name = "TELEPHONE_2")
	private String telephone2;
	@Column(name = "FAX")
	private String fax;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="COUNTRY")
	private String country;
	@Column(name = "PINCODE")
	private Integer pincode;

	@OneToOne
	@JoinColumn(name="CREATED_USER_ID")
	private User createdUser;
	@OneToOne
	@JoinColumn(name="UPDATED_USER_ID")
	private User updatedUser;
	@ManyToOne
	@JoinColumn(name="CUSTOMER_ID")
	private Customer customer;
	@ManyToOne
	@JoinColumn(name="VERTICAL_ID")
	private Vertical vertical;
	@ManyToOne
	@JoinColumn(name="ACCOUNT_ID")
	private Account account;
	@ManyToOne
	@JoinColumn(name="STATUS_ID")
	private WorkStatus workStatus;
	@OneToOne
	@JoinColumn(name="STAGE_ID")
	private Stage stage;
	@OneToOne
	@JoinColumn(name="REASON_ID")
	private Reason reason;
	@OneToOne
	@JoinColumn(name = "AREA_ID")
	private Area area;
	@OneToOne
	@JoinColumn(name = "REGION_ID")
	private Region region;
	@OneToOne
	@JoinColumn(name="ZONE_ID")
	private Zone zone;
	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

	public int getOppurtunityId() {
		return oppurtunityId;
	}

	public void setOppurtunityId(int oppurtunityId) {
		this.oppurtunityId = oppurtunityId;
	}

	public Integer getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicles(Integer numberOfVehicles) {
		this.numberOfVehicles = numberOfVehicles;
	}

	

	public Date getExpectedClosureDate() {
		return expectedClosureDate;
	}

	public void setExpectedClosureDate(Date expectedClosureDate) {
		this.expectedClosureDate = expectedClosureDate;
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

	public String getOppurtunityName() {
		return oppurtunityName;
	}

	public void setOppurtunityName(String oppurtunityName) {
		this.oppurtunityName = oppurtunityName;
	}

	public Date getUpdateTimestamp() {
		return updateTimestamp;
	}

	public void setUpdateTimestamp(Date updateTimestamp) {
		this.updateTimestamp = updateTimestamp;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public User getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(User createdUser) {
		this.createdUser = createdUser;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public User getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(User updatedUser) {
		this.updatedUser = updatedUser;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone2() {
		return telephone2;
	}

	public void setTelephone2(String telephone2) {
		this.telephone2 = telephone2;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Vertical getVertical() {
		return vertical;
	}

	public void setVertical(Vertical vertical) {
		this.vertical = vertical;
	}

	public WorkStatus getWorkStatus() {
		return workStatus;
	}

	public void setWorkStatus(WorkStatus workStatus) {
		this.workStatus = workStatus;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public Reason getReason() {
		return reason;
	}

	public void setReason(Reason reason) {
		this.reason = reason;
	}

}
