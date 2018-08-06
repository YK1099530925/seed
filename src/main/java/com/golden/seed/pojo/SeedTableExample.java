package com.golden.seed.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeedTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeedTableExample() {
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

        public Criteria andSeedCodeIsNull() {
            addCriterion("seed_code is null");
            return (Criteria) this;
        }

        public Criteria andSeedCodeIsNotNull() {
            addCriterion("seed_code is not null");
            return (Criteria) this;
        }

        public Criteria andSeedCodeEqualTo(String value) {
            addCriterion("seed_code =", value, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeNotEqualTo(String value) {
            addCriterion("seed_code <>", value, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeGreaterThan(String value) {
            addCriterion("seed_code >", value, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeGreaterThanOrEqualTo(String value) {
            addCriterion("seed_code >=", value, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeLessThan(String value) {
            addCriterion("seed_code <", value, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeLessThanOrEqualTo(String value) {
            addCriterion("seed_code <=", value, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeLike(String value) {
            addCriterion("seed_code like", value, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeNotLike(String value) {
            addCriterion("seed_code not like", value, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeIn(List<String> values) {
            addCriterion("seed_code in", values, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeNotIn(List<String> values) {
            addCriterion("seed_code not in", values, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeBetween(String value1, String value2) {
            addCriterion("seed_code between", value1, value2, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedCodeNotBetween(String value1, String value2) {
            addCriterion("seed_code not between", value1, value2, "seedCode");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityIsNull() {
            addCriterion("seed_traceability is null");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityIsNotNull() {
            addCriterion("seed_traceability is not null");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityEqualTo(String value) {
            addCriterion("seed_traceability =", value, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityNotEqualTo(String value) {
            addCriterion("seed_traceability <>", value, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityGreaterThan(String value) {
            addCriterion("seed_traceability >", value, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityGreaterThanOrEqualTo(String value) {
            addCriterion("seed_traceability >=", value, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityLessThan(String value) {
            addCriterion("seed_traceability <", value, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityLessThanOrEqualTo(String value) {
            addCriterion("seed_traceability <=", value, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityLike(String value) {
            addCriterion("seed_traceability like", value, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityNotLike(String value) {
            addCriterion("seed_traceability not like", value, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityIn(List<String> values) {
            addCriterion("seed_traceability in", values, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityNotIn(List<String> values) {
            addCriterion("seed_traceability not in", values, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityBetween(String value1, String value2) {
            addCriterion("seed_traceability between", value1, value2, "seedTraceability");
            return (Criteria) this;
        }

        public Criteria andSeedTraceabilityNotBetween(String value1, String value2) {
            addCriterion("seed_traceability not between", value1, value2, "seedTraceability");
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

        public Criteria andSeedNameIsNull() {
            addCriterion("seed_name is null");
            return (Criteria) this;
        }

        public Criteria andSeedNameIsNotNull() {
            addCriterion("seed_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeedNameEqualTo(String value) {
            addCriterion("seed_name =", value, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameNotEqualTo(String value) {
            addCriterion("seed_name <>", value, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameGreaterThan(String value) {
            addCriterion("seed_name >", value, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameGreaterThanOrEqualTo(String value) {
            addCriterion("seed_name >=", value, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameLessThan(String value) {
            addCriterion("seed_name <", value, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameLessThanOrEqualTo(String value) {
            addCriterion("seed_name <=", value, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameLike(String value) {
            addCriterion("seed_name like", value, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameNotLike(String value) {
            addCriterion("seed_name not like", value, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameIn(List<String> values) {
            addCriterion("seed_name in", values, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameNotIn(List<String> values) {
            addCriterion("seed_name not in", values, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameBetween(String value1, String value2) {
            addCriterion("seed_name between", value1, value2, "seedName");
            return (Criteria) this;
        }

        public Criteria andSeedNameNotBetween(String value1, String value2) {
            addCriterion("seed_name not between", value1, value2, "seedName");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIsNull() {
            addCriterion("storage_time is null");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIsNotNull() {
            addCriterion("storage_time is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTimeEqualTo(Date value) {
            addCriterion("storage_time =", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotEqualTo(Date value) {
            addCriterion("storage_time <>", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeGreaterThan(Date value) {
            addCriterion("storage_time >", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("storage_time >=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeLessThan(Date value) {
            addCriterion("storage_time <", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeLessThanOrEqualTo(Date value) {
            addCriterion("storage_time <=", value, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeIn(List<Date> values) {
            addCriterion("storage_time in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotIn(List<Date> values) {
            addCriterion("storage_time not in", values, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeBetween(Date value1, Date value2) {
            addCriterion("storage_time between", value1, value2, "storageTime");
            return (Criteria) this;
        }

        public Criteria andStorageTimeNotBetween(Date value1, Date value2) {
            addCriterion("storage_time not between", value1, value2, "storageTime");
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