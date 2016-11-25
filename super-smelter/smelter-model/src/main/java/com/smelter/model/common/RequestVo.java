package com.smelter.model.common;

import java.io.Serializable;

public class RequestVo<T> implements Serializable {
    private BaseParam base;
    private T body;

    public RequestVo() {
    }

    public BaseParam getBase() {
        return this.base;
    }

    public void setBase(BaseParam base) {
        this.base = base;
    }

    public T getBody() {
        return this.body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
