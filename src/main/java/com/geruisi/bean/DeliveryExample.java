package com.geruisi.bean;

import java.util.ArrayList;
import java.util.List;

public class DeliveryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryExample() {
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

        public Criteria andDIdIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andDIdIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andDIdEqualTo(Integer value) {
            addCriterion("d_id =", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThan(Integer value) {
            addCriterion("d_id >", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThan(Integer value) {
            addCriterion("d_id <", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdIn(List<Integer> values) {
            addCriterion("d_id in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDIdNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "dId");
            return (Criteria) this;
        }

        public Criteria andDNameIsNull() {
            addCriterion("d_name is null");
            return (Criteria) this;
        }

        public Criteria andDNameIsNotNull() {
            addCriterion("d_name is not null");
            return (Criteria) this;
        }

        public Criteria andDNameEqualTo(String value) {
            addCriterion("d_name =", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotEqualTo(String value) {
            addCriterion("d_name <>", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThan(String value) {
            addCriterion("d_name >", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameGreaterThanOrEqualTo(String value) {
            addCriterion("d_name >=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThan(String value) {
            addCriterion("d_name <", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLessThanOrEqualTo(String value) {
            addCriterion("d_name <=", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameLike(String value) {
            addCriterion("d_name like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotLike(String value) {
            addCriterion("d_name not like", value, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameIn(List<String> values) {
            addCriterion("d_name in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotIn(List<String> values) {
            addCriterion("d_name not in", values, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameBetween(String value1, String value2) {
            addCriterion("d_name between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNameNotBetween(String value1, String value2) {
            addCriterion("d_name not between", value1, value2, "dName");
            return (Criteria) this;
        }

        public Criteria andDNumberIsNull() {
            addCriterion("d_number is null");
            return (Criteria) this;
        }

        public Criteria andDNumberIsNotNull() {
            addCriterion("d_number is not null");
            return (Criteria) this;
        }

        public Criteria andDNumberEqualTo(Integer value) {
            addCriterion("d_number =", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotEqualTo(Integer value) {
            addCriterion("d_number <>", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberGreaterThan(Integer value) {
            addCriterion("d_number >", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_number >=", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberLessThan(Integer value) {
            addCriterion("d_number <", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberLessThanOrEqualTo(Integer value) {
            addCriterion("d_number <=", value, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberIn(List<Integer> values) {
            addCriterion("d_number in", values, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotIn(List<Integer> values) {
            addCriterion("d_number not in", values, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberBetween(Integer value1, Integer value2) {
            addCriterion("d_number between", value1, value2, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("d_number not between", value1, value2, "dNumber");
            return (Criteria) this;
        }

        public Criteria andDDeliveryIsNull() {
            addCriterion("d_delivery is null");
            return (Criteria) this;
        }

        public Criteria andDDeliveryIsNotNull() {
            addCriterion("d_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andDDeliveryEqualTo(String value) {
            addCriterion("d_delivery =", value, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryNotEqualTo(String value) {
            addCriterion("d_delivery <>", value, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryGreaterThan(String value) {
            addCriterion("d_delivery >", value, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("d_delivery >=", value, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryLessThan(String value) {
            addCriterion("d_delivery <", value, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryLessThanOrEqualTo(String value) {
            addCriterion("d_delivery <=", value, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryLike(String value) {
            addCriterion("d_delivery like", value, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryNotLike(String value) {
            addCriterion("d_delivery not like", value, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryIn(List<String> values) {
            addCriterion("d_delivery in", values, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryNotIn(List<String> values) {
            addCriterion("d_delivery not in", values, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryBetween(String value1, String value2) {
            addCriterion("d_delivery between", value1, value2, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryNotBetween(String value1, String value2) {
            addCriterion("d_delivery not between", value1, value2, "dDelivery");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusIsNull() {
            addCriterion("d_delivery_pus is null");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusIsNotNull() {
            addCriterion("d_delivery_pus is not null");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusEqualTo(String value) {
            addCriterion("d_delivery_pus =", value, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusNotEqualTo(String value) {
            addCriterion("d_delivery_pus <>", value, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusGreaterThan(String value) {
            addCriterion("d_delivery_pus >", value, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusGreaterThanOrEqualTo(String value) {
            addCriterion("d_delivery_pus >=", value, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusLessThan(String value) {
            addCriterion("d_delivery_pus <", value, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusLessThanOrEqualTo(String value) {
            addCriterion("d_delivery_pus <=", value, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusLike(String value) {
            addCriterion("d_delivery_pus like", value, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusNotLike(String value) {
            addCriterion("d_delivery_pus not like", value, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusIn(List<String> values) {
            addCriterion("d_delivery_pus in", values, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusNotIn(List<String> values) {
            addCriterion("d_delivery_pus not in", values, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusBetween(String value1, String value2) {
            addCriterion("d_delivery_pus between", value1, value2, "dDeliveryPus");
            return (Criteria) this;
        }

        public Criteria andDDeliveryPusNotBetween(String value1, String value2) {
            addCriterion("d_delivery_pus not between", value1, value2, "dDeliveryPus");
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