package com.smelter.action.common;


import com.smelter.model.common.BaseParam;
import com.smelter.model.common.RequestVo;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

public class BaseAction {
    public BaseAction() {
    }

    public static <T> RequestVo<T> getRequestVo(String baseJson, String bodyJson, Class<T> clazz) {
        RequestVo vo = new RequestVo();
        if (baseJson != null && !baseJson.isEmpty()) {
            BaseParam body = (BaseParam) JSON.parseObject(baseJson, BaseParam.class);
            vo.setBase(body);
        }

        if (bodyJson != null && !bodyJson.isEmpty()) {
            Object body1 = JSON.parseObject(bodyJson, clazz);
            vo.setBody(body1);
        }

        return vo;
    }

    public static <T> RequestVo<List<T>> getRequestVoArray(String baseJson, String bodyJson, Class<T> clazz) {
        RequestVo vo = new RequestVo();
        if (baseJson != null && !baseJson.isEmpty()) {
            BaseParam body = (BaseParam) JSON.parseObject(baseJson, BaseParam.class);
            vo.setBase(body);
        }

        if (bodyJson != null && !bodyJson.isEmpty()) {
            List body1 = JSONArray.parseArray(bodyJson, clazz);
            vo.setBody(body1);
        }

        return vo;
    }

    public static RequestVo<Object> getRequestVoNoBody(String baseJson) {
        System.out.println(baseJson);
        BaseParam baseParam = (BaseParam) JSON.parseObject(baseJson, BaseParam.class);
        RequestVo vo = new RequestVo();
        vo.setBase(baseParam);
        return vo;
    }

    public static <T> RequestVo<T> getRequestVoNoBase(String bodyJson, Class<T> clazz) {
        RequestVo vo = new RequestVo();
        if (bodyJson != null && !bodyJson.isEmpty()) {
            Object body = JSON.parseObject(bodyJson, clazz);
            vo.setBody(body);
        }

        return vo;
    }
}
