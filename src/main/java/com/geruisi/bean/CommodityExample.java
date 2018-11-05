package com.geruisi.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdIsNull() {
            addCriterion("c_merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdIsNotNull() {
            addCriterion("c_merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdEqualTo(Integer value) {
            addCriterion("c_merchant_id =", value, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdNotEqualTo(Integer value) {
            addCriterion("c_merchant_id <>", value, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdGreaterThan(Integer value) {
            addCriterion("c_merchant_id >", value, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_merchant_id >=", value, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdLessThan(Integer value) {
            addCriterion("c_merchant_id <", value, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_merchant_id <=", value, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdIn(List<Integer> values) {
            addCriterion("c_merchant_id in", values, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdNotIn(List<Integer> values) {
            addCriterion("c_merchant_id not in", values, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdBetween(Integer value1, Integer value2) {
            addCriterion("c_merchant_id between", value1, value2, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCMerchantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_merchant_id not between", value1, value2, "cMerchantId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCTypeAIsNull() {
            addCriterion("c_type_a is null");
            return (Criteria) this;
        }

        public Criteria andCTypeAIsNotNull() {
            addCriterion("c_type_a is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeAEqualTo(String value) {
            addCriterion("c_type_a =", value, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeANotEqualTo(String value) {
            addCriterion("c_type_a <>", value, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeAGreaterThan(String value) {
            addCriterion("c_type_a >", value, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeAGreaterThanOrEqualTo(String value) {
            addCriterion("c_type_a >=", value, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeALessThan(String value) {
            addCriterion("c_type_a <", value, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeALessThanOrEqualTo(String value) {
            addCriterion("c_type_a <=", value, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeALike(String value) {
            addCriterion("c_type_a like", value, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeANotLike(String value) {
            addCriterion("c_type_a not like", value, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeAIn(List<String> values) {
            addCriterion("c_type_a in", values, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeANotIn(List<String> values) {
            addCriterion("c_type_a not in", values, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeABetween(String value1, String value2) {
            addCriterion("c_type_a between", value1, value2, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeANotBetween(String value1, String value2) {
            addCriterion("c_type_a not between", value1, value2, "cTypeA");
            return (Criteria) this;
        }

        public Criteria andCTypeBIsNull() {
            addCriterion("c_type_b is null");
            return (Criteria) this;
        }

        public Criteria andCTypeBIsNotNull() {
            addCriterion("c_type_b is not null");
            return (Criteria) this;
        }

        public Criteria andCTypeBEqualTo(String value) {
            addCriterion("c_type_b =", value, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBNotEqualTo(String value) {
            addCriterion("c_type_b <>", value, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBGreaterThan(String value) {
            addCriterion("c_type_b >", value, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBGreaterThanOrEqualTo(String value) {
            addCriterion("c_type_b >=", value, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBLessThan(String value) {
            addCriterion("c_type_b <", value, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBLessThanOrEqualTo(String value) {
            addCriterion("c_type_b <=", value, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBLike(String value) {
            addCriterion("c_type_b like", value, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBNotLike(String value) {
            addCriterion("c_type_b not like", value, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBIn(List<String> values) {
            addCriterion("c_type_b in", values, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBNotIn(List<String> values) {
            addCriterion("c_type_b not in", values, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBBetween(String value1, String value2) {
            addCriterion("c_type_b between", value1, value2, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCTypeBNotBetween(String value1, String value2) {
            addCriterion("c_type_b not between", value1, value2, "cTypeB");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNull() {
            addCriterion("c_price is null");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNotNull() {
            addCriterion("c_price is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceEqualTo(Integer value) {
            addCriterion("c_price =", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotEqualTo(Integer value) {
            addCriterion("c_price <>", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThan(Integer value) {
            addCriterion("c_price >", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_price >=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThan(Integer value) {
            addCriterion("c_price <", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThanOrEqualTo(Integer value) {
            addCriterion("c_price <=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceIn(List<Integer> values) {
            addCriterion("c_price in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotIn(List<Integer> values) {
            addCriterion("c_price not in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceBetween(Integer value1, Integer value2) {
            addCriterion("c_price between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("c_price not between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPutawayIsNull() {
            addCriterion("c_putaway is null");
            return (Criteria) this;
        }

        public Criteria andCPutawayIsNotNull() {
            addCriterion("c_putaway is not null");
            return (Criteria) this;
        }

        public Criteria andCPutawayEqualTo(Date value) {
            addCriterionForJDBCDate("c_putaway =", value, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_putaway <>", value, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayGreaterThan(Date value) {
            addCriterionForJDBCDate("c_putaway >", value, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_putaway >=", value, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayLessThan(Date value) {
            addCriterionForJDBCDate("c_putaway <", value, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_putaway <=", value, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayIn(List<Date> values) {
            addCriterionForJDBCDate("c_putaway in", values, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_putaway not in", values, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_putaway between", value1, value2, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCPutawayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_putaway not between", value1, value2, "cPutaway");
            return (Criteria) this;
        }

        public Criteria andCInventoryIsNull() {
            addCriterion("c_inventory is null");
            return (Criteria) this;
        }

        public Criteria andCInventoryIsNotNull() {
            addCriterion("c_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andCInventoryEqualTo(Integer value) {
            addCriterion("c_inventory =", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryNotEqualTo(Integer value) {
            addCriterion("c_inventory <>", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryGreaterThan(Integer value) {
            addCriterion("c_inventory >", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_inventory >=", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryLessThan(Integer value) {
            addCriterion("c_inventory <", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("c_inventory <=", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryIn(List<Integer> values) {
            addCriterion("c_inventory in", values, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryNotIn(List<Integer> values) {
            addCriterion("c_inventory not in", values, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryBetween(Integer value1, Integer value2) {
            addCriterion("c_inventory between", value1, value2, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("c_inventory not between", value1, value2, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCSalesIsNull() {
            addCriterion("c_sales is null");
            return (Criteria) this;
        }

        public Criteria andCSalesIsNotNull() {
            addCriterion("c_sales is not null");
            return (Criteria) this;
        }

        public Criteria andCSalesEqualTo(Integer value) {
            addCriterion("c_sales =", value, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesNotEqualTo(Integer value) {
            addCriterion("c_sales <>", value, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesGreaterThan(Integer value) {
            addCriterion("c_sales >", value, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_sales >=", value, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesLessThan(Integer value) {
            addCriterion("c_sales <", value, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesLessThanOrEqualTo(Integer value) {
            addCriterion("c_sales <=", value, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesIn(List<Integer> values) {
            addCriterion("c_sales in", values, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesNotIn(List<Integer> values) {
            addCriterion("c_sales not in", values, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesBetween(Integer value1, Integer value2) {
            addCriterion("c_sales between", value1, value2, "cSales");
            return (Criteria) this;
        }

        public Criteria andCSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("c_sales not between", value1, value2, "cSales");
            return (Criteria) this;
        }

        public Criteria andCExpressageIsNull() {
            addCriterion("c_expressage is null");
            return (Criteria) this;
        }

        public Criteria andCExpressageIsNotNull() {
            addCriterion("c_expressage is not null");
            return (Criteria) this;
        }

        public Criteria andCExpressageEqualTo(String value) {
            addCriterion("c_expressage =", value, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageNotEqualTo(String value) {
            addCriterion("c_expressage <>", value, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageGreaterThan(String value) {
            addCriterion("c_expressage >", value, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageGreaterThanOrEqualTo(String value) {
            addCriterion("c_expressage >=", value, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageLessThan(String value) {
            addCriterion("c_expressage <", value, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageLessThanOrEqualTo(String value) {
            addCriterion("c_expressage <=", value, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageLike(String value) {
            addCriterion("c_expressage like", value, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageNotLike(String value) {
            addCriterion("c_expressage not like", value, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageIn(List<String> values) {
            addCriterion("c_expressage in", values, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageNotIn(List<String> values) {
            addCriterion("c_expressage not in", values, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageBetween(String value1, String value2) {
            addCriterion("c_expressage between", value1, value2, "cExpressage");
            return (Criteria) this;
        }

        public Criteria andCExpressageNotBetween(String value1, String value2) {
            addCriterion("c_expressage not between", value1, value2, "cExpressage");
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