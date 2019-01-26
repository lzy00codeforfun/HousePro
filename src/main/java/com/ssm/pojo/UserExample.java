package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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

        public Criteria andReal_nameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andReal_nameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andReal_nameEqualTo(String value) {
            addCriterion("real_name =", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameGreaterThan(String value) {
            addCriterion("real_name >", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLessThan(String value) {
            addCriterion("real_name <", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLike(String value) {
            addCriterion("real_name like", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotLike(String value) {
            addCriterion("real_name not like", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameIn(List<String> values) {
            addCriterion("real_name in", values, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "real_name");
            return (Criteria) this;
        }

        public Criteria andID_typeIsNull() {
            addCriterion("ID_type is null");
            return (Criteria) this;
        }

        public Criteria andID_typeIsNotNull() {
            addCriterion("ID_type is not null");
            return (Criteria) this;
        }

        public Criteria andID_typeEqualTo(String value) {
            addCriterion("ID_type =", value, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeNotEqualTo(String value) {
            addCriterion("ID_type <>", value, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeGreaterThan(String value) {
            addCriterion("ID_type >", value, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeGreaterThanOrEqualTo(String value) {
            addCriterion("ID_type >=", value, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeLessThan(String value) {
            addCriterion("ID_type <", value, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeLessThanOrEqualTo(String value) {
            addCriterion("ID_type <=", value, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeLike(String value) {
            addCriterion("ID_type like", value, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeNotLike(String value) {
            addCriterion("ID_type not like", value, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeIn(List<String> values) {
            addCriterion("ID_type in", values, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeNotIn(List<String> values) {
            addCriterion("ID_type not in", values, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeBetween(String value1, String value2) {
            addCriterion("ID_type between", value1, value2, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_typeNotBetween(String value1, String value2) {
            addCriterion("ID_type not between", value1, value2, "ID_type");
            return (Criteria) this;
        }

        public Criteria andID_noIsNull() {
            addCriterion("ID_no is null");
            return (Criteria) this;
        }

        public Criteria andID_noIsNotNull() {
            addCriterion("ID_no is not null");
            return (Criteria) this;
        }

        public Criteria andID_noEqualTo(String value) {
            addCriterion("ID_no =", value, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noNotEqualTo(String value) {
            addCriterion("ID_no <>", value, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noGreaterThan(String value) {
            addCriterion("ID_no >", value, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noGreaterThanOrEqualTo(String value) {
            addCriterion("ID_no >=", value, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noLessThan(String value) {
            addCriterion("ID_no <", value, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noLessThanOrEqualTo(String value) {
            addCriterion("ID_no <=", value, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noLike(String value) {
            addCriterion("ID_no like", value, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noNotLike(String value) {
            addCriterion("ID_no not like", value, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noIn(List<String> values) {
            addCriterion("ID_no in", values, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noNotIn(List<String> values) {
            addCriterion("ID_no not in", values, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noBetween(String value1, String value2) {
            addCriterion("ID_no between", value1, value2, "ID_no");
            return (Criteria) this;
        }

        public Criteria andID_noNotBetween(String value1, String value2) {
            addCriterion("ID_no not between", value1, value2, "ID_no");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaIsNull() {
            addCriterion("registration_area is null");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaIsNotNull() {
            addCriterion("registration_area is not null");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaEqualTo(String value) {
            addCriterion("registration_area =", value, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaNotEqualTo(String value) {
            addCriterion("registration_area <>", value, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaGreaterThan(String value) {
            addCriterion("registration_area >", value, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaGreaterThanOrEqualTo(String value) {
            addCriterion("registration_area >=", value, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaLessThan(String value) {
            addCriterion("registration_area <", value, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaLessThanOrEqualTo(String value) {
            addCriterion("registration_area <=", value, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaLike(String value) {
            addCriterion("registration_area like", value, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaNotLike(String value) {
            addCriterion("registration_area not like", value, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaIn(List<String> values) {
            addCriterion("registration_area in", values, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaNotIn(List<String> values) {
            addCriterion("registration_area not in", values, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaBetween(String value1, String value2) {
            addCriterion("registration_area between", value1, value2, "registration_area");
            return (Criteria) this;
        }

        public Criteria andRegistration_areaNotBetween(String value1, String value2) {
            addCriterion("registration_area not between", value1, value2, "registration_area");
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

        public Criteria andRenter_lvIsNull() {
            addCriterion("renter_lv is null");
            return (Criteria) this;
        }

        public Criteria andRenter_lvIsNotNull() {
            addCriterion("renter_lv is not null");
            return (Criteria) this;
        }

        public Criteria andRenter_lvEqualTo(Integer value) {
            addCriterion("renter_lv =", value, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvNotEqualTo(Integer value) {
            addCriterion("renter_lv <>", value, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvGreaterThan(Integer value) {
            addCriterion("renter_lv >", value, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvGreaterThanOrEqualTo(Integer value) {
            addCriterion("renter_lv >=", value, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvLessThan(Integer value) {
            addCriterion("renter_lv <", value, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvLessThanOrEqualTo(Integer value) {
            addCriterion("renter_lv <=", value, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvIn(List<Integer> values) {
            addCriterion("renter_lv in", values, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvNotIn(List<Integer> values) {
            addCriterion("renter_lv not in", values, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvBetween(Integer value1, Integer value2) {
            addCriterion("renter_lv between", value1, value2, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andRenter_lvNotBetween(Integer value1, Integer value2) {
            addCriterion("renter_lv not between", value1, value2, "renter_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvIsNull() {
            addCriterion("landlord_lv is null");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvIsNotNull() {
            addCriterion("landlord_lv is not null");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvEqualTo(Integer value) {
            addCriterion("landlord_lv =", value, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvNotEqualTo(Integer value) {
            addCriterion("landlord_lv <>", value, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvGreaterThan(Integer value) {
            addCriterion("landlord_lv >", value, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvGreaterThanOrEqualTo(Integer value) {
            addCriterion("landlord_lv >=", value, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvLessThan(Integer value) {
            addCriterion("landlord_lv <", value, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvLessThanOrEqualTo(Integer value) {
            addCriterion("landlord_lv <=", value, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvIn(List<Integer> values) {
            addCriterion("landlord_lv in", values, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvNotIn(List<Integer> values) {
            addCriterion("landlord_lv not in", values, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvBetween(Integer value1, Integer value2) {
            addCriterion("landlord_lv between", value1, value2, "landlord_lv");
            return (Criteria) this;
        }

        public Criteria andLandlord_lvNotBetween(Integer value1, Integer value2) {
            addCriterion("landlord_lv not between", value1, value2, "landlord_lv");
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