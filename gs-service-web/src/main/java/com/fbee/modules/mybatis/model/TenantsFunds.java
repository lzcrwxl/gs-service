package com.fbee.modules.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class TenantsFunds {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.TENANT_ID
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.GRAND_TOTAL_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private BigDecimal grandTotalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.TOTAL_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private BigDecimal totalAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.FROZEN_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private BigDecimal frozenAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.AVAILABLE_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private BigDecimal availableAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.add_time
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.add_account
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private String addAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.modify_time
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.modify_account
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private String modifyAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tenants_funds.is_usable
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    private String isUsable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.TENANT_ID
     *
     * @return the value of tenants_funds.TENANT_ID
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.TENANT_ID
     *
     * @param tenantId the value for tenants_funds.TENANT_ID
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.GRAND_TOTAL_AMOUNT
     *
     * @return the value of tenants_funds.GRAND_TOTAL_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public BigDecimal getGrandTotalAmount() {
        return grandTotalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.GRAND_TOTAL_AMOUNT
     *
     * @param grandTotalAmount the value for tenants_funds.GRAND_TOTAL_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setGrandTotalAmount(BigDecimal grandTotalAmount) {
        this.grandTotalAmount = grandTotalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.TOTAL_AMOUNT
     *
     * @return the value of tenants_funds.TOTAL_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.TOTAL_AMOUNT
     *
     * @param totalAmount the value for tenants_funds.TOTAL_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.FROZEN_AMOUNT
     *
     * @return the value of tenants_funds.FROZEN_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.FROZEN_AMOUNT
     *
     * @param frozenAmount the value for tenants_funds.FROZEN_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.AVAILABLE_AMOUNT
     *
     * @return the value of tenants_funds.AVAILABLE_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.AVAILABLE_AMOUNT
     *
     * @param availableAmount the value for tenants_funds.AVAILABLE_AMOUNT
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.add_time
     *
     * @return the value of tenants_funds.add_time
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.add_time
     *
     * @param addTime the value for tenants_funds.add_time
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.add_account
     *
     * @return the value of tenants_funds.add_account
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public String getAddAccount() {
        return addAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.add_account
     *
     * @param addAccount the value for tenants_funds.add_account
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setAddAccount(String addAccount) {
        this.addAccount = addAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.modify_time
     *
     * @return the value of tenants_funds.modify_time
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.modify_time
     *
     * @param modifyTime the value for tenants_funds.modify_time
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.modify_account
     *
     * @return the value of tenants_funds.modify_account
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public String getModifyAccount() {
        return modifyAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.modify_account
     *
     * @param modifyAccount the value for tenants_funds.modify_account
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setModifyAccount(String modifyAccount) {
        this.modifyAccount = modifyAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tenants_funds.is_usable
     *
     * @return the value of tenants_funds.is_usable
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public String getIsUsable() {
        return isUsable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tenants_funds.is_usable
     *
     * @param isUsable the value for tenants_funds.is_usable
     *
     * @mbggenerated Fri Feb 24 16:29:37 CST 2017
     */
    public void setIsUsable(String isUsable) {
        this.isUsable = isUsable;
    }
}