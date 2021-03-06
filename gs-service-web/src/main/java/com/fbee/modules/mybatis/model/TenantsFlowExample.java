package com.fbee.modules.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TenantsFlowExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public TenantsFlowExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andTradeFlowNoIsNull() {
			addCriterion("TRADE_FLOW_NO is null");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoIsNotNull() {
			addCriterion("TRADE_FLOW_NO is not null");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoEqualTo(String value) {
			addCriterion("TRADE_FLOW_NO =", value, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoNotEqualTo(String value) {
			addCriterion("TRADE_FLOW_NO <>", value, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoGreaterThan(String value) {
			addCriterion("TRADE_FLOW_NO >", value, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoGreaterThanOrEqualTo(String value) {
			addCriterion("TRADE_FLOW_NO >=", value, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoLessThan(String value) {
			addCriterion("TRADE_FLOW_NO <", value, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoLessThanOrEqualTo(String value) {
			addCriterion("TRADE_FLOW_NO <=", value, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoLike(String value) {
			addCriterion("TRADE_FLOW_NO like", value, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoNotLike(String value) {
			addCriterion("TRADE_FLOW_NO not like", value, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoIn(List<String> values) {
			addCriterion("TRADE_FLOW_NO in", values, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoNotIn(List<String> values) {
			addCriterion("TRADE_FLOW_NO not in", values, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoBetween(String value1, String value2) {
			addCriterion("TRADE_FLOW_NO between", value1, value2, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTradeFlowNoNotBetween(String value1, String value2) {
			addCriterion("TRADE_FLOW_NO not between", value1, value2, "tradeFlowNo");
			return (Criteria) this;
		}

		public Criteria andTenantIdIsNull() {
			addCriterion("TENANT_ID is null");
			return (Criteria) this;
		}

		public Criteria andTenantIdIsNotNull() {
			addCriterion("TENANT_ID is not null");
			return (Criteria) this;
		}

		public Criteria andTenantIdEqualTo(Integer value) {
			addCriterion("TENANT_ID =", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdNotEqualTo(Integer value) {
			addCriterion("TENANT_ID <>", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdGreaterThan(Integer value) {
			addCriterion("TENANT_ID >", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("TENANT_ID >=", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdLessThan(Integer value) {
			addCriterion("TENANT_ID <", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdLessThanOrEqualTo(Integer value) {
			addCriterion("TENANT_ID <=", value, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdIn(List<Integer> values) {
			addCriterion("TENANT_ID in", values, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdNotIn(List<Integer> values) {
			addCriterion("TENANT_ID not in", values, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdBetween(Integer value1, Integer value2) {
			addCriterion("TENANT_ID between", value1, value2, "tenantId");
			return (Criteria) this;
		}

		public Criteria andTenantIdNotBetween(Integer value1, Integer value2) {
			addCriterion("TENANT_ID not between", value1, value2, "tenantId");
			return (Criteria) this;
		}

		public Criteria andOrderNoIsNull() {
			addCriterion("ORDER_NO is null");
			return (Criteria) this;
		}

		public Criteria andOrderNoIsNotNull() {
			addCriterion("ORDER_NO is not null");
			return (Criteria) this;
		}

		public Criteria andOrderNoEqualTo(String value) {
			addCriterion("ORDER_NO =", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotEqualTo(String value) {
			addCriterion("ORDER_NO <>", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoGreaterThan(String value) {
			addCriterion("ORDER_NO >", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
			addCriterion("ORDER_NO >=", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLessThan(String value) {
			addCriterion("ORDER_NO <", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLessThanOrEqualTo(String value) {
			addCriterion("ORDER_NO <=", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLike(String value) {
			addCriterion("ORDER_NO like", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotLike(String value) {
			addCriterion("ORDER_NO not like", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoIn(List<String> values) {
			addCriterion("ORDER_NO in", values, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotIn(List<String> values) {
			addCriterion("ORDER_NO not in", values, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoBetween(String value1, String value2) {
			addCriterion("ORDER_NO between", value1, value2, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotBetween(String value1, String value2) {
			addCriterion("ORDER_NO not between", value1, value2, "orderNo");
			return (Criteria) this;
		}

		public Criteria andPayresultIsNull() {
			addCriterion("PAYRESULT is null");
			return (Criteria) this;
		}

		public Criteria andPayresultIsNotNull() {
			addCriterion("PAYRESULT is not null");
			return (Criteria) this;
		}

		public Criteria andPayresultEqualTo(String value) {
			addCriterion("PAYRESULT =", value, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultNotEqualTo(String value) {
			addCriterion("PAYRESULT <>", value, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultGreaterThan(String value) {
			addCriterion("PAYRESULT >", value, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultGreaterThanOrEqualTo(String value) {
			addCriterion("PAYRESULT >=", value, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultLessThan(String value) {
			addCriterion("PAYRESULT <", value, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultLessThanOrEqualTo(String value) {
			addCriterion("PAYRESULT <=", value, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultLike(String value) {
			addCriterion("PAYRESULT like", value, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultNotLike(String value) {
			addCriterion("PAYRESULT not like", value, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultIn(List<String> values) {
			addCriterion("PAYRESULT in", values, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultNotIn(List<String> values) {
			addCriterion("PAYRESULT not in", values, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultBetween(String value1, String value2) {
			addCriterion("PAYRESULT between", value1, value2, "payresult");
			return (Criteria) this;
		}

		public Criteria andPayresultNotBetween(String value1, String value2) {
			addCriterion("PAYRESULT not between", value1, value2, "payresult");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNull() {
			addCriterion("add_time is null");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNotNull() {
			addCriterion("add_time is not null");
			return (Criteria) this;
		}

		public Criteria andAddTimeEqualTo(Date value) {
			addCriterion("add_time =", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotEqualTo(Date value) {
			addCriterion("add_time <>", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThan(Date value) {
			addCriterion("add_time >", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("add_time >=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThan(Date value) {
			addCriterion("add_time <", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThanOrEqualTo(Date value) {
			addCriterion("add_time <=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeIn(List<Date> values) {
			addCriterion("add_time in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotIn(List<Date> values) {
			addCriterion("add_time not in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeBetween(Date value1, Date value2) {
			addCriterion("add_time between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotBetween(Date value1, Date value2) {
			addCriterion("add_time not between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddAccountIsNull() {
			addCriterion("add_account is null");
			return (Criteria) this;
		}

		public Criteria andAddAccountIsNotNull() {
			addCriterion("add_account is not null");
			return (Criteria) this;
		}

		public Criteria andAddAccountEqualTo(String value) {
			addCriterion("add_account =", value, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountNotEqualTo(String value) {
			addCriterion("add_account <>", value, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountGreaterThan(String value) {
			addCriterion("add_account >", value, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountGreaterThanOrEqualTo(String value) {
			addCriterion("add_account >=", value, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountLessThan(String value) {
			addCriterion("add_account <", value, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountLessThanOrEqualTo(String value) {
			addCriterion("add_account <=", value, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountLike(String value) {
			addCriterion("add_account like", value, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountNotLike(String value) {
			addCriterion("add_account not like", value, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountIn(List<String> values) {
			addCriterion("add_account in", values, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountNotIn(List<String> values) {
			addCriterion("add_account not in", values, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountBetween(String value1, String value2) {
			addCriterion("add_account between", value1, value2, "addAccount");
			return (Criteria) this;
		}

		public Criteria andAddAccountNotBetween(String value1, String value2) {
			addCriterion("add_account not between", value1, value2, "addAccount");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tenants_flow
	 * @mbggenerated  Thu Mar 23 09:41:48 CST 2017
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tenants_flow
     *
     * @mbggenerated do_not_delete_during_merge Thu Mar 16 19:19:42 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}