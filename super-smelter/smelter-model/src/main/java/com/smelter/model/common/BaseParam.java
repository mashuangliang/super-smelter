package com.smelter.model.common;

import java.io.Serializable;

public class BaseParam implements Serializable {
    private String device_token;
    private String devicename;
    private String devicetype;
    private String deviceid;
    private String appversion;
    private String timestamp;
    private String sessionid;
    private String lon;
    private String lat;
    private String uuid;
    private String ip;
    private String networkope;
    private String nettype;
    private String channel_size;
    private String act_size;
    private String platform;
    private String sign;

    public BaseParam() {
    }

    public String getDevice_token() {
        return this.device_token;
    }

    public void setDevice_token(String device_token) {
        this.device_token = device_token;
    }

    public String getDevicename() {
        return this.devicename == null?"":this.devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getDevicetype() {
        return this.devicetype == null?"":this.devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public String getDeviceid() {
        return this.deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getAppversion() {
        return this.appversion;
    }

    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSessionid() {
        return this.sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getLon() {
        return this.lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNetworkope() {
        return this.networkope;
    }

    public void setNetworkope(String networkope) {
        this.networkope = networkope;
    }

    public String getChannel_size() {
        return this.channel_size;
    }

    public void setChannel_size(String channel_size) {
        this.channel_size = channel_size;
    }

    public String getAct_size() {
        return this.act_size;
    }

    public void setAct_size(String act_size) {
        this.act_size = act_size;
    }

    public String getPlatform() {
        return this.platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getNettype() {
        return this.nettype;
    }

    public void setNettype(String nettype) {
        this.nettype = nettype;
    }

    public static void main(String[] args) {
    }
}
