package com.smelter.model.test;


import java.io.Serializable;


public class Beftender implements Serializable {


    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //alias
    private Integer id;
    /**
     *
     */
    private String uuid;
    /**
     * 借款人id
     */
    private Integer uid;
    /**
     * 标类型
     */
    private String ttype;
    /**
     * 标题
     */
    private String title;
    /**
     * 金额
     */
    private String amount;
    /**
     * 年利率
     */
    private Double interestrate;
    /**
     * 分期
     */
    private String phases;
    /**
     * '还款方式 1等额本金 2等额本息 3还本付息 4翼龙等额本息 5翼龙还本付息 6等额等息';
     */
    private String repaymenttype;
    /**
     * 省
     */
    private String provincecode;
    /**
     * 省名称
     */
    private String provincename;
    /**
     * 市
     */
    private String citycode;
    /**
     * 市名称
     */
    private String cityname;
    /**
     * 县
     */
    private String countycode;
    /**
     * 县名称
     */
    private String countyname;
    /**
     * 籍贯
     */
    private String origin;
    /**
     * 父母省
     */
    private String parentProvincecode;
    /**
     * 父母市
     */
    private String parentCitycode;
    /**
     * 父母县
     */
    private String parentCountycode;
    /**
     * 学历
     */
    private String education;
    /**
     * 行业
     */
    private String industry;
    /**
     * 婚姻状态
     */
    private String marriage;
    /**
     * 配偶姓名
     */
    private String peiouname;
    /**
     * 配偶身份证
     */
    private String peiouidcard;
    /**
     * 配偶手机号
     */
    private String peioutel;
    /**
     * 身份证
     */
    private String idcard;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 单位名称
     */
    private String company;
    /**
     * 单位电话
     */
    private String companytele;
    /**
     * 单位地址
     */
    private String companyaddr;
    /**
     * 现居住地
     */
    private String currentaddr;
    /**
     * 家访详细地址
     */
    private String homevisitsaadr;
    /**
     * 家访详细时间
     */
    private Integer homevisitsfrom;
    /**
     * 家访详细时间
     */
    private Integer homevisitsto;
    /**
     * 是否阅读协议 '0 未阅读 1 阅读';
     */
    private String lsreaded;
    /**
     * 盟商id
     */
    private String agentid;
    /**
     * 老库tid
     */
    private Integer tid;

