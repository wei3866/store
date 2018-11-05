package com.geruisi.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class userExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public userExample() {
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

        public Criteria andUNumberIsNull() {
            addCriterion("u_number is null");
            return (Criteria) this;
        }

        public Criteria andUNumberIsNotNull() {
            addCriterion("u_number is not null");
            return (Criteria) this;
        }

        public Criteria andUNumberEqualTo(String value) {
            addCriterion("u_number =", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotEqualTo(String value) {
            addCriterion("u_number <>", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberGreaterThan(String value) {
            addCriterion("u_number >", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberGreaterThanOrEqualTo(String value) {
            addCriterion("u_number >=", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLessThan(String value) {
            addCriterion("u_number <", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLessThanOrEqualTo(String value) {
            addCriterion("u_number <=", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberLike(String value) {
            addCriterion("u_number like", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotLike(String value) {
            addCriterion("u_number not like", value, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberIn(List<String> values) {
            addCriterion("u_number in", values, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotIn(List<String> values) {
            addCriterion("u_number not in", values, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberBetween(String value1, String value2) {
            addCriterion("u_number between", value1, value2, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUNumberNotBetween(String value1, String value2) {
            addCriterion("u_number not between", value1, value2, "uNumber");
            return (Criteria) this;
        }

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNull() {
            addCriterion("u_gender is null");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNotNull() {
            addCriterion("u_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUGenderEqualTo(Integer value) {
            addCriterion("u_gender =", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotEqualTo(Integer value) {
            addCriterion("u_gender <>", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThan(Integer value) {
            addCriterion("u_gender >", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_gender >=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThan(Integer value) {
            addCriterion("u_gender <", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThanOrEqualTo(Integer value) {
            addCriterion("u_gender <=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderIn(List<Integer> values) {
            addCriterion("u_gender in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotIn(List<Integer> values) {
            addCriterion("u_gender not in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderBetween(Integer value1, Integer value2) {
            addCriterion("u_gender between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("u_gender not between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("u_password is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("u_password is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("u_password =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("u_password <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("u_password >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("u_password >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("u_password <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("u_password <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("u_password like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("u_password not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("u_password in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("u_password not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("u_password between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("u_password not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("u_email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("u_email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("u_email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("u_email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("u_email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("u_email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("u_email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("u_email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("u_email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("u_email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("u_email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("u_email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("u_email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("u_email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUUserNumberIsNull() {
            addCriterion("u_user_number is null");
            return (Criteria) this;
        }

        public Criteria andUUserNumberIsNotNull() {
            addCriterion("u_user_number is not null");
            return (Criteria) this;
        }

        public Criteria andUUserNumberEqualTo(Integer value) {
            addCriterion("u_user_number =", value, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberNotEqualTo(Integer value) {
            addCriterion("u_user_number <>", value, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberGreaterThan(Integer value) {
            addCriterion("u_user_number >", value, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_user_number >=", value, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberLessThan(Integer value) {
            addCriterion("u_user_number <", value, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberLessThanOrEqualTo(Integer value) {
            addCriterion("u_user_number <=", value, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberIn(List<Integer> values) {
            addCriterion("u_user_number in", values, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberNotIn(List<Integer> values) {
            addCriterion("u_user_number not in", values, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberBetween(Integer value1, Integer value2) {
            addCriterion("u_user_number between", value1, value2, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUUserNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("u_user_number not between", value1, value2, "uUserNumber");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNull() {
            addCriterion("u_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIsNotNull() {
            addCriterion("u_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday =", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday <>", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("u_birthday >", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday >=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("u_birthday <", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("u_birthday <=", value, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("u_birthday in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("u_birthday not in", values, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birthday between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("u_birthday not between", value1, value2, "uBirthday");
            return (Criteria) this;
        }

        public Criteria andUPassPusIsNull() {
            addCriterion("u_pass_pus is null");
            return (Criteria) this;
        }

        public Criteria andUPassPusIsNotNull() {
            addCriterion("u_pass_pus is not null");
            return (Criteria) this;
        }

        public Criteria andUPassPusEqualTo(String value) {
            addCriterion("u_pass_pus =", value, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusNotEqualTo(String value) {
            addCriterion("u_pass_pus <>", value, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusGreaterThan(String value) {
            addCriterion("u_pass_pus >", value, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusGreaterThanOrEqualTo(String value) {
            addCriterion("u_pass_pus >=", value, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusLessThan(String value) {
            addCriterion("u_pass_pus <", value, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusLessThanOrEqualTo(String value) {
            addCriterion("u_pass_pus <=", value, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusLike(String value) {
            addCriterion("u_pass_pus like", value, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusNotLike(String value) {
            addCriterion("u_pass_pus not like", value, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusIn(List<String> values) {
            addCriterion("u_pass_pus in", values, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusNotIn(List<String> values) {
            addCriterion("u_pass_pus not in", values, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusBetween(String value1, String value2) {
            addCriterion("u_pass_pus between", value1, value2, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUPassPusNotBetween(String value1, String value2) {
            addCriterion("u_pass_pus not between", value1, value2, "uPassPus");
            return (Criteria) this;
        }

        public Criteria andUMerIsNull() {
            addCriterion("u_mer is null");
            return (Criteria) this;
        }

        public Criteria andUMerIsNotNull() {
            addCriterion("u_mer is not null");
            return (Criteria) this;
        }

        public Criteria andUMerEqualTo(Integer value) {
            addCriterion("u_mer =", value, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerNotEqualTo(Integer value) {
            addCriterion("u_mer <>", value, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerGreaterThan(Integer value) {
            addCriterion("u_mer >", value, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_mer >=", value, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerLessThan(Integer value) {
            addCriterion("u_mer <", value, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerLessThanOrEqualTo(Integer value) {
            addCriterion("u_mer <=", value, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerIn(List<Integer> values) {
            addCriterion("u_mer in", values, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerNotIn(List<Integer> values) {
            addCriterion("u_mer not in", values, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerBetween(Integer value1, Integer value2) {
            addCriterion("u_mer between", value1, value2, "uMer");
            return (Criteria) this;
        }

        public Criteria andUMerNotBetween(Integer value1, Integer value2) {
            addCriterion("u_mer not between", value1, value2, "uMer");
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