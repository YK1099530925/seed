package com.golden.seed.pojo;

import java.util.ArrayList;
import java.util.List;

public class LandTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LandTableExample() {
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

        public Criteria andFarmerIdIsNull() {
            addCriterion("farmer_id is null");
            return (Criteria) this;
        }

        public Criteria andFarmerIdIsNotNull() {
            addCriterion("farmer_id is not null");
            return (Criteria) this;
        }

        public Criteria andFarmerIdEqualTo(String value) {
            addCriterion("farmer_id =", value, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdNotEqualTo(String value) {
            addCriterion("farmer_id <>", value, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdGreaterThan(String value) {
            addCriterion("farmer_id >", value, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdGreaterThanOrEqualTo(String value) {
            addCriterion("farmer_id >=", value, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdLessThan(String value) {
            addCriterion("farmer_id <", value, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdLessThanOrEqualTo(String value) {
            addCriterion("farmer_id <=", value, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdLike(String value) {
            addCriterion("farmer_id like", value, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdNotLike(String value) {
            addCriterion("farmer_id not like", value, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdIn(List<String> values) {
            addCriterion("farmer_id in", values, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdNotIn(List<String> values) {
            addCriterion("farmer_id not in", values, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdBetween(String value1, String value2) {
            addCriterion("farmer_id between", value1, value2, "farmerId");
            return (Criteria) this;
        }

        public Criteria andFarmerIdNotBetween(String value1, String value2) {
            addCriterion("farmer_id not between", value1, value2, "farmerId");
            return (Criteria) this;
        }

        public Criteria andLandAddressIsNull() {
            addCriterion("land_address is null");
            return (Criteria) this;
        }

        public Criteria andLandAddressIsNotNull() {
            addCriterion("land_address is not null");
            return (Criteria) this;
        }

        public Criteria andLandAddressEqualTo(String value) {
            addCriterion("land_address =", value, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressNotEqualTo(String value) {
            addCriterion("land_address <>", value, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressGreaterThan(String value) {
            addCriterion("land_address >", value, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressGreaterThanOrEqualTo(String value) {
            addCriterion("land_address >=", value, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressLessThan(String value) {
            addCriterion("land_address <", value, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressLessThanOrEqualTo(String value) {
            addCriterion("land_address <=", value, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressLike(String value) {
            addCriterion("land_address like", value, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressNotLike(String value) {
            addCriterion("land_address not like", value, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressIn(List<String> values) {
            addCriterion("land_address in", values, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressNotIn(List<String> values) {
            addCriterion("land_address not in", values, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressBetween(String value1, String value2) {
            addCriterion("land_address between", value1, value2, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandAddressNotBetween(String value1, String value2) {
            addCriterion("land_address not between", value1, value2, "landAddress");
            return (Criteria) this;
        }

        public Criteria andLandIdIsNull() {
            addCriterion("land_id is null");
            return (Criteria) this;
        }

        public Criteria andLandIdIsNotNull() {
            addCriterion("land_id is not null");
            return (Criteria) this;
        }

        public Criteria andLandIdEqualTo(String value) {
            addCriterion("land_id =", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotEqualTo(String value) {
            addCriterion("land_id <>", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdGreaterThan(String value) {
            addCriterion("land_id >", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdGreaterThanOrEqualTo(String value) {
            addCriterion("land_id >=", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdLessThan(String value) {
            addCriterion("land_id <", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdLessThanOrEqualTo(String value) {
            addCriterion("land_id <=", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdLike(String value) {
            addCriterion("land_id like", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotLike(String value) {
            addCriterion("land_id not like", value, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdIn(List<String> values) {
            addCriterion("land_id in", values, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotIn(List<String> values) {
            addCriterion("land_id not in", values, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdBetween(String value1, String value2) {
            addCriterion("land_id between", value1, value2, "landId");
            return (Criteria) this;
        }

        public Criteria andLandIdNotBetween(String value1, String value2) {
            addCriterion("land_id not between", value1, value2, "landId");
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