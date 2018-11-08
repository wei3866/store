package com.geruisi.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andROrderIdIsNull() {
            addCriterion("r_order_id is null");
            return (Criteria) this;
        }

        public Criteria andROrderIdIsNotNull() {
            addCriterion("r_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andROrderIdEqualTo(String value) {
            addCriterion("r_order_id =", value, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdNotEqualTo(String value) {
            addCriterion("r_order_id <>", value, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdGreaterThan(String value) {
            addCriterion("r_order_id >", value, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("r_order_id >=", value, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdLessThan(String value) {
            addCriterion("r_order_id <", value, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdLessThanOrEqualTo(String value) {
            addCriterion("r_order_id <=", value, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdLike(String value) {
            addCriterion("r_order_id like", value, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdNotLike(String value) {
            addCriterion("r_order_id not like", value, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdIn(List<String> values) {
            addCriterion("r_order_id in", values, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdNotIn(List<String> values) {
            addCriterion("r_order_id not in", values, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdBetween(String value1, String value2) {
            addCriterion("r_order_id between", value1, value2, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andROrderIdNotBetween(String value1, String value2) {
            addCriterion("r_order_id not between", value1, value2, "rOrderId");
            return (Criteria) this;
        }

        public Criteria andRUNumberIsNull() {
            addCriterion("r_u_number is null");
            return (Criteria) this;
        }

        public Criteria andRUNumberIsNotNull() {
            addCriterion("r_u_number is not null");
            return (Criteria) this;
        }

        public Criteria andRUNumberEqualTo(String value) {
            addCriterion("r_u_number =", value, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberNotEqualTo(String value) {
            addCriterion("r_u_number <>", value, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberGreaterThan(String value) {
            addCriterion("r_u_number >", value, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberGreaterThanOrEqualTo(String value) {
            addCriterion("r_u_number >=", value, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberLessThan(String value) {
            addCriterion("r_u_number <", value, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberLessThanOrEqualTo(String value) {
            addCriterion("r_u_number <=", value, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberLike(String value) {
            addCriterion("r_u_number like", value, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberNotLike(String value) {
            addCriterion("r_u_number not like", value, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberIn(List<String> values) {
            addCriterion("r_u_number in", values, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberNotIn(List<String> values) {
            addCriterion("r_u_number not in", values, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberBetween(String value1, String value2) {
            addCriterion("r_u_number between", value1, value2, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRUNumberNotBetween(String value1, String value2) {
            addCriterion("r_u_number not between", value1, value2, "rUNumber");
            return (Criteria) this;
        }

        public Criteria andRCIdIsNull() {
            addCriterion("r_c_id is null");
            return (Criteria) this;
        }

        public Criteria andRCIdIsNotNull() {
            addCriterion("r_c_id is not null");
            return (Criteria) this;
        }

        public Criteria andRCIdEqualTo(Integer value) {
            addCriterion("r_c_id =", value, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdNotEqualTo(Integer value) {
            addCriterion("r_c_id <>", value, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdGreaterThan(Integer value) {
            addCriterion("r_c_id >", value, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_c_id >=", value, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdLessThan(Integer value) {
            addCriterion("r_c_id <", value, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_c_id <=", value, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdIn(List<Integer> values) {
            addCriterion("r_c_id in", values, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdNotIn(List<Integer> values) {
            addCriterion("r_c_id not in", values, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdBetween(Integer value1, Integer value2) {
            addCriterion("r_c_id between", value1, value2, "rCId");
            return (Criteria) this;
        }

        public Criteria andRCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_c_id not between", value1, value2, "rCId");
            return (Criteria) this;
        }

        public Criteria andRMerIdIsNull() {
            addCriterion("r_mer_id is null");
            return (Criteria) this;
        }

        public Criteria andRMerIdIsNotNull() {
            addCriterion("r_mer_id is not null");
            return (Criteria) this;
        }

        public Criteria andRMerIdEqualTo(Integer value) {
            addCriterion("r_mer_id =", value, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdNotEqualTo(Integer value) {
            addCriterion("r_mer_id <>", value, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdGreaterThan(Integer value) {
            addCriterion("r_mer_id >", value, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_mer_id >=", value, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdLessThan(Integer value) {
            addCriterion("r_mer_id <", value, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_mer_id <=", value, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdIn(List<Integer> values) {
            addCriterion("r_mer_id in", values, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdNotIn(List<Integer> values) {
            addCriterion("r_mer_id not in", values, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdBetween(Integer value1, Integer value2) {
            addCriterion("r_mer_id between", value1, value2, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_mer_id not between", value1, value2, "rMerId");
            return (Criteria) this;
        }

        public Criteria andRMoneryIsNull() {
            addCriterion("r_monery is null");
            return (Criteria) this;
        }

        public Criteria andRMoneryIsNotNull() {
            addCriterion("r_monery is not null");
            return (Criteria) this;
        }

        public Criteria andRMoneryEqualTo(Integer value) {
            addCriterion("r_monery =", value, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryNotEqualTo(Integer value) {
            addCriterion("r_monery <>", value, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryGreaterThan(Integer value) {
            addCriterion("r_monery >", value, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_monery >=", value, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryLessThan(Integer value) {
            addCriterion("r_monery <", value, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryLessThanOrEqualTo(Integer value) {
            addCriterion("r_monery <=", value, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryIn(List<Integer> values) {
            addCriterion("r_monery in", values, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryNotIn(List<Integer> values) {
            addCriterion("r_monery not in", values, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryBetween(Integer value1, Integer value2) {
            addCriterion("r_monery between", value1, value2, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRMoneryNotBetween(Integer value1, Integer value2) {
            addCriterion("r_monery not between", value1, value2, "rMonery");
            return (Criteria) this;
        }

        public Criteria andRDeliverIsNull() {
            addCriterion("r_deliver is null");
            return (Criteria) this;
        }

        public Criteria andRDeliverIsNotNull() {
            addCriterion("r_deliver is not null");
            return (Criteria) this;
        }

        public Criteria andRDeliverEqualTo(Date value) {
            addCriterionForJDBCDate("r_deliver =", value, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverNotEqualTo(Date value) {
            addCriterionForJDBCDate("r_deliver <>", value, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverGreaterThan(Date value) {
            addCriterionForJDBCDate("r_deliver >", value, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_deliver >=", value, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverLessThan(Date value) {
            addCriterionForJDBCDate("r_deliver <", value, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_deliver <=", value, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverIn(List<Date> values) {
            addCriterionForJDBCDate("r_deliver in", values, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverNotIn(List<Date> values) {
            addCriterionForJDBCDate("r_deliver not in", values, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_deliver between", value1, value2, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRDeliverNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_deliver not between", value1, value2, "rDeliver");
            return (Criteria) this;
        }

        public Criteria andRReceivingIsNull() {
            addCriterion("r_Receiving is null");
            return (Criteria) this;
        }

        public Criteria andRReceivingIsNotNull() {
            addCriterion("r_Receiving is not null");
            return (Criteria) this;
        }

        public Criteria andRReceivingEqualTo(Date value) {
            addCriterionForJDBCDate("r_Receiving =", value, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingNotEqualTo(Date value) {
            addCriterionForJDBCDate("r_Receiving <>", value, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingGreaterThan(Date value) {
            addCriterionForJDBCDate("r_Receiving >", value, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_Receiving >=", value, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingLessThan(Date value) {
            addCriterionForJDBCDate("r_Receiving <", value, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("r_Receiving <=", value, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingIn(List<Date> values) {
            addCriterionForJDBCDate("r_Receiving in", values, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingNotIn(List<Date> values) {
            addCriterionForJDBCDate("r_Receiving not in", values, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_Receiving between", value1, value2, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRReceivingNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("r_Receiving not between", value1, value2, "rReceiving");
            return (Criteria) this;
        }

        public Criteria andRStateIsNull() {
            addCriterion("r_state is null");
            return (Criteria) this;
        }

        public Criteria andRStateIsNotNull() {
            addCriterion("r_state is not null");
            return (Criteria) this;
        }

        public Criteria andRStateEqualTo(Integer value) {
            addCriterion("r_state =", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotEqualTo(Integer value) {
            addCriterion("r_state <>", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThan(Integer value) {
            addCriterion("r_state >", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_state >=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThan(Integer value) {
            addCriterion("r_state <", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateLessThanOrEqualTo(Integer value) {
            addCriterion("r_state <=", value, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateIn(List<Integer> values) {
            addCriterion("r_state in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotIn(List<Integer> values) {
            addCriterion("r_state not in", values, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateBetween(Integer value1, Integer value2) {
            addCriterion("r_state between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRStateNotBetween(Integer value1, Integer value2) {
            addCriterion("r_state not between", value1, value2, "rState");
            return (Criteria) this;
        }

        public Criteria andRDelIsNull() {
            addCriterion("r_del is null");
            return (Criteria) this;
        }

        public Criteria andRDelIsNotNull() {
            addCriterion("r_del is not null");
            return (Criteria) this;
        }

        public Criteria andRDelEqualTo(String value) {
            addCriterion("r_del =", value, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelNotEqualTo(String value) {
            addCriterion("r_del <>", value, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelGreaterThan(String value) {
            addCriterion("r_del >", value, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelGreaterThanOrEqualTo(String value) {
            addCriterion("r_del >=", value, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelLessThan(String value) {
            addCriterion("r_del <", value, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelLessThanOrEqualTo(String value) {
            addCriterion("r_del <=", value, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelLike(String value) {
            addCriterion("r_del like", value, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelNotLike(String value) {
            addCriterion("r_del not like", value, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelIn(List<String> values) {
            addCriterion("r_del in", values, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelNotIn(List<String> values) {
            addCriterion("r_del not in", values, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelBetween(String value1, String value2) {
            addCriterion("r_del between", value1, value2, "rDel");
            return (Criteria) this;
        }

        public Criteria andRDelNotBetween(String value1, String value2) {
            addCriterion("r_del not between", value1, value2, "rDel");
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