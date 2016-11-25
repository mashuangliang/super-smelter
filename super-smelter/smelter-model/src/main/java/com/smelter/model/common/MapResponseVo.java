package com.smelter.model.common;


import com.smelter.constant.ResponseCode;

import java.util.HashMap;
import java.util.Map;

public class MapResponseVo extends ResponseVo<Map<String, Object>> {
    public MapResponseVo() {
    }

    public static MapResponseVo getInstance() {
        return new MapResponseVo();
    }

    public static MapResponseVo getInstance(ResponseCode resCode, Map<String, Object> data) {
        MapResponseVo vo = new MapResponseVo();
        vo.code = resCode.getCode();
        vo.msg = resCode.getMsg();
        vo.data = data;
        return vo;
    }

    public MapResponseVo add(String key, Object value) {
        if(this.data == null) {
            this.data = new HashMap();
        }

        ((Map)this.data).put(key, value);
        return this;
    }

    public void setResCode(ResponseCode resCode) {
        this.code = resCode.getCode();
        this.msg = resCode.getMsg();
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map getData() {
        return (Map)this.data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
