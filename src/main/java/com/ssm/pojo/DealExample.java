package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DealExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andContract_idIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContract_idIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContract_idEqualTo(Integer value) {
            addCriterion("contract_id =", value, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idNotEqualTo(Integer value) {
            addCriterion("contract_id <>", value, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idGreaterThan(Integer value) {
            addCriterion("contract_id >", value, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_id >=", value, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idLessThan(Integer value) {
            addCriterion("contract_id <", value, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idLessThanOrEqualTo(Integer value) {
            addCriterion("contract_id <=", value, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idIn(List<Integer> values) {
            addCriterion("contract_id in", values, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idNotIn(List<Integer> values) {
            addCriterion("contract_id not in", values, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idBetween(Integer value1, Integer value2) {
            addCriterion("contract_id between", value1, value2, "contract_id");
            return (Criteria) this;
        }

        public Criteria andContract_idNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_id not between", value1, value2, "contract_id");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameIsNull() {
            addCriterion("tenant_username is null");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameIsNotNull() {
            addCriterion("tenant_username is not null");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameEqualTo(String value) {
            addCriterion("tenant_username =", value, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameNotEqualTo(String value) {
            addCriterion("tenant_username <>", value, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameGreaterThan(String value) {
            addCriterion("tenant_username >", value, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("tenant_username >=", value, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameLessThan(String value) {
            addCriterion("tenant_username <", value, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameLessThanOrEqualTo(String value) {
            addCriterion("tenant_username <=", value, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameLike(String value) {
            addCriterion("tenant_username like", value, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameNotLike(String value) {
            addCriterion("tenant_username not like", value, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameIn(List<String> values) {
            addCriterion("tenant_username in", values, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameNotIn(List<String> values) {
            addCriterion("tenant_username not in", values, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameBetween(String value1, String value2) {
            addCriterion("tenant_username between", value1, value2, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andTenant_usernameNotBetween(String value1, String value2) {
            addCriterion("tenant_username not between", value1, value2, "tenant_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameIsNull() {
            addCriterion("landlord_username is null");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameIsNotNull() {
            addCriterion("landlord_username is not null");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameEqualTo(String value) {
            addCriterion("landlord_username =", value, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameNotEqualTo(String value) {
            addCriterion("landlord_username <>", value, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameGreaterThan(String value) {
            addCriterion("landlord_username >", value, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameGreaterThanOrEqualTo(String value) {
            addCriterion("landlord_username >=", value, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameLessThan(String value) {
            addCriterion("landlord_username <", value, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameLessThanOrEqualTo(String value) {
            addCriterion("landlord_username <=", value, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameLike(String value) {
            addCriterion("landlord_username like", value, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameNotLike(String value) {
            addCriterion("landlord_username not like", value, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameIn(List<String> values) {
            addCriterion("landlord_username in", values, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameNotIn(List<String> values) {
            addCriterion("landlord_username not in", values, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameBetween(String value1, String value2) {
            addCriterion("landlord_username between", value1, value2, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andLandlord_usernameNotBetween(String value1, String value2) {
            addCriterion("landlord_username not between", value1, value2, "landlord_username");
            return (Criteria) this;
        }

        public Criteria andHouse_idIsNull() {
            addCriterion("house_id is null");
            return (Criteria) this;
        }

        public Criteria andHouse_idIsNotNull() {
            addCriterion("house_id is not null");
            return (Criteria) this;
        }

        public Criteria andHouse_idEqualTo(Integer value) {
            addCriterion("house_id =", value, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idNotEqualTo(Integer value) {
            addCriterion("house_id <>", value, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idGreaterThan(Integer value) {
            addCriterion("house_id >", value, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("house_id >=", value, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idLessThan(Integer value) {
            addCriterion("house_id <", value, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idLessThanOrEqualTo(Integer value) {
            addCriterion("house_id <=", value, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idIn(List<Integer> values) {
            addCriterion("house_id in", values, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idNotIn(List<Integer> values) {
            addCriterion("house_id not in", values, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idBetween(Integer value1, Integer value2) {
            addCriterion("house_id between", value1, value2, "house_id");
            return (Criteria) this;
        }

        public Criteria andHouse_idNotBetween(Integer value1, Integer value2) {
            addCriterion("house_id not between", value1, value2, "house_id");
            return (Criteria) this;
        }

        public Criteria andStart_dateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStart_dateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStart_dateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "start_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_dateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "end_date");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentIsNull() {
            addCriterion("monthly_rent is null");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentIsNotNull() {
            addCriterion("monthly_rent is not null");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentEqualTo(Integer value) {
            addCriterion("monthly_rent =", value, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentNotEqualTo(Integer value) {
            addCriterion("monthly_rent <>", value, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentGreaterThan(Integer value) {
            addCriterion("monthly_rent >", value, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_rent >=", value, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentLessThan(Integer value) {
            addCriterion("monthly_rent <", value, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_rent <=", value, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentIn(List<Integer> values) {
            addCriterion("monthly_rent in", values, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentNotIn(List<Integer> values) {
            addCriterion("monthly_rent not in", values, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentBetween(Integer value1, Integer value2) {
            addCriterion("monthly_rent between", value1, value2, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andMonthly_rentNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_rent not between", value1, value2, "monthly_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentIsNull() {
            addCriterion("tot_rent is null");
            return (Criteria) this;
        }

        public Criteria andTot_rentIsNotNull() {
            addCriterion("tot_rent is not null");
            return (Criteria) this;
        }

        public Criteria andTot_rentEqualTo(Integer value) {
            addCriterion("tot_rent =", value, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentNotEqualTo(Integer value) {
            addCriterion("tot_rent <>", value, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentGreaterThan(Integer value) {
            addCriterion("tot_rent >", value, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentGreaterThanOrEqualTo(Integer value) {
            addCriterion("tot_rent >=", value, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentLessThan(Integer value) {
            addCriterion("tot_rent <", value, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentLessThanOrEqualTo(Integer value) {
            addCriterion("tot_rent <=", value, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentIn(List<Integer> values) {
            addCriterion("tot_rent in", values, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentNotIn(List<Integer> values) {
            addCriterion("tot_rent not in", values, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentBetween(Integer value1, Integer value2) {
            addCriterion("tot_rent between", value1, value2, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andTot_rentNotBetween(Integer value1, Integer value2) {
            addCriterion("tot_rent not between", value1, value2, "tot_rent");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeIsNull() {
            addCriterion("landlord_agency_fee is null");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeIsNotNull() {
            addCriterion("landlord_agency_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeEqualTo(Integer value) {
            addCriterion("landlord_agency_fee =", value, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeNotEqualTo(Integer value) {
            addCriterion("landlord_agency_fee <>", value, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeGreaterThan(Integer value) {
            addCriterion("landlord_agency_fee >", value, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeGreaterThanOrEqualTo(Integer value) {
            addCriterion("landlord_agency_fee >=", value, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeLessThan(Integer value) {
            addCriterion("landlord_agency_fee <", value, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeLessThanOrEqualTo(Integer value) {
            addCriterion("landlord_agency_fee <=", value, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeIn(List<Integer> values) {
            addCriterion("landlord_agency_fee in", values, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeNotIn(List<Integer> values) {
            addCriterion("landlord_agency_fee not in", values, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeBetween(Integer value1, Integer value2) {
            addCriterion("landlord_agency_fee between", value1, value2, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andLandlord_agency_feeNotBetween(Integer value1, Integer value2) {
            addCriterion("landlord_agency_fee not between", value1, value2, "landlord_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeIsNull() {
            addCriterion("tenant_agency_fee is null");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeIsNotNull() {
            addCriterion("tenant_agency_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeEqualTo(Integer value) {
            addCriterion("tenant_agency_fee =", value, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeNotEqualTo(Integer value) {
            addCriterion("tenant_agency_fee <>", value, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeGreaterThan(Integer value) {
            addCriterion("tenant_agency_fee >", value, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tenant_agency_fee >=", value, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeLessThan(Integer value) {
            addCriterion("tenant_agency_fee <", value, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeLessThanOrEqualTo(Integer value) {
            addCriterion("tenant_agency_fee <=", value, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeIn(List<Integer> values) {
            addCriterion("tenant_agency_fee in", values, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeNotIn(List<Integer> values) {
            addCriterion("tenant_agency_fee not in", values, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeBetween(Integer value1, Integer value2) {
            addCriterion("tenant_agency_fee between", value1, value2, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andTenant_agency_feeNotBetween(Integer value1, Integer value2) {
            addCriterion("tenant_agency_fee not between", value1, value2, "tenant_agency_fee");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeIsNull() {
            addCriterion("registration_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeIsNotNull() {
            addCriterion("registration_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeEqualTo(Date value) {
            addCriterionForJDBCDate("registration_time =", value, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("registration_time <>", value, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("registration_time >", value, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registration_time >=", value, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeLessThan(Date value) {
            addCriterionForJDBCDate("registration_time <", value, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registration_time <=", value, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeIn(List<Date> values) {
            addCriterionForJDBCDate("registration_time in", values, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("registration_time not in", values, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registration_time between", value1, value2, "registration_time");
            return (Criteria) this;
        }

        public Criteria andRegistration_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registration_time not between", value1, value2, "registration_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeIsNull() {
            addCriterion("modification_time is null");
            return (Criteria) this;
        }

        public Criteria andModification_timeIsNotNull() {
            addCriterion("modification_time is not null");
            return (Criteria) this;
        }

        public Criteria andModification_timeEqualTo(Date value) {
            addCriterionForJDBCDate("modification_time =", value, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("modification_time <>", value, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("modification_time >", value, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modification_time >=", value, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeLessThan(Date value) {
            addCriterionForJDBCDate("modification_time <", value, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modification_time <=", value, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeIn(List<Date> values) {
            addCriterionForJDBCDate("modification_time in", values, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("modification_time not in", values, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modification_time between", value1, value2, "modification_time");
            return (Criteria) this;
        }

        public Criteria andModification_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modification_time not between", value1, value2, "modification_time");
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