package com.golden.seed.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventTableExample() {
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

        public Criteria andEventArticleTypeIsNull() {
            addCriterion("event_article_type is null");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeIsNotNull() {
            addCriterion("event_article_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeEqualTo(String value) {
            addCriterion("event_article_type =", value, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeNotEqualTo(String value) {
            addCriterion("event_article_type <>", value, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeGreaterThan(String value) {
            addCriterion("event_article_type >", value, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("event_article_type >=", value, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeLessThan(String value) {
            addCriterion("event_article_type <", value, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeLessThanOrEqualTo(String value) {
            addCriterion("event_article_type <=", value, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeLike(String value) {
            addCriterion("event_article_type like", value, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeNotLike(String value) {
            addCriterion("event_article_type not like", value, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeIn(List<String> values) {
            addCriterion("event_article_type in", values, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeNotIn(List<String> values) {
            addCriterion("event_article_type not in", values, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeBetween(String value1, String value2) {
            addCriterion("event_article_type between", value1, value2, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleTypeNotBetween(String value1, String value2) {
            addCriterion("event_article_type not between", value1, value2, "eventArticleType");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseIsNull() {
            addCriterion("event_article_use is null");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseIsNotNull() {
            addCriterion("event_article_use is not null");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseEqualTo(String value) {
            addCriterion("event_article_use =", value, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseNotEqualTo(String value) {
            addCriterion("event_article_use <>", value, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseGreaterThan(String value) {
            addCriterion("event_article_use >", value, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseGreaterThanOrEqualTo(String value) {
            addCriterion("event_article_use >=", value, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseLessThan(String value) {
            addCriterion("event_article_use <", value, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseLessThanOrEqualTo(String value) {
            addCriterion("event_article_use <=", value, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseLike(String value) {
            addCriterion("event_article_use like", value, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseNotLike(String value) {
            addCriterion("event_article_use not like", value, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseIn(List<String> values) {
            addCriterion("event_article_use in", values, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseNotIn(List<String> values) {
            addCriterion("event_article_use not in", values, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseBetween(String value1, String value2) {
            addCriterion("event_article_use between", value1, value2, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventArticleUseNotBetween(String value1, String value2) {
            addCriterion("event_article_use not between", value1, value2, "eventArticleUse");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrIsNull() {
            addCriterion("event_happen_addr is null");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrIsNotNull() {
            addCriterion("event_happen_addr is not null");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrEqualTo(String value) {
            addCriterion("event_happen_addr =", value, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrNotEqualTo(String value) {
            addCriterion("event_happen_addr <>", value, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrGreaterThan(String value) {
            addCriterion("event_happen_addr >", value, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrGreaterThanOrEqualTo(String value) {
            addCriterion("event_happen_addr >=", value, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrLessThan(String value) {
            addCriterion("event_happen_addr <", value, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrLessThanOrEqualTo(String value) {
            addCriterion("event_happen_addr <=", value, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrLike(String value) {
            addCriterion("event_happen_addr like", value, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrNotLike(String value) {
            addCriterion("event_happen_addr not like", value, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrIn(List<String> values) {
            addCriterion("event_happen_addr in", values, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrNotIn(List<String> values) {
            addCriterion("event_happen_addr not in", values, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrBetween(String value1, String value2) {
            addCriterion("event_happen_addr between", value1, value2, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenAddrNotBetween(String value1, String value2) {
            addCriterion("event_happen_addr not between", value1, value2, "eventHappenAddr");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeIsNull() {
            addCriterion("event_happen_time is null");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeIsNotNull() {
            addCriterion("event_happen_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeEqualTo(Date value) {
            addCriterion("event_happen_time =", value, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeNotEqualTo(Date value) {
            addCriterion("event_happen_time <>", value, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeGreaterThan(Date value) {
            addCriterion("event_happen_time >", value, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_happen_time >=", value, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeLessThan(Date value) {
            addCriterion("event_happen_time <", value, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_happen_time <=", value, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeIn(List<Date> values) {
            addCriterion("event_happen_time in", values, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeNotIn(List<Date> values) {
            addCriterion("event_happen_time not in", values, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeBetween(Date value1, Date value2) {
            addCriterion("event_happen_time between", value1, value2, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventHappenTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_happen_time not between", value1, value2, "eventHappenTime");
            return (Criteria) this;
        }

        public Criteria andEventRecorderIsNull() {
            addCriterion("event_recorder is null");
            return (Criteria) this;
        }

        public Criteria andEventRecorderIsNotNull() {
            addCriterion("event_recorder is not null");
            return (Criteria) this;
        }

        public Criteria andEventRecorderEqualTo(String value) {
            addCriterion("event_recorder =", value, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderNotEqualTo(String value) {
            addCriterion("event_recorder <>", value, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderGreaterThan(String value) {
            addCriterion("event_recorder >", value, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderGreaterThanOrEqualTo(String value) {
            addCriterion("event_recorder >=", value, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderLessThan(String value) {
            addCriterion("event_recorder <", value, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderLessThanOrEqualTo(String value) {
            addCriterion("event_recorder <=", value, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderLike(String value) {
            addCriterion("event_recorder like", value, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderNotLike(String value) {
            addCriterion("event_recorder not like", value, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderIn(List<String> values) {
            addCriterion("event_recorder in", values, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderNotIn(List<String> values) {
            addCriterion("event_recorder not in", values, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderBetween(String value1, String value2) {
            addCriterion("event_recorder between", value1, value2, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderNotBetween(String value1, String value2) {
            addCriterion("event_recorder not between", value1, value2, "eventRecorder");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyIsNull() {
            addCriterion("event_recorder_company is null");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyIsNotNull() {
            addCriterion("event_recorder_company is not null");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyEqualTo(String value) {
            addCriterion("event_recorder_company =", value, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyNotEqualTo(String value) {
            addCriterion("event_recorder_company <>", value, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyGreaterThan(String value) {
            addCriterion("event_recorder_company >", value, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("event_recorder_company >=", value, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyLessThan(String value) {
            addCriterion("event_recorder_company <", value, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyLessThanOrEqualTo(String value) {
            addCriterion("event_recorder_company <=", value, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyLike(String value) {
            addCriterion("event_recorder_company like", value, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyNotLike(String value) {
            addCriterion("event_recorder_company not like", value, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyIn(List<String> values) {
            addCriterion("event_recorder_company in", values, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyNotIn(List<String> values) {
            addCriterion("event_recorder_company not in", values, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyBetween(String value1, String value2) {
            addCriterion("event_recorder_company between", value1, value2, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRecorderCompanyNotBetween(String value1, String value2) {
            addCriterion("event_recorder_company not between", value1, value2, "eventRecorderCompany");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelIsNull() {
            addCriterion("event_relevant_personnel is null");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelIsNotNull() {
            addCriterion("event_relevant_personnel is not null");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelEqualTo(String value) {
            addCriterion("event_relevant_personnel =", value, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelNotEqualTo(String value) {
            addCriterion("event_relevant_personnel <>", value, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelGreaterThan(String value) {
            addCriterion("event_relevant_personnel >", value, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelGreaterThanOrEqualTo(String value) {
            addCriterion("event_relevant_personnel >=", value, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelLessThan(String value) {
            addCriterion("event_relevant_personnel <", value, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelLessThanOrEqualTo(String value) {
            addCriterion("event_relevant_personnel <=", value, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelLike(String value) {
            addCriterion("event_relevant_personnel like", value, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelNotLike(String value) {
            addCriterion("event_relevant_personnel not like", value, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelIn(List<String> values) {
            addCriterion("event_relevant_personnel in", values, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelNotIn(List<String> values) {
            addCriterion("event_relevant_personnel not in", values, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelBetween(String value1, String value2) {
            addCriterion("event_relevant_personnel between", value1, value2, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventRelevantPersonnelNotBetween(String value1, String value2) {
            addCriterion("event_relevant_personnel not between", value1, value2, "eventRelevantPersonnel");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNull() {
            addCriterion("event_type is null");
            return (Criteria) this;
        }

        public Criteria andEventTypeIsNotNull() {
            addCriterion("event_type is not null");
            return (Criteria) this;
        }

        public Criteria andEventTypeEqualTo(String value) {
            addCriterion("event_type =", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotEqualTo(String value) {
            addCriterion("event_type <>", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThan(String value) {
            addCriterion("event_type >", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeGreaterThanOrEqualTo(String value) {
            addCriterion("event_type >=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThan(String value) {
            addCriterion("event_type <", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLessThanOrEqualTo(String value) {
            addCriterion("event_type <=", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeLike(String value) {
            addCriterion("event_type like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotLike(String value) {
            addCriterion("event_type not like", value, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeIn(List<String> values) {
            addCriterion("event_type in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotIn(List<String> values) {
            addCriterion("event_type not in", values, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeBetween(String value1, String value2) {
            addCriterion("event_type between", value1, value2, "eventType");
            return (Criteria) this;
        }

        public Criteria andEventTypeNotBetween(String value1, String value2) {
            addCriterion("event_type not between", value1, value2, "eventType");
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

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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

        public Criteria andEventInfoIsNull() {
            addCriterion("event_info is null");
            return (Criteria) this;
        }

        public Criteria andEventInfoIsNotNull() {
            addCriterion("event_info is not null");
            return (Criteria) this;
        }

        public Criteria andEventInfoEqualTo(String value) {
            addCriterion("event_info =", value, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoNotEqualTo(String value) {
            addCriterion("event_info <>", value, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoGreaterThan(String value) {
            addCriterion("event_info >", value, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoGreaterThanOrEqualTo(String value) {
            addCriterion("event_info >=", value, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoLessThan(String value) {
            addCriterion("event_info <", value, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoLessThanOrEqualTo(String value) {
            addCriterion("event_info <=", value, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoLike(String value) {
            addCriterion("event_info like", value, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoNotLike(String value) {
            addCriterion("event_info not like", value, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoIn(List<String> values) {
            addCriterion("event_info in", values, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoNotIn(List<String> values) {
            addCriterion("event_info not in", values, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoBetween(String value1, String value2) {
            addCriterion("event_info between", value1, value2, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventInfoNotBetween(String value1, String value2) {
            addCriterion("event_info not between", value1, value2, "eventInfo");
            return (Criteria) this;
        }

        public Criteria andEventTimeIsNull() {
            addCriterion("event_time is null");
            return (Criteria) this;
        }

        public Criteria andEventTimeIsNotNull() {
            addCriterion("event_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventTimeEqualTo(Date value) {
            addCriterion("event_time =", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotEqualTo(Date value) {
            addCriterion("event_time <>", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeGreaterThan(Date value) {
            addCriterion("event_time >", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_time >=", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLessThan(Date value) {
            addCriterion("event_time <", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_time <=", value, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeIn(List<Date> values) {
            addCriterion("event_time in", values, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotIn(List<Date> values) {
            addCriterion("event_time not in", values, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeBetween(Date value1, Date value2) {
            addCriterion("event_time between", value1, value2, "eventTime");
            return (Criteria) this;
        }

        public Criteria andEventTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_time not between", value1, value2, "eventTime");
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