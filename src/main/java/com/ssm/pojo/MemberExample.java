package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andMember_nameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMember_nameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMember_nameEqualTo(String value) {
            addCriterion("member_name =", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameGreaterThan(String value) {
            addCriterion("member_name >", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameLessThan(String value) {
            addCriterion("member_name <", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameLike(String value) {
            addCriterion("member_name like", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameNotLike(String value) {
            addCriterion("member_name not like", value, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameIn(List<String> values) {
            addCriterion("member_name in", values, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "member_name");
            return (Criteria) this;
        }

        public Criteria andMember_nameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "member_name");
            return (Criteria) this;
        }

        public Criteria andFee_rateIsNull() {
            addCriterion("fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andFee_rateIsNotNull() {
            addCriterion("fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFee_rateEqualTo(Float value) {
            addCriterion("fee_rate =", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateNotEqualTo(Float value) {
            addCriterion("fee_rate <>", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateGreaterThan(Float value) {
            addCriterion("fee_rate >", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateGreaterThanOrEqualTo(Float value) {
            addCriterion("fee_rate >=", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateLessThan(Float value) {
            addCriterion("fee_rate <", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateLessThanOrEqualTo(Float value) {
            addCriterion("fee_rate <=", value, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateIn(List<Float> values) {
            addCriterion("fee_rate in", values, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateNotIn(List<Float> values) {
            addCriterion("fee_rate not in", values, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateBetween(Float value1, Float value2) {
            addCriterion("fee_rate between", value1, value2, "fee_rate");
            return (Criteria) this;
        }

        public Criteria andFee_rateNotBetween(Float value1, Float value2) {
            addCriterion("fee_rate not between", value1, value2, "fee_rate");
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