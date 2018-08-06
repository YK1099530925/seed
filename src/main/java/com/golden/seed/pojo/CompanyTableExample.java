package com.golden.seed.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneIsNull() {
            addCriterion("company_telephone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneIsNotNull() {
            addCriterion("company_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneEqualTo(String value) {
            addCriterion("company_telephone =", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneNotEqualTo(String value) {
            addCriterion("company_telephone <>", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneGreaterThan(String value) {
            addCriterion("company_telephone >", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_telephone >=", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneLessThan(String value) {
            addCriterion("company_telephone <", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneLessThanOrEqualTo(String value) {
            addCriterion("company_telephone <=", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneLike(String value) {
            addCriterion("company_telephone like", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneNotLike(String value) {
            addCriterion("company_telephone not like", value, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneIn(List<String> values) {
            addCriterion("company_telephone in", values, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneNotIn(List<String> values) {
            addCriterion("company_telephone not in", values, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneBetween(String value1, String value2) {
            addCriterion("company_telephone between", value1, value2, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andCompanyTelephoneNotBetween(String value1, String value2) {
            addCriterion("company_telephone not between", value1, value2, "companyTelephone");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIdIsNull() {
            addCriterion("password_id is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIdIsNotNull() {
            addCriterion("password_id is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordIdEqualTo(String value) {
            addCriterion("password_id =", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdNotEqualTo(String value) {
            addCriterion("password_id <>", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdGreaterThan(String value) {
            addCriterion("password_id >", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdGreaterThanOrEqualTo(String value) {
            addCriterion("password_id >=", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdLessThan(String value) {
            addCriterion("password_id <", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdLessThanOrEqualTo(String value) {
            addCriterion("password_id <=", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdLike(String value) {
            addCriterion("password_id like", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdNotLike(String value) {
            addCriterion("password_id not like", value, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdIn(List<String> values) {
            addCriterion("password_id in", values, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdNotIn(List<String> values) {
            addCriterion("password_id not in", values, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdBetween(String value1, String value2) {
            addCriterion("password_id between", value1, value2, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordIdNotBetween(String value1, String value2) {
            addCriterion("password_id not between", value1, value2, "passwordId");
            return (Criteria) this;
        }

        public Criteria andPasswordTelIsNull() {
            addCriterion("password_tel is null");
            return (Criteria) this;
        }

        public Criteria andPasswordTelIsNotNull() {
            addCriterion("password_tel is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordTelEqualTo(String value) {
            addCriterion("password_tel =", value, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelNotEqualTo(String value) {
            addCriterion("password_tel <>", value, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelGreaterThan(String value) {
            addCriterion("password_tel >", value, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelGreaterThanOrEqualTo(String value) {
            addCriterion("password_tel >=", value, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelLessThan(String value) {
            addCriterion("password_tel <", value, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelLessThanOrEqualTo(String value) {
            addCriterion("password_tel <=", value, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelLike(String value) {
            addCriterion("password_tel like", value, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelNotLike(String value) {
            addCriterion("password_tel not like", value, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelIn(List<String> values) {
            addCriterion("password_tel in", values, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelNotIn(List<String> values) {
            addCriterion("password_tel not in", values, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelBetween(String value1, String value2) {
            addCriterion("password_tel between", value1, value2, "passwordTel");
            return (Criteria) this;
        }

        public Criteria andPasswordTelNotBetween(String value1, String value2) {
            addCriterion("password_tel not between", value1, value2, "passwordTel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}