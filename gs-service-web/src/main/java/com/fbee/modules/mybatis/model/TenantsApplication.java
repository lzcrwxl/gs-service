package com.fbee.modules.mybatis.model;

import java.util.Date;

public class TenantsApplication {
	
	private String idPhotopositive;//身份证照片正面
	private String idPhotonegative;//身份证照片反面
	private String businessName;//工商名称
	private String socialInformationCode;//社会信息代码
	private String accountProperties;//账号性质01：个人账号 02：企业账号
	private String accountName;//账号名称（账号所属人名称）
	private String bankAccount;//银行账号
	private String openingBand;//开户行
	private String openingBandBranch;//开户支行
	private String telephonenumber;//门店电话
	
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.Application_ID
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private Integer applicationId;

	private Integer recommendId;

	public Integer getRecommendId() {
		return recommendId;
	}

	public void setRecommendId(Integer recommendId) {
		this.recommendId = recommendId;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.TENANT_NAME
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String tenantName;

	private String tenantStatus;

	public String getTenantStatus() {
		return tenantStatus;
	}

	public void setTenantStatus(String tenantStatus) {
		this.tenantStatus = tenantStatus;
	}

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.REGISTER_PHONE
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String registerPhone;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.privince
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String privince;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.city
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String city;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.area
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String area;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.CONTACT_ADDRESS
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String contactAddress;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.agent_name
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String agentName;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.id_type
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String idType;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.id_number
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String idNumber;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.licence_img
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String licenceImg;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.remarks
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String remarks;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.add_time
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private Date addTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.add_account
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String addAccount;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.modify_time
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private Date modifyTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column tenants_application.modify_account
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	private String modifyAccount;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.Application_ID
	 *
	 * @return the value of tenants_application.Application_ID
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public Integer getApplicationId() {
		return applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.Application_ID
	 *
	 * @param applicationId
	 *            the value for tenants_application.Application_ID
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.TENANT_NAME
	 *
	 * @return the value of tenants_application.TENANT_NAME
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getTenantName() {
		return tenantName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.TENANT_NAME
	 *
	 * @param tenantName
	 *            the value for tenants_application.TENANT_NAME
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.REGISTER_PHONE
	 *
	 * @return the value of tenants_application.REGISTER_PHONE
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getRegisterPhone() {
		return registerPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.REGISTER_PHONE
	 *
	 * @param registerPhone
	 *            the value for tenants_application.REGISTER_PHONE
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setRegisterPhone(String registerPhone) {
		this.registerPhone = registerPhone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.privince
	 *
	 * @return the value of tenants_application.privince
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getPrivince() {
		return privince;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.privince
	 *
	 * @param privince
	 *            the value for tenants_application.privince
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setPrivince(String privince) {
		this.privince = privince;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.city
	 *
	 * @return the value of tenants_application.city
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getCity() {
		return city;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.city
	 *
	 * @param city
	 *            the value for tenants_application.city
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.area
	 *
	 * @return the value of tenants_application.area
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getArea() {
		return area;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.area
	 *
	 * @param area
	 *            the value for tenants_application.area
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.CONTACT_ADDRESS
	 *
	 * @return the value of tenants_application.CONTACT_ADDRESS
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getContactAddress() {
		return contactAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.CONTACT_ADDRESS
	 *
	 * @param contactAddress
	 *            the value for tenants_application.CONTACT_ADDRESS
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.agent_name
	 *
	 * @return the value of tenants_application.agent_name
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.agent_name
	 *
	 * @param agentName
	 *            the value for tenants_application.agent_name
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.id_type
	 *
	 * @return the value of tenants_application.id_type
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.id_type
	 *
	 * @param idType
	 *            the value for tenants_application.id_type
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.id_number
	 *
	 * @return the value of tenants_application.id_number
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.id_number
	 *
	 * @param idNumber
	 *            the value for tenants_application.id_number
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.licence_img
	 *
	 * @return the value of tenants_application.licence_img
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getLicenceImg() {
		return licenceImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.licence_img
	 *
	 * @param licenceImg
	 *            the value for tenants_application.licence_img
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setLicenceImg(String licenceImg) {
		this.licenceImg = licenceImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.remarks
	 *
	 * @return the value of tenants_application.remarks
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.remarks
	 *
	 * @param remarks
	 *            the value for tenants_application.remarks
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.add_time
	 *
	 * @return the value of tenants_application.add_time
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.add_time
	 *
	 * @param addTime
	 *            the value for tenants_application.add_time
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.add_account
	 *
	 * @return the value of tenants_application.add_account
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getAddAccount() {
		return addAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.add_account
	 *
	 * @param addAccount
	 *            the value for tenants_application.add_account
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setAddAccount(String addAccount) {
		this.addAccount = addAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.modify_time
	 *
	 * @return the value of tenants_application.modify_time
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.modify_time
	 *
	 * @param modifyTime
	 *            the value for tenants_application.modify_time
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column tenants_application.modify_account
	 *
	 * @return the value of tenants_application.modify_account
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public String getModifyAccount() {
		return modifyAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column tenants_application.modify_account
	 *
	 * @param modifyAccount
	 *            the value for tenants_application.modify_account
	 *
	 * @mbggenerated Mon Mar 27 09:29:34 CST 2017
	 */
	public void setModifyAccount(String modifyAccount) {
		this.modifyAccount = modifyAccount;
	}

	
	//以下为新增字段
	

	public String getBusinessName() {
		return businessName;
	}

	public String getIdPhotopositive() {
		return idPhotopositive;
	}

	public void setIdPhotopositive(String idPhotopositive) {
		this.idPhotopositive = idPhotopositive;
	}

	public String getIdPhotonegative() {
		return idPhotonegative;
	}

	public void setIdPhotonegative(String idPhotonegative) {
		this.idPhotonegative = idPhotonegative;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getSocialInformationCode() {
		return socialInformationCode;
	}

	public void setSocialInformationCode(String socialInformationCode) {
		this.socialInformationCode = socialInformationCode;
	}

	public String getAccountProperties() {
		return accountProperties;
	}

	public void setAccountProperties(String accountProperties) {
		this.accountProperties = accountProperties;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getOpeningBand() {
		return openingBand;
	}

	public void setOpeningBand(String openingBand) {
		this.openingBand = openingBand;
	}

	public String getTelephonenumber() {
		return telephonenumber;
	}

	public void setTelephonenumber(String telephonenumber) {
		this.telephonenumber = telephonenumber;
	}

	public String getOpeningBandBranch() {
		return openingBandBranch;
	}

	public void setOpeningBandBranch(String openingBandBranch) {
		this.openingBandBranch = openingBandBranch;
	}
	
	
}