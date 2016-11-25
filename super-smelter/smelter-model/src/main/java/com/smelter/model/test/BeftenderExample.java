package com.smelter.model.test;


import com.smelter.model.common.BaseModel;

import java.util.ArrayList;
import java.util.List;

public class BeftenderExample extends BaseModel {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BeftenderExample() {
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

    protected abstract static class GeneratedCriteria implements java.io.Serializable {
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


        //alias

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "Id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "Id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "Id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "Id");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "Uuid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "Uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "Uid");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNull() {
            addCriterion("ttype is null");
            return (Criteria) this;
        }

        public Criteria andTtypeIsNotNull() {
            addCriterion("ttype is not null");
            return (Criteria) this;
        }

        public Criteria andTtypeEqualTo(String value) {
            addCriterion("ttype =", value, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotEqualTo(String value) {
            addCriterion("ttype <>", value, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThan(String value) {
            addCriterion("ttype >", value, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ttype >=", value, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThan(String value) {
            addCriterion("ttype <", value, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeLessThanOrEqualTo(String value) {
            addCriterion("ttype <=", value, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeIn(List<String> values) {
            addCriterion("ttype in", values, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotIn(List<String> values) {
            addCriterion("ttype not in", values, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeBetween(String value1, String value2) {
            addCriterion("ttype between", value1, value2, "Ttype");
            return (Criteria) this;
        }

        public Criteria andTtypeNotBetween(String value1, String value2) {
            addCriterion("ttype not between", value1, value2, "Ttype");
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
            addCriterion("title =", value, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "Title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "Title");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "Amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "Amount");
            return (Criteria) this;
        }

        public Criteria andInterestrateIsNull() {
            addCriterion("interestrate is null");
            return (Criteria) this;
        }

        public Criteria andInterestrateIsNotNull() {
            addCriterion("interestrate is not null");
            return (Criteria) this;
        }

        public Criteria andInterestrateEqualTo(Double value) {
            addCriterion("interestrate =", value, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotEqualTo(Double value) {
            addCriterion("interestrate <>", value, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateGreaterThan(Double value) {
            addCriterion("interestrate >", value, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateGreaterThanOrEqualTo(Double value) {
            addCriterion("interestrate >=", value, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateLessThan(Double value) {
            addCriterion("interestrate <", value, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateLessThanOrEqualTo(Double value) {
            addCriterion("interestrate <=", value, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateIn(List<Double> values) {
            addCriterion("interestrate in", values, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotIn(List<Double> values) {
            addCriterion("interestrate not in", values, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateBetween(Double value1, Double value2) {
            addCriterion("interestrate between", value1, value2, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andInterestrateNotBetween(Double value1, Double value2) {
            addCriterion("interestrate not between", value1, value2, "Interestrate");
            return (Criteria) this;
        }

        public Criteria andPhasesIsNull() {
            addCriterion("phases is null");
            return (Criteria) this;
        }

        public Criteria andPhasesIsNotNull() {
            addCriterion("phases is not null");
            return (Criteria) this;
        }

        public Criteria andPhasesEqualTo(String value) {
            addCriterion("phases =", value, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesNotEqualTo(String value) {
            addCriterion("phases <>", value, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesGreaterThan(String value) {
            addCriterion("phases >", value, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesGreaterThanOrEqualTo(String value) {
            addCriterion("phases >=", value, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesLessThan(String value) {
            addCriterion("phases <", value, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesLessThanOrEqualTo(String value) {
            addCriterion("phases <=", value, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesIn(List<String> values) {
            addCriterion("phases in", values, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesNotIn(List<String> values) {
            addCriterion("phases not in", values, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesBetween(String value1, String value2) {
            addCriterion("phases between", value1, value2, "Phases");
            return (Criteria) this;
        }

        public Criteria andPhasesNotBetween(String value1, String value2) {
            addCriterion("phases not between", value1, value2, "Phases");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeIsNull() {
            addCriterion("repaymenttype is null");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeIsNotNull() {
            addCriterion("repaymenttype is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeEqualTo(String value) {
            addCriterion("repaymenttype =", value, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotEqualTo(String value) {
            addCriterion("repaymenttype <>", value, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeGreaterThan(String value) {
            addCriterion("repaymenttype >", value, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("repaymenttype >=", value, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeLessThan(String value) {
            addCriterion("repaymenttype <", value, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("repaymenttype <=", value, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeIn(List<String> values) {
            addCriterion("repaymenttype in", values, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotIn(List<String> values) {
            addCriterion("repaymenttype not in", values, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeBetween(String value1, String value2) {
            addCriterion("repaymenttype between", value1, value2, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andRepaymenttypeNotBetween(String value1, String value2) {
            addCriterion("repaymenttype not between", value1, value2, "Repaymenttype");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNull() {
            addCriterion("provincecode is null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIsNotNull() {
            addCriterion("provincecode is not null");
            return (Criteria) this;
        }

        public Criteria andProvincecodeEqualTo(String value) {
            addCriterion("provincecode =", value, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotEqualTo(String value) {
            addCriterion("provincecode <>", value, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThan(String value) {
            addCriterion("provincecode >", value, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeGreaterThanOrEqualTo(String value) {
            addCriterion("provincecode >=", value, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThan(String value) {
            addCriterion("provincecode <", value, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeLessThanOrEqualTo(String value) {
            addCriterion("provincecode <=", value, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeIn(List<String> values) {
            addCriterion("provincecode in", values, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotIn(List<String> values) {
            addCriterion("provincecode not in", values, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeBetween(String value1, String value2) {
            addCriterion("provincecode between", value1, value2, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincecodeNotBetween(String value1, String value2) {
            addCriterion("provincecode not between", value1, value2, "Provincecode");
            return (Criteria) this;
        }

        public Criteria andProvincenameIsNull() {
            addCriterion("provincename is null");
            return (Criteria) this;
        }

        public Criteria andProvincenameIsNotNull() {
            addCriterion("provincename is not null");
            return (Criteria) this;
        }

        public Criteria andProvincenameEqualTo(String value) {
            addCriterion("provincename =", value, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotEqualTo(String value) {
            addCriterion("provincename <>", value, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameGreaterThan(String value) {
            addCriterion("provincename >", value, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameGreaterThanOrEqualTo(String value) {
            addCriterion("provincename >=", value, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLessThan(String value) {
            addCriterion("provincename <", value, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameLessThanOrEqualTo(String value) {
            addCriterion("provincename <=", value, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameIn(List<String> values) {
            addCriterion("provincename in", values, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotIn(List<String> values) {
            addCriterion("provincename not in", values, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameBetween(String value1, String value2) {
            addCriterion("provincename between", value1, value2, "Provincename");
            return (Criteria) this;
        }

        public Criteria andProvincenameNotBetween(String value1, String value2) {
            addCriterion("provincename not between", value1, value2, "Provincename");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNull() {
            addCriterion("citycode is null");
            return (Criteria) this;
        }

        public Criteria andCitycodeIsNotNull() {
            addCriterion("citycode is not null");
            return (Criteria) this;
        }

        public Criteria andCitycodeEqualTo(String value) {
            addCriterion("citycode =", value, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotEqualTo(String value) {
            addCriterion("citycode <>", value, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThan(String value) {
            addCriterion("citycode >", value, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("citycode >=", value, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThan(String value) {
            addCriterion("citycode <", value, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeLessThanOrEqualTo(String value) {
            addCriterion("citycode <=", value, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeIn(List<String> values) {
            addCriterion("citycode in", values, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotIn(List<String> values) {
            addCriterion("citycode not in", values, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeBetween(String value1, String value2) {
            addCriterion("citycode between", value1, value2, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitycodeNotBetween(String value1, String value2) {
            addCriterion("citycode not between", value1, value2, "Citycode");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNull() {
            addCriterion("cityname is null");
            return (Criteria) this;
        }

        public Criteria andCitynameIsNotNull() {
            addCriterion("cityname is not null");
            return (Criteria) this;
        }

        public Criteria andCitynameEqualTo(String value) {
            addCriterion("cityname =", value, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotEqualTo(String value) {
            addCriterion("cityname <>", value, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThan(String value) {
            addCriterion("cityname >", value, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameGreaterThanOrEqualTo(String value) {
            addCriterion("cityname >=", value, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThan(String value) {
            addCriterion("cityname <", value, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameLessThanOrEqualTo(String value) {
            addCriterion("cityname <=", value, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameIn(List<String> values) {
            addCriterion("cityname in", values, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotIn(List<String> values) {
            addCriterion("cityname not in", values, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameBetween(String value1, String value2) {
            addCriterion("cityname between", value1, value2, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCitynameNotBetween(String value1, String value2) {
            addCriterion("cityname not between", value1, value2, "Cityname");
            return (Criteria) this;
        }

        public Criteria andCountycodeIsNull() {
            addCriterion("countycode is null");
            return (Criteria) this;
        }

        public Criteria andCountycodeIsNotNull() {
            addCriterion("countycode is not null");
            return (Criteria) this;
        }

        public Criteria andCountycodeEqualTo(String value) {
            addCriterion("countycode =", value, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeNotEqualTo(String value) {
            addCriterion("countycode <>", value, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeGreaterThan(String value) {
            addCriterion("countycode >", value, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeGreaterThanOrEqualTo(String value) {
            addCriterion("countycode >=", value, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeLessThan(String value) {
            addCriterion("countycode <", value, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeLessThanOrEqualTo(String value) {
            addCriterion("countycode <=", value, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeIn(List<String> values) {
            addCriterion("countycode in", values, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeNotIn(List<String> values) {
            addCriterion("countycode not in", values, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeBetween(String value1, String value2) {
            addCriterion("countycode between", value1, value2, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountycodeNotBetween(String value1, String value2) {
            addCriterion("countycode not between", value1, value2, "Countycode");
            return (Criteria) this;
        }

        public Criteria andCountynameIsNull() {
            addCriterion("countyname is null");
            return (Criteria) this;
        }

        public Criteria andCountynameIsNotNull() {
            addCriterion("countyname is not null");
            return (Criteria) this;
        }

        public Criteria andCountynameEqualTo(String value) {
            addCriterion("countyname =", value, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotEqualTo(String value) {
            addCriterion("countyname <>", value, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameGreaterThan(String value) {
            addCriterion("countyname >", value, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameGreaterThanOrEqualTo(String value) {
            addCriterion("countyname >=", value, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLessThan(String value) {
            addCriterion("countyname <", value, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameLessThanOrEqualTo(String value) {
            addCriterion("countyname <=", value, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameIn(List<String> values) {
            addCriterion("countyname in", values, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotIn(List<String> values) {
            addCriterion("countyname not in", values, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameBetween(String value1, String value2) {
            addCriterion("countyname between", value1, value2, "Countyname");
            return (Criteria) this;
        }

        public Criteria andCountynameNotBetween(String value1, String value2) {
            addCriterion("countyname not between", value1, value2, "Countyname");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "Origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "Origin");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeIsNull() {
            addCriterion("parent_provincecode is null");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeIsNotNull() {
            addCriterion("parent_provincecode is not null");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeEqualTo(String value) {
            addCriterion("parent_provincecode =", value, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeNotEqualTo(String value) {
            addCriterion("parent_provincecode <>", value, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeGreaterThan(String value) {
            addCriterion("parent_provincecode >", value, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_provincecode >=", value, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeLessThan(String value) {
            addCriterion("parent_provincecode <", value, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeLessThanOrEqualTo(String value) {
            addCriterion("parent_provincecode <=", value, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeIn(List<String> values) {
            addCriterion("parent_provincecode in", values, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeNotIn(List<String> values) {
            addCriterion("parent_provincecode not in", values, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeBetween(String value1, String value2) {
            addCriterion("parent_provincecode between", value1, value2, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentProvincecodeNotBetween(String value1, String value2) {
            addCriterion("parent_provincecode not between", value1, value2, "ParentProvincecode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeIsNull() {
            addCriterion("parent_citycode is null");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeIsNotNull() {
            addCriterion("parent_citycode is not null");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeEqualTo(String value) {
            addCriterion("parent_citycode =", value, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeNotEqualTo(String value) {
            addCriterion("parent_citycode <>", value, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeGreaterThan(String value) {
            addCriterion("parent_citycode >", value, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_citycode >=", value, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeLessThan(String value) {
            addCriterion("parent_citycode <", value, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeLessThanOrEqualTo(String value) {
            addCriterion("parent_citycode <=", value, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeIn(List<String> values) {
            addCriterion("parent_citycode in", values, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeNotIn(List<String> values) {
            addCriterion("parent_citycode not in", values, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeBetween(String value1, String value2) {
            addCriterion("parent_citycode between", value1, value2, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCitycodeNotBetween(String value1, String value2) {
            addCriterion("parent_citycode not between", value1, value2, "ParentCitycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeIsNull() {
            addCriterion("parent_countycode is null");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeIsNotNull() {
            addCriterion("parent_countycode is not null");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeEqualTo(String value) {
            addCriterion("parent_countycode =", value, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeNotEqualTo(String value) {
            addCriterion("parent_countycode <>", value, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeGreaterThan(String value) {
            addCriterion("parent_countycode >", value, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeGreaterThanOrEqualTo(String value) {
            addCriterion("parent_countycode >=", value, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeLessThan(String value) {
            addCriterion("parent_countycode <", value, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeLessThanOrEqualTo(String value) {
            addCriterion("parent_countycode <=", value, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeIn(List<String> values) {
            addCriterion("parent_countycode in", values, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeNotIn(List<String> values) {
            addCriterion("parent_countycode not in", values, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeBetween(String value1, String value2) {
            addCriterion("parent_countycode between", value1, value2, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andParentCountycodeNotBetween(String value1, String value2) {
            addCriterion("parent_countycode not between", value1, value2, "ParentCountycode");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "Education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "Education");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "Industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "Industry");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("marriage is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("marriage is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(String value) {
            addCriterion("marriage =", value, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(String value) {
            addCriterion("marriage <>", value, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(String value) {
            addCriterion("marriage >", value, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("marriage >=", value, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(String value) {
            addCriterion("marriage <", value, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(String value) {
            addCriterion("marriage <=", value, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<String> values) {
            addCriterion("marriage in", values, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<String> values) {
            addCriterion("marriage not in", values, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(String value1, String value2) {
            addCriterion("marriage between", value1, value2, "Marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(String value1, String value2) {
            addCriterion("marriage not between", value1, value2, "Marriage");
            return (Criteria) this;
        }

        public Criteria andPeiounameIsNull() {
            addCriterion("peiouname is null");
            return (Criteria) this;
        }

        public Criteria andPeiounameIsNotNull() {
            addCriterion("peiouname is not null");
            return (Criteria) this;
        }

        public Criteria andPeiounameEqualTo(String value) {
            addCriterion("peiouname =", value, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameNotEqualTo(String value) {
            addCriterion("peiouname <>", value, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameGreaterThan(String value) {
            addCriterion("peiouname >", value, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameGreaterThanOrEqualTo(String value) {
            addCriterion("peiouname >=", value, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameLessThan(String value) {
            addCriterion("peiouname <", value, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameLessThanOrEqualTo(String value) {
            addCriterion("peiouname <=", value, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameIn(List<String> values) {
            addCriterion("peiouname in", values, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameNotIn(List<String> values) {
            addCriterion("peiouname not in", values, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameBetween(String value1, String value2) {
            addCriterion("peiouname between", value1, value2, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiounameNotBetween(String value1, String value2) {
            addCriterion("peiouname not between", value1, value2, "Peiouname");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardIsNull() {
            addCriterion("peiouidcard is null");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardIsNotNull() {
            addCriterion("peiouidcard is not null");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardEqualTo(String value) {
            addCriterion("peiouidcard =", value, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardNotEqualTo(String value) {
            addCriterion("peiouidcard <>", value, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardGreaterThan(String value) {
            addCriterion("peiouidcard >", value, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardGreaterThanOrEqualTo(String value) {
            addCriterion("peiouidcard >=", value, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardLessThan(String value) {
            addCriterion("peiouidcard <", value, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardLessThanOrEqualTo(String value) {
            addCriterion("peiouidcard <=", value, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardIn(List<String> values) {
            addCriterion("peiouidcard in", values, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardNotIn(List<String> values) {
            addCriterion("peiouidcard not in", values, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardBetween(String value1, String value2) {
            addCriterion("peiouidcard between", value1, value2, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeiouidcardNotBetween(String value1, String value2) {
            addCriterion("peiouidcard not between", value1, value2, "Peiouidcard");
            return (Criteria) this;
        }

        public Criteria andPeioutelIsNull() {
            addCriterion("peioutel is null");
            return (Criteria) this;
        }

        public Criteria andPeioutelIsNotNull() {
            addCriterion("peioutel is not null");
            return (Criteria) this;
        }

        public Criteria andPeioutelEqualTo(String value) {
            addCriterion("peioutel =", value, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelNotEqualTo(String value) {
            addCriterion("peioutel <>", value, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelGreaterThan(String value) {
            addCriterion("peioutel >", value, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelGreaterThanOrEqualTo(String value) {
            addCriterion("peioutel >=", value, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelLessThan(String value) {
            addCriterion("peioutel <", value, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelLessThanOrEqualTo(String value) {
            addCriterion("peioutel <=", value, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelIn(List<String> values) {
            addCriterion("peioutel in", values, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelNotIn(List<String> values) {
            addCriterion("peioutel not in", values, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelBetween(String value1, String value2) {
            addCriterion("peioutel between", value1, value2, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andPeioutelNotBetween(String value1, String value2) {
            addCriterion("peioutel not between", value1, value2, "Peioutel");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "Idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "Idcard");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "Address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "Address");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "Company");
            return (Criteria) this;
        }

        public Criteria andCompanyteleIsNull() {
            addCriterion("companytele is null");
            return (Criteria) this;
        }

        public Criteria andCompanyteleIsNotNull() {
            addCriterion("companytele is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyteleEqualTo(String value) {
            addCriterion("companytele =", value, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleNotEqualTo(String value) {
            addCriterion("companytele <>", value, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleGreaterThan(String value) {
            addCriterion("companytele >", value, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleGreaterThanOrEqualTo(String value) {
            addCriterion("companytele >=", value, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleLessThan(String value) {
            addCriterion("companytele <", value, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleLessThanOrEqualTo(String value) {
            addCriterion("companytele <=", value, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleIn(List<String> values) {
            addCriterion("companytele in", values, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleNotIn(List<String> values) {
            addCriterion("companytele not in", values, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleBetween(String value1, String value2) {
            addCriterion("companytele between", value1, value2, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleNotBetween(String value1, String value2) {
            addCriterion("companytele not between", value1, value2, "Companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIsNull() {
            addCriterion("companyaddr is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIsNotNull() {
            addCriterion("companyaddr is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrEqualTo(String value) {
            addCriterion("companyaddr =", value, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotEqualTo(String value) {
            addCriterion("companyaddr <>", value, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrGreaterThan(String value) {
            addCriterion("companyaddr >", value, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrGreaterThanOrEqualTo(String value) {
            addCriterion("companyaddr >=", value, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLessThan(String value) {
            addCriterion("companyaddr <", value, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrLessThanOrEqualTo(String value) {
            addCriterion("companyaddr <=", value, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrIn(List<String> values) {
            addCriterion("companyaddr in", values, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotIn(List<String> values) {
            addCriterion("companyaddr not in", values, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrBetween(String value1, String value2) {
            addCriterion("companyaddr between", value1, value2, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCompanyaddrNotBetween(String value1, String value2) {
            addCriterion("companyaddr not between", value1, value2, "Companyaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrIsNull() {
            addCriterion("currentaddr is null");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrIsNotNull() {
            addCriterion("currentaddr is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrEqualTo(String value) {
            addCriterion("currentaddr =", value, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrNotEqualTo(String value) {
            addCriterion("currentaddr <>", value, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrGreaterThan(String value) {
            addCriterion("currentaddr >", value, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrGreaterThanOrEqualTo(String value) {
            addCriterion("currentaddr >=", value, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrLessThan(String value) {
            addCriterion("currentaddr <", value, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrLessThanOrEqualTo(String value) {
            addCriterion("currentaddr <=", value, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrIn(List<String> values) {
            addCriterion("currentaddr in", values, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrNotIn(List<String> values) {
            addCriterion("currentaddr not in", values, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrBetween(String value1, String value2) {
            addCriterion("currentaddr between", value1, value2, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andCurrentaddrNotBetween(String value1, String value2) {
            addCriterion("currentaddr not between", value1, value2, "Currentaddr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrIsNull() {
            addCriterion("homevisitsaadr is null");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrIsNotNull() {
            addCriterion("homevisitsaadr is not null");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrEqualTo(String value) {
            addCriterion("homevisitsaadr =", value, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrNotEqualTo(String value) {
            addCriterion("homevisitsaadr <>", value, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrGreaterThan(String value) {
            addCriterion("homevisitsaadr >", value, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrGreaterThanOrEqualTo(String value) {
            addCriterion("homevisitsaadr >=", value, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrLessThan(String value) {
            addCriterion("homevisitsaadr <", value, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrLessThanOrEqualTo(String value) {
            addCriterion("homevisitsaadr <=", value, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrIn(List<String> values) {
            addCriterion("homevisitsaadr in", values, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrNotIn(List<String> values) {
            addCriterion("homevisitsaadr not in", values, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrBetween(String value1, String value2) {
            addCriterion("homevisitsaadr between", value1, value2, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsaadrNotBetween(String value1, String value2) {
            addCriterion("homevisitsaadr not between", value1, value2, "Homevisitsaadr");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromIsNull() {
            addCriterion("homevisitsfrom is null");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromIsNotNull() {
            addCriterion("homevisitsfrom is not null");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromEqualTo(Integer value) {
            addCriterion("homevisitsfrom =", value, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromNotEqualTo(Integer value) {
            addCriterion("homevisitsfrom <>", value, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromGreaterThan(Integer value) {
            addCriterion("homevisitsfrom >", value, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromGreaterThanOrEqualTo(Integer value) {
            addCriterion("homevisitsfrom >=", value, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromLessThan(Integer value) {
            addCriterion("homevisitsfrom <", value, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromLessThanOrEqualTo(Integer value) {
            addCriterion("homevisitsfrom <=", value, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromIn(List<Integer> values) {
            addCriterion("homevisitsfrom in", values, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromNotIn(List<Integer> values) {
            addCriterion("homevisitsfrom not in", values, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromBetween(Integer value1, Integer value2) {
            addCriterion("homevisitsfrom between", value1, value2, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitsfromNotBetween(Integer value1, Integer value2) {
            addCriterion("homevisitsfrom not between", value1, value2, "Homevisitsfrom");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoIsNull() {
            addCriterion("homevisitsto is null");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoIsNotNull() {
            addCriterion("homevisitsto is not null");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoEqualTo(Integer value) {
            addCriterion("homevisitsto =", value, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoNotEqualTo(Integer value) {
            addCriterion("homevisitsto <>", value, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoGreaterThan(Integer value) {
            addCriterion("homevisitsto >", value, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoGreaterThanOrEqualTo(Integer value) {
            addCriterion("homevisitsto >=", value, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoLessThan(Integer value) {
            addCriterion("homevisitsto <", value, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoLessThanOrEqualTo(Integer value) {
            addCriterion("homevisitsto <=", value, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoIn(List<Integer> values) {
            addCriterion("homevisitsto in", values, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoNotIn(List<Integer> values) {
            addCriterion("homevisitsto not in", values, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoBetween(Integer value1, Integer value2) {
            addCriterion("homevisitsto between", value1, value2, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andHomevisitstoNotBetween(Integer value1, Integer value2) {
            addCriterion("homevisitsto not between", value1, value2, "Homevisitsto");
            return (Criteria) this;
        }

        public Criteria andLsreadedIsNull() {
            addCriterion("lsreaded is null");
            return (Criteria) this;
        }

        public Criteria andLsreadedIsNotNull() {
            addCriterion("lsreaded is not null");
            return (Criteria) this;
        }

        public Criteria andLsreadedEqualTo(String value) {
            addCriterion("lsreaded =", value, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedNotEqualTo(String value) {
            addCriterion("lsreaded <>", value, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedGreaterThan(String value) {
            addCriterion("lsreaded >", value, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedGreaterThanOrEqualTo(String value) {
            addCriterion("lsreaded >=", value, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedLessThan(String value) {
            addCriterion("lsreaded <", value, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedLessThanOrEqualTo(String value) {
            addCriterion("lsreaded <=", value, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedIn(List<String> values) {
            addCriterion("lsreaded in", values, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedNotIn(List<String> values) {
            addCriterion("lsreaded not in", values, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedBetween(String value1, String value2) {
            addCriterion("lsreaded between", value1, value2, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andLsreadedNotBetween(String value1, String value2) {
            addCriterion("lsreaded not between", value1, value2, "Lsreaded");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNull() {
            addCriterion("agentid is null");
            return (Criteria) this;
        }

        public Criteria andAgentidIsNotNull() {
            addCriterion("agentid is not null");
            return (Criteria) this;
        }

        public Criteria andAgentidEqualTo(String value) {
            addCriterion("agentid =", value, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotEqualTo(String value) {
            addCriterion("agentid <>", value, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThan(String value) {
            addCriterion("agentid >", value, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidGreaterThanOrEqualTo(String value) {
            addCriterion("agentid >=", value, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThan(String value) {
            addCriterion("agentid <", value, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidLessThanOrEqualTo(String value) {
            addCriterion("agentid <=", value, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidIn(List<String> values) {
            addCriterion("agentid in", values, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotIn(List<String> values) {
            addCriterion("agentid not in", values, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidBetween(String value1, String value2) {
            addCriterion("agentid between", value1, value2, "Agentid");
            return (Criteria) this;
        }

        public Criteria andAgentidNotBetween(String value1, String value2) {
            addCriterion("agentid not between", value1, value2, "Agentid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "Tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "Tid");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverIsNull() {
            addCriterion("homevisitover is null");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverIsNotNull() {
            addCriterion("homevisitover is not null");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverEqualTo(String value) {
            addCriterion("homevisitover =", value, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverNotEqualTo(String value) {
            addCriterion("homevisitover <>", value, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverGreaterThan(String value) {
            addCriterion("homevisitover >", value, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverGreaterThanOrEqualTo(String value) {
            addCriterion("homevisitover >=", value, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverLessThan(String value) {
            addCriterion("homevisitover <", value, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverLessThanOrEqualTo(String value) {
            addCriterion("homevisitover <=", value, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverIn(List<String> values) {
            addCriterion("homevisitover in", values, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverNotIn(List<String> values) {
            addCriterion("homevisitover not in", values, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverBetween(String value1, String value2) {
            addCriterion("homevisitover between", value1, value2, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andHomevisitoverNotBetween(String value1, String value2) {
            addCriterion("homevisitover not between", value1, value2, "Homevisitover");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNull() {
            addCriterion("agentname is null");
            return (Criteria) this;
        }

        public Criteria andAgentNameIsNotNull() {
            addCriterion("agentname is not null");
            return (Criteria) this;
        }

        public Criteria andAgentNameEqualTo(String value) {
            addCriterion("agentname =", value, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotEqualTo(String value) {
            addCriterion("agentname <>", value, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThan(String value) {
            addCriterion("agentname >", value, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("agentname >=", value, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThan(String value) {
            addCriterion("agentname <", value, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameLessThanOrEqualTo(String value) {
            addCriterion("agentname <=", value, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameIn(List<String> values) {
            addCriterion("agentname in", values, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotIn(List<String> values) {
            addCriterion("agentname not in", values, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameBetween(String value1, String value2) {
            addCriterion("agentname between", value1, value2, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentNameNotBetween(String value1, String value2) {
            addCriterion("agentname not between", value1, value2, "AgentName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameIsNull() {
            addCriterion("agentcontactsname is null");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameIsNotNull() {
            addCriterion("agentcontactsname is not null");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameEqualTo(String value) {
            addCriterion("agentcontactsname =", value, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameNotEqualTo(String value) {
            addCriterion("agentcontactsname <>", value, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameGreaterThan(String value) {
            addCriterion("agentcontactsname >", value, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("agentcontactsname >=", value, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameLessThan(String value) {
            addCriterion("agentcontactsname <", value, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameLessThanOrEqualTo(String value) {
            addCriterion("agentcontactsname <=", value, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameIn(List<String> values) {
            addCriterion("agentcontactsname in", values, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameNotIn(List<String> values) {
            addCriterion("agentcontactsname not in", values, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameBetween(String value1, String value2) {
            addCriterion("agentcontactsname between", value1, value2, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentcontactsNameNotBetween(String value1, String value2) {
            addCriterion("agentcontactsname not between", value1, value2, "AgentcontactsName");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileIsNull() {
            addCriterion("agentcontactsmobile is null");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileIsNotNull() {
            addCriterion("agentcontactsmobile is not null");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileEqualTo(String value) {
            addCriterion("agentcontactsmobile =", value, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileNotEqualTo(String value) {
            addCriterion("agentcontactsmobile <>", value, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileGreaterThan(String value) {
            addCriterion("agentcontactsmobile >", value, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileGreaterThanOrEqualTo(String value) {
            addCriterion("agentcontactsmobile >=", value, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileLessThan(String value) {
            addCriterion("agentcontactsmobile <", value, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileLessThanOrEqualTo(String value) {
            addCriterion("agentcontactsmobile <=", value, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileIn(List<String> values) {
            addCriterion("agentcontactsmobile in", values, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileNotIn(List<String> values) {
            addCriterion("agentcontactsmobile not in", values, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileBetween(String value1, String value2) {
            addCriterion("agentcontactsmobile between", value1, value2, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentContactsMobileNotBetween(String value1, String value2) {
            addCriterion("agentcontactsmobile not between", value1, value2, "AgentContactsMobile");
            return (Criteria) this;
        }

        public Criteria andAgentaddressIsNull() {
            addCriterion("agentaddress is null");
            return (Criteria) this;
        }

        public Criteria andAgentaddressIsNotNull() {
            addCriterion("agentaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAgentaddressEqualTo(String value) {
            addCriterion("agentaddress =", value, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressNotEqualTo(String value) {
            addCriterion("agentaddress <>", value, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressGreaterThan(String value) {
            addCriterion("agentaddress >", value, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressGreaterThanOrEqualTo(String value) {
            addCriterion("agentaddress >=", value, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressLessThan(String value) {
            addCriterion("agentaddress <", value, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressLessThanOrEqualTo(String value) {
            addCriterion("agentaddress <=", value, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressIn(List<String> values) {
            addCriterion("agentaddress in", values, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressNotIn(List<String> values) {
            addCriterion("agentaddress not in", values, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressBetween(String value1, String value2) {
            addCriterion("agentaddress between", value1, value2, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andAgentaddressNotBetween(String value1, String value2) {
            addCriterion("agentaddress not between", value1, value2, "Agentaddress");
            return (Criteria) this;
        }

        public Criteria andHitsIsNull() {
            addCriterion("hits is null");
            return (Criteria) this;
        }

        public Criteria andHitsIsNotNull() {
            addCriterion("hits is not null");
            return (Criteria) this;
        }

        public Criteria andHitsEqualTo(String value) {
            addCriterion("hits =", value, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotEqualTo(String value) {
            addCriterion("hits <>", value, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThan(String value) {
            addCriterion("hits >", value, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsGreaterThanOrEqualTo(String value) {
            addCriterion("hits >=", value, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThan(String value) {
            addCriterion("hits <", value, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsLessThanOrEqualTo(String value) {
            addCriterion("hits <=", value, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsIn(List<String> values) {
            addCriterion("hits in", values, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotIn(List<String> values) {
            addCriterion("hits not in", values, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsBetween(String value1, String value2) {
            addCriterion("hits between", value1, value2, "Hits");
            return (Criteria) this;
        }

        public Criteria andHitsNotBetween(String value1, String value2) {
            addCriterion("hits not between", value1, value2, "Hits");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(java.util.Date value) {
            addCriterion("update_time =", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(java.util.Date value) {
            addCriterion("update_time <>", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(java.util.Date value) {
            addCriterion("update_time >", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time >=", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(java.util.Date value) {
            addCriterion("update_time <", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("update_time <=", value, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<java.util.Date> values) {
            addCriterion("update_time in", values, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<java.util.Date> values) {
            addCriterion("update_time not in", values, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time between", value1, value2, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("update_time not between", value1, value2, "UpdateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(java.util.Date value) {
            addCriterion("create_time =", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(java.util.Date value) {
            addCriterion("create_time <>", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(java.util.Date value) {
            addCriterion("create_time >", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time >=", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(java.util.Date value) {
            addCriterion("create_time <", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(java.util.Date value) {
            addCriterion("create_time <=", value, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<java.util.Date> values) {
            addCriterion("create_time in", values, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<java.util.Date> values) {
            addCriterion("create_time not in", values, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time between", value1, value2, "CreateTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
            addCriterion("create_time not between", value1, value2, "CreateTime");
            return (Criteria) this;
        }


    }

    public static class Criteria extends GeneratedCriteria implements java.io.Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements java.io.Serializable {
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