    /**
     * 是否家访完毕0：未家访 1：家访完毕
     */
    private String homevisitover;
    /**
     * 盟商名称
     */
    private String agentName;
    /**
     * 盟商联系人名称
     */
    private String agentcontactsName;
    /**
     * 盟商电话
     */
    private String agentContactsMobile;
    /**
     * 盟商地址
     */
    private String agentaddress;
    /**
     * 终端类型  1:其他  2:手机App
     */
    private String hits;
    /**
     *
     */
    private java.util.Date updateTime;
    /**
     *
     */
    private java.util.Date createTime;


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }

    public String getTtype() {
        return this.ttype;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setInterestrate(Double interestrate) {
        this.interestrate = interestrate;
    }

    public Double getInterestrate() {
        return this.interestrate;
    }

    public void setPhases(String phases) {
        this.phases = phases;
    }

    public String getPhases() {
        return this.phases;
    }

    public void setRepaymenttype(String repaymenttype) {
        this.repaymenttype = repaymenttype;
    }

    public String getRepaymenttype() {
        return this.repaymenttype;
    }

    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    public String getProvincecode() {
        return this.provincecode;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public String getProvincename() {
        return this.provincename;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getCitycode() {
        return this.citycode;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCityname() {
        return this.cityname;
    }

    public void setCountycode(String countycode) {
        this.countycode = countycode;
    }

    public String getCountycode() {
        return this.countycode;
    }

    public void setCountyname(String countyname) {
        this.countyname = countyname;
    }

    public String getCountyname() {
        return this.countyname;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return this.origin;
    }

    public void setParentProvincecode(String parentProvincecode) {
        this.parentProvincecode = parentProvincecode;
    }

    public String getParentProvincecode() {
        return this.parentProvincecode;
    }

    public void setParentCitycode(String parentCitycode) {
        this.parentCitycode = parentCitycode;
    }

    public String getParentCitycode() {
        return this.parentCitycode;
    }

    public void setParentCountycode(String parentCountycode) {
        this.parentCountycode = parentCountycode;
    }

    public String getParentCountycode() {
        return this.parentCountycode;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return this.education;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getIndustry() {
        return this.industry;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getMarriage() {
        return this.marriage;
    }

    public void setPeiouname(String peiouname) {
        this.peiouname = peiouname;
    }

    public String getPeiouname() {
        return this.peiouname;
    }

    public void setPeiouidcard(String peiouidcard) {
        this.peiouidcard = peiouidcard;
    }

    public String getPeiouidcard() {
        return this.peiouidcard;
    }

    public void setPeioutel(String peioutel) {
        this.peioutel = peioutel;
    }

    public String getPeioutel() {
        return this.peioutel;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getIdcard() {
        return this.idcard;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompanytele(String companytele) {
        this.companytele = companytele;
    }

    public String getCompanytele() {
        return this.companytele;
    }

    public void setCompanyaddr(String companyaddr) {
        this.companyaddr = companyaddr;
    }

    public String getCompanyaddr() {
        return this.companyaddr;
    }

    public void setCurrentaddr(String currentaddr) {
        this.currentaddr = currentaddr;
    }

    public String getCurrentaddr() {
        return this.currentaddr;
    }

    public void setHomevisitsaadr(String homevisitsaadr) {
        this.homevisitsaadr = homevisitsaadr;
    }

    public String getHomevisitsaadr() {
        return this.homevisitsaadr;
    }

    public void setHomevisitsfrom(Integer homevisitsfrom) {
        this.homevisitsfrom = homevisitsfrom;
    }

    public Integer getHomevisitsfrom() {
        return this.homevisitsfrom;
    }

    public void setHomevisitsto(Integer homevisitsto) {
        this.homevisitsto = homevisitsto;
    }

    public Integer getHomevisitsto() {
        return this.homevisitsto;
    }

    public void setLsreaded(String lsreaded) {
        this.lsreaded = lsreaded;
    }

    public String getLsreaded() {
        return this.lsreaded;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getAgentid() {
        return this.agentid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getTid() {
        return this.tid;
    }

    public void setHomevisitover(String homevisitover) {
        this.homevisitover = homevisitover;
    }

    public String getHomevisitover() {
        return this.homevisitover;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentName() {
        return this.agentName;
    }

    public void setAgentcontactsName(String agentcontactsName) {
        this.agentcontactsName = agentcontactsName;
    }

    public String getAgentcontactsName() {
        return this.agentcontactsName;
    }

    public void setAgentContactsMobile(String agentContactsMobile) {
        this.agentContactsMobile = agentContactsMobile;
    }

    public String getAgentContactsMobile() {
        return this.agentContactsMobile;
    }

    public void setAgentaddress(String agentaddress) {
        this.agentaddress = agentaddress;
    }

    public String getAgentaddress() {
        return this.agentaddress;
    }

    public void setHits(String hits) {
        this.hits = hits;
    }

    public String getHits() {
        return this.hits;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    @Override
    public String toString() {
        return "Beftender [id=" + id + ", uuid=" + uuid + ", uid=" + uid + ", ttype=" + ttype + ", title=" + title
                + ", amount=" + amount + ", interestrate=" + interestrate + ", phases=" + phases + ", repaymenttype="
                + repaymenttype + ", provincecode=" + provincecode + ", provincename=" + provincename + ", citycode="
                + citycode + ", cityname=" + cityname + ", countycode=" + countycode + ", countyname=" + countyname
                + ", origin=" + origin + ", parentProvincecode=" + parentProvincecode + ", parentCitycode="
                + parentCitycode + ", parentCountycode=" + parentCountycode + ", education=" + education + ", industry="
                + industry + ", marriage=" + marriage + ", peiouname=" + peiouname + ", peiouidcard=" + peiouidcard
                + ", peioutel=" + peioutel + ", idcard=" + idcard + ", address=" + address + ", company=" + company
                + ", companytele=" + companytele + ", companyaddr=" + companyaddr + ", currentaddr=" + currentaddr
                + ", homevisitsaadr=" + homevisitsaadr + ", homevisitsfrom=" + homevisitsfrom + ", homevisitsto="
                + homevisitsto + ", lsreaded=" + lsreaded + ", agentid=" + agentid + ", tid=" + tid + ", homevisitover=" + homevisitover + ", agentName=" + agentName + ", agentcontactsName="
                + agentcontactsName + ", agentContactsMobile=" + agentContactsMobile + ", agentaddress=" + agentaddress
                + ", hits=" + hits + ", updateTime=" + updateTime + ", createTime=" + createTime + "]";
    }
}