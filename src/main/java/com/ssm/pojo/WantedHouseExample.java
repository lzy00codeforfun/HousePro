package com.ssm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WantedHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WantedHouseExample() {
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

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNull() {
            addCriterion("community is null");
            return (Criteria) this;
        }

        public Criteria andCommunityIsNotNull() {
            addCriterion("community is not null");
            return (Criteria) this;
        }

        public Criteria andCommunityEqualTo(String value) {
            addCriterion("community =", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotEqualTo(String value) {
            addCriterion("community <>", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThan(String value) {
            addCriterion("community >", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityGreaterThanOrEqualTo(String value) {
            addCriterion("community >=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThan(String value) {
            addCriterion("community <", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLessThanOrEqualTo(String value) {
            addCriterion("community <=", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityLike(String value) {
            addCriterion("community like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotLike(String value) {
            addCriterion("community not like", value, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityIn(List<String> values) {
            addCriterion("community in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotIn(List<String> values) {
            addCriterion("community not in", values, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityBetween(String value1, String value2) {
            addCriterion("community between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andCommunityNotBetween(String value1, String value2) {
            addCriterion("community not between", value1, value2, "community");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andArea_lbIsNull() {
            addCriterion("area_lb is null");
            return (Criteria) this;
        }

        public Criteria andArea_lbIsNotNull() {
            addCriterion("area_lb is not null");
            return (Criteria) this;
        }

        public Criteria andArea_lbEqualTo(Integer value) {
            addCriterion("area_lb =", value, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbNotEqualTo(Integer value) {
            addCriterion("area_lb <>", value, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbGreaterThan(Integer value) {
            addCriterion("area_lb >", value, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_lb >=", value, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbLessThan(Integer value) {
            addCriterion("area_lb <", value, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbLessThanOrEqualTo(Integer value) {
            addCriterion("area_lb <=", value, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbIn(List<Integer> values) {
            addCriterion("area_lb in", values, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbNotIn(List<Integer> values) {
            addCriterion("area_lb not in", values, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbBetween(Integer value1, Integer value2) {
            addCriterion("area_lb between", value1, value2, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_lbNotBetween(Integer value1, Integer value2) {
            addCriterion("area_lb not between", value1, value2, "area_lb");
            return (Criteria) this;
        }

        public Criteria andArea_ubIsNull() {
            addCriterion("area_ub is null");
            return (Criteria) this;
        }

        public Criteria andArea_ubIsNotNull() {
            addCriterion("area_ub is not null");
            return (Criteria) this;
        }

        public Criteria andArea_ubEqualTo(Integer value) {
            addCriterion("area_ub =", value, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubNotEqualTo(Integer value) {
            addCriterion("area_ub <>", value, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubGreaterThan(Integer value) {
            addCriterion("area_ub >", value, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_ub >=", value, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubLessThan(Integer value) {
            addCriterion("area_ub <", value, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubLessThanOrEqualTo(Integer value) {
            addCriterion("area_ub <=", value, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubIn(List<Integer> values) {
            addCriterion("area_ub in", values, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubNotIn(List<Integer> values) {
            addCriterion("area_ub not in", values, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubBetween(Integer value1, Integer value2) {
            addCriterion("area_ub between", value1, value2, "area_ub");
            return (Criteria) this;
        }

        public Criteria andArea_ubNotBetween(Integer value1, Integer value2) {
            addCriterion("area_ub not between", value1, value2, "area_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_lbIsNull() {
            addCriterion("floor_lb is null");
            return (Criteria) this;
        }

        public Criteria andFloor_lbIsNotNull() {
            addCriterion("floor_lb is not null");
            return (Criteria) this;
        }

        public Criteria andFloor_lbEqualTo(Integer value) {
            addCriterion("floor_lb =", value, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbNotEqualTo(Integer value) {
            addCriterion("floor_lb <>", value, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbGreaterThan(Integer value) {
            addCriterion("floor_lb >", value, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_lb >=", value, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbLessThan(Integer value) {
            addCriterion("floor_lb <", value, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbLessThanOrEqualTo(Integer value) {
            addCriterion("floor_lb <=", value, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbIn(List<Integer> values) {
            addCriterion("floor_lb in", values, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbNotIn(List<Integer> values) {
            addCriterion("floor_lb not in", values, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbBetween(Integer value1, Integer value2) {
            addCriterion("floor_lb between", value1, value2, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_lbNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_lb not between", value1, value2, "floor_lb");
            return (Criteria) this;
        }

        public Criteria andFloor_ubIsNull() {
            addCriterion("floor_ub is null");
            return (Criteria) this;
        }

        public Criteria andFloor_ubIsNotNull() {
            addCriterion("floor_ub is not null");
            return (Criteria) this;
        }

        public Criteria andFloor_ubEqualTo(Integer value) {
            addCriterion("floor_ub =", value, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubNotEqualTo(Integer value) {
            addCriterion("floor_ub <>", value, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubGreaterThan(Integer value) {
            addCriterion("floor_ub >", value, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubGreaterThanOrEqualTo(Integer value) {
            addCriterion("floor_ub >=", value, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubLessThan(Integer value) {
            addCriterion("floor_ub <", value, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubLessThanOrEqualTo(Integer value) {
            addCriterion("floor_ub <=", value, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubIn(List<Integer> values) {
            addCriterion("floor_ub in", values, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubNotIn(List<Integer> values) {
            addCriterion("floor_ub not in", values, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubBetween(Integer value1, Integer value2) {
            addCriterion("floor_ub between", value1, value2, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andFloor_ubNotBetween(Integer value1, Integer value2) {
            addCriterion("floor_ub not between", value1, value2, "floor_ub");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNull() {
            addCriterion("elevator is null");
            return (Criteria) this;
        }

        public Criteria andElevatorIsNotNull() {
            addCriterion("elevator is not null");
            return (Criteria) this;
        }

        public Criteria andElevatorEqualTo(Integer value) {
            addCriterion("elevator =", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotEqualTo(Integer value) {
            addCriterion("elevator <>", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThan(Integer value) {
            addCriterion("elevator >", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("elevator >=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThan(Integer value) {
            addCriterion("elevator <", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorLessThanOrEqualTo(Integer value) {
            addCriterion("elevator <=", value, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorIn(List<Integer> values) {
            addCriterion("elevator in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotIn(List<Integer> values) {
            addCriterion("elevator not in", values, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorBetween(Integer value1, Integer value2) {
            addCriterion("elevator between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andElevatorNotBetween(Integer value1, Integer value2) {
            addCriterion("elevator not between", value1, value2, "elevator");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRent_lbIsNull() {
            addCriterion("rent_lb is null");
            return (Criteria) this;
        }

        public Criteria andRent_lbIsNotNull() {
            addCriterion("rent_lb is not null");
            return (Criteria) this;
        }

        public Criteria andRent_lbEqualTo(Integer value) {
            addCriterion("rent_lb =", value, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbNotEqualTo(Integer value) {
            addCriterion("rent_lb <>", value, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbGreaterThan(Integer value) {
            addCriterion("rent_lb >", value, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_lb >=", value, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbLessThan(Integer value) {
            addCriterion("rent_lb <", value, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbLessThanOrEqualTo(Integer value) {
            addCriterion("rent_lb <=", value, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbIn(List<Integer> values) {
            addCriterion("rent_lb in", values, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbNotIn(List<Integer> values) {
            addCriterion("rent_lb not in", values, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbBetween(Integer value1, Integer value2) {
            addCriterion("rent_lb between", value1, value2, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_lbNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_lb not between", value1, value2, "rent_lb");
            return (Criteria) this;
        }

        public Criteria andRent_ubIsNull() {
            addCriterion("rent_ub is null");
            return (Criteria) this;
        }

        public Criteria andRent_ubIsNotNull() {
            addCriterion("rent_ub is not null");
            return (Criteria) this;
        }

        public Criteria andRent_ubEqualTo(Integer value) {
            addCriterion("rent_ub =", value, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubNotEqualTo(Integer value) {
            addCriterion("rent_ub <>", value, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubGreaterThan(Integer value) {
            addCriterion("rent_ub >", value, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_ub >=", value, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubLessThan(Integer value) {
            addCriterion("rent_ub <", value, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubLessThanOrEqualTo(Integer value) {
            addCriterion("rent_ub <=", value, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubIn(List<Integer> values) {
            addCriterion("rent_ub in", values, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubNotIn(List<Integer> values) {
            addCriterion("rent_ub not in", values, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubBetween(Integer value1, Integer value2) {
            addCriterion("rent_ub between", value1, value2, "rent_ub");
            return (Criteria) this;
        }

        public Criteria andRent_ubNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_ub not between", value1, value2, "rent_ub");
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