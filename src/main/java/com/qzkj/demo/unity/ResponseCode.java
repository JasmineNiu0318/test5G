package com.qzkj.demo.unity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResponseCode implements Serializable {
    private int code;
    private String msg;
    private Map<Object, Object> date;
    private int count;
    private String totol;
    private int page_number;

    public int getPage_number() {
        return this.page_number;
    }


    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }


    public String getTotol() {
        return this.totol;
    }


    public void setTotol(String totol) {
        this.totol = totol;
    }

    public ResponseCode(int code, String msg, Map<Object, Object> date, int count, String totol, int page_number) {
        this.date = new HashMap();
        this.code = code;
        this.msg = msg;
        this.date = date;
        this.count = count;
        this.totol = totol;
        this.page_number = page_number;
    }


    public int getCount() {
        return this.count;
    }


    public void setCount(int count) {
        this.count = count;
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


    public Map<Object, Object> getDate() {
        return this.date;
    }


    public void setDate(Map<Object, Object> date) {
        this.date = date;
    }

    public ResponseCode(int code, String msg) {
        this.date = new HashMap();
        this.code = code;
        this.msg = msg;
    }

    public ResponseCode(int code, String msg, Map<Object, Object> date) {
        this.date = new HashMap();
        this.code = code;
        this.msg = msg;
        this.date = date;
    }

    public ResponseCode() {
        this.date = new HashMap();
    }

    public ResponseCode(int code, String msg, Map<Object, Object> date, int count) {
        this.date = new HashMap();
        this.code = code;
        this.msg = msg;
        this.date = date;
        this.count = count;
    }


    public String toString() {
        return "ResponseCode{code=" + this.code + ", msg='" + this.msg + '/' + ", date=" + this.date + ", count=" + this.count + ", page_number=" + this.page_number + '}';
    }


    public static ResponseCode OK() {
        return new ResponseCode(200, "ok");
    }


    public static ResponseCode UNKNOWNERROR() {
        return new ResponseCode(220, "error");
    }
}
