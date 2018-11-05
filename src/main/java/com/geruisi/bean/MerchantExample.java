package com.geruisi.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MerchantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantExample() {
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

        public Criteria andMerIdIsNull() {
            addCriterion("mer_id is null");
            return (Criteria) this;
        }

        public Criteria andMerIdIsNotNull() {
            addCriterion("mer_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerIdEqualTo(Integer value) {
            addCriterion("mer_id =", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotEqualTo(Integer value) {
            addCriterion("mer_id <>", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThan(Integer value) {
            addCriterion("mer_id >", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mer_id >=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThan(Integer value) {
            addCriterion("mer_id <", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdLessThanOrEqualTo(Integer value) {
            addCriterion("mer_id <=", value, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdIn(List<Integer> values) {
            addCriterion("mer_id in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotIn(List<Integer> values) {
            addCriterion("mer_id not in", values, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdBetween(Integer value1, Integer value2) {
            addCriterion("mer_id between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mer_id not between", value1, value2, "merId");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNull() {
            addCriterion("mer_name is null");
            return (Criteria) this;
        }

        public Criteria andMerNameIsNotNull() {
            addCriterion("mer_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerNameEqualTo(String value) {
            addCriterion("mer_name =", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotEqualTo(String value) {
            addCriterion("mer_name <>", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThan(String value) {
            addCriterion("mer_name >", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameGreaterThanOrEqualTo(String value) {
            addCriterion("mer_name >=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThan(String value) {
            addCriterion("mer_name <", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLessThanOrEqualTo(String value) {
            addCriterion("mer_name <=", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameLike(String value) {
            addCriterion("mer_name like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotLike(String value) {
            addCriterion("mer_name not like", value, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameIn(List<String> values) {
            addCriterion("mer_name in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotIn(List<String> values) {
            addCriterion("mer_name not in", values, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameBetween(String value1, String value2) {
            addCriterion("mer_name between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerNameNotBetween(String value1, String value2) {
            addCriterion("mer_name not between", value1, value2, "merName");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberIsNull() {
            addCriterion("mer_user_number is null");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberIsNotNull() {
            addCriterion("mer_user_number is not null");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberEqualTo(String value) {
            addCriterion("mer_user_number =", value, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberNotEqualTo(String value) {
            addCriterion("mer_user_number <>", value, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberGreaterThan(String value) {
            addCriterion("mer_user_number >", value, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mer_user_number >=", value, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberLessThan(String value) {
            addCriterion("mer_user_number <", value, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberLessThanOrEqualTo(String value) {
            addCriterion("mer_user_number <=", value, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberLike(String value) {
            addCriterion("mer_user_number like", value, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberNotLike(String value) {
            addCriterion("mer_user_number not like", value, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberIn(List<String> values) {
            addCriterion("mer_user_number in", values, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberNotIn(List<String> values) {
            addCriterion("mer_user_number not in", values, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberBetween(String value1, String value2) {
            addCriterion("mer_user_number between", value1, value2, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerUserNumberNotBetween(String value1, String value2) {
            addCriterion("mer_user_number not between", value1, value2, "merUserNumber");
            return (Criteria) this;
        }

        public Criteria andMerBeginIsNull() {
            addCriterion("mer_begin is null");
            return (Criteria) this;
        }

        public Criteria andMerBeginIsNotNull() {
            addCriterion("mer_begin is not null");
            return (Criteria) this;
        }

        public Criteria andMerBeginEqualTo(Date value) {
            addCriterionForJDBCDate("mer_begin =", value, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("mer_begin <>", value, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("mer_begin >", value, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mer_begin >=", value, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginLessThan(Date value) {
            addCriterionForJDBCDate("mer_begin <", value, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mer_begin <=", value, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginIn(List<Date> values) {
            addCriterionForJDBCDate("mer_begin in", values, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("mer_begin not in", values, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mer_begin between", value1, value2, "merBegin");
            return (Criteria) this;
        }

        public Criteria andMerBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mer_begin not between", value1, value2, "merBegin");
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