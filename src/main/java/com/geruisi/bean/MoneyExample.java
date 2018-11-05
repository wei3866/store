package com.geruisi.bean;

import java.util.ArrayList;
import java.util.List;

public class MoneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoneyExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMUserNumberIsNull() {
            addCriterion("m_user_number is null");
            return (Criteria) this;
        }

        public Criteria andMUserNumberIsNotNull() {
            addCriterion("m_user_number is not null");
            return (Criteria) this;
        }

        public Criteria andMUserNumberEqualTo(String value) {
            addCriterion("m_user_number =", value, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberNotEqualTo(String value) {
            addCriterion("m_user_number <>", value, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberGreaterThan(String value) {
            addCriterion("m_user_number >", value, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberGreaterThanOrEqualTo(String value) {
            addCriterion("m_user_number >=", value, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberLessThan(String value) {
            addCriterion("m_user_number <", value, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberLessThanOrEqualTo(String value) {
            addCriterion("m_user_number <=", value, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberLike(String value) {
            addCriterion("m_user_number like", value, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberNotLike(String value) {
            addCriterion("m_user_number not like", value, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberIn(List<String> values) {
            addCriterion("m_user_number in", values, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberNotIn(List<String> values) {
            addCriterion("m_user_number not in", values, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberBetween(String value1, String value2) {
            addCriterion("m_user_number between", value1, value2, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMUserNumberNotBetween(String value1, String value2) {
            addCriterion("m_user_number not between", value1, value2, "mUserNumber");
            return (Criteria) this;
        }

        public Criteria andMMoneyIsNull() {
            addCriterion("m_money is null");
            return (Criteria) this;
        }

        public Criteria andMMoneyIsNotNull() {
            addCriterion("m_money is not null");
            return (Criteria) this;
        }

        public Criteria andMMoneyEqualTo(Integer value) {
            addCriterion("m_money =", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyNotEqualTo(Integer value) {
            addCriterion("m_money <>", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyGreaterThan(Integer value) {
            addCriterion("m_money >", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_money >=", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyLessThan(Integer value) {
            addCriterion("m_money <", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("m_money <=", value, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyIn(List<Integer> values) {
            addCriterion("m_money in", values, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyNotIn(List<Integer> values) {
            addCriterion("m_money not in", values, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyBetween(Integer value1, Integer value2) {
            addCriterion("m_money between", value1, value2, "mMoney");
            return (Criteria) this;
        }

        public Criteria andMMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("m_money not between", value1, value2, "mMoney");
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