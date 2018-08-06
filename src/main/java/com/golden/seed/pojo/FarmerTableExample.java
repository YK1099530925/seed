package com.golden.seed.pojo;

import java.util.ArrayList;
import java.util.List;

public class FarmerTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FarmerTableExample() {
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

        public Criteria andFarmersAddressIsNull() {
            addCriterion("farmers_address is null");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressIsNotNull() {
            addCriterion("farmers_address is not null");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressEqualTo(String value) {
            addCriterion("farmers_address =", value, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressNotEqualTo(String value) {
            addCriterion("farmers_address <>", value, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressGreaterThan(String value) {
            addCriterion("farmers_address >", value, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressGreaterThanOrEqualTo(String value) {
            addCriterion("farmers_address >=", value, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressLessThan(String value) {
            addCriterion("farmers_address <", value, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressLessThanOrEqualTo(String value) {
            addCriterion("farmers_address <=", value, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressLike(String value) {
            addCriterion("farmers_address like", value, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressNotLike(String value) {
            addCriterion("farmers_address not like", value, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressIn(List<String> values) {
            addCriterion("farmers_address in", values, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressNotIn(List<String> values) {
            addCriterion("farmers_address not in", values, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressBetween(String value1, String value2) {
            addCriterion("farmers_address between", value1, value2, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersAddressNotBetween(String value1, String value2) {
            addCriterion("farmers_address not between", value1, value2, "farmersAddress");
            return (Criteria) this;
        }

        public Criteria andFarmersIdIsNull() {
            addCriterion("farmers_id is null");
            return (Criteria) this;
        }

        public Criteria andFarmersIdIsNotNull() {
            addCriterion("farmers_id is not null");
            return (Criteria) this;
        }

        public Criteria andFarmersIdEqualTo(String value) {
            addCriterion("farmers_id =", value, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdNotEqualTo(String value) {
            addCriterion("farmers_id <>", value, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdGreaterThan(String value) {
            addCriterion("farmers_id >", value, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdGreaterThanOrEqualTo(String value) {
            addCriterion("farmers_id >=", value, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdLessThan(String value) {
            addCriterion("farmers_id <", value, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdLessThanOrEqualTo(String value) {
            addCriterion("farmers_id <=", value, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdLike(String value) {
            addCriterion("farmers_id like", value, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdNotLike(String value) {
            addCriterion("farmers_id not like", value, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdIn(List<String> values) {
            addCriterion("farmers_id in", values, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdNotIn(List<String> values) {
            addCriterion("farmers_id not in", values, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdBetween(String value1, String value2) {
            addCriterion("farmers_id between", value1, value2, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersIdNotBetween(String value1, String value2) {
            addCriterion("farmers_id not between", value1, value2, "farmersId");
            return (Criteria) this;
        }

        public Criteria andFarmersNameIsNull() {
            addCriterion("farmers_name is null");
            return (Criteria) this;
        }

        public Criteria andFarmersNameIsNotNull() {
            addCriterion("farmers_name is not null");
            return (Criteria) this;
        }

        public Criteria andFarmersNameEqualTo(String value) {
            addCriterion("farmers_name =", value, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameNotEqualTo(String value) {
            addCriterion("farmers_name <>", value, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameGreaterThan(String value) {
            addCriterion("farmers_name >", value, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameGreaterThanOrEqualTo(String value) {
            addCriterion("farmers_name >=", value, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameLessThan(String value) {
            addCriterion("farmers_name <", value, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameLessThanOrEqualTo(String value) {
            addCriterion("farmers_name <=", value, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameLike(String value) {
            addCriterion("farmers_name like", value, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameNotLike(String value) {
            addCriterion("farmers_name not like", value, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameIn(List<String> values) {
            addCriterion("farmers_name in", values, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameNotIn(List<String> values) {
            addCriterion("farmers_name not in", values, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameBetween(String value1, String value2) {
            addCriterion("farmers_name between", value1, value2, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersNameNotBetween(String value1, String value2) {
            addCriterion("farmers_name not between", value1, value2, "farmersName");
            return (Criteria) this;
        }

        public Criteria andFarmersSexIsNull() {
            addCriterion("farmers_sex is null");
            return (Criteria) this;
        }

        public Criteria andFarmersSexIsNotNull() {
            addCriterion("farmers_sex is not null");
            return (Criteria) this;
        }

        public Criteria andFarmersSexEqualTo(String value) {
            addCriterion("farmers_sex =", value, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexNotEqualTo(String value) {
            addCriterion("farmers_sex <>", value, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexGreaterThan(String value) {
            addCriterion("farmers_sex >", value, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexGreaterThanOrEqualTo(String value) {
            addCriterion("farmers_sex >=", value, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexLessThan(String value) {
            addCriterion("farmers_sex <", value, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexLessThanOrEqualTo(String value) {
            addCriterion("farmers_sex <=", value, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexLike(String value) {
            addCriterion("farmers_sex like", value, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexNotLike(String value) {
            addCriterion("farmers_sex not like", value, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexIn(List<String> values) {
            addCriterion("farmers_sex in", values, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexNotIn(List<String> values) {
            addCriterion("farmers_sex not in", values, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexBetween(String value1, String value2) {
            addCriterion("farmers_sex between", value1, value2, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersSexNotBetween(String value1, String value2) {
            addCriterion("farmers_sex not between", value1, value2, "farmersSex");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneIsNull() {
            addCriterion("farmers_telephone is null");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneIsNotNull() {
            addCriterion("farmers_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneEqualTo(String value) {
            addCriterion("farmers_telephone =", value, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneNotEqualTo(String value) {
            addCriterion("farmers_telephone <>", value, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneGreaterThan(String value) {
            addCriterion("farmers_telephone >", value, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("farmers_telephone >=", value, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneLessThan(String value) {
            addCriterion("farmers_telephone <", value, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneLessThanOrEqualTo(String value) {
            addCriterion("farmers_telephone <=", value, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneLike(String value) {
            addCriterion("farmers_telephone like", value, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneNotLike(String value) {
            addCriterion("farmers_telephone not like", value, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneIn(List<String> values) {
            addCriterion("farmers_telephone in", values, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneNotIn(List<String> values) {
            addCriterion("farmers_telephone not in", values, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneBetween(String value1, String value2) {
            addCriterion("farmers_telephone between", value1, value2, "farmersTelephone");
            return (Criteria) this;
        }

        public Criteria andFarmersTelephoneNotBetween(String value1, String value2) {
            addCriterion("farmers_telephone not between", value1, value2, "farmersTelephone");
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