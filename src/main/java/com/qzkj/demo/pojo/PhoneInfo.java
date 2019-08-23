package com.qzkj.demo.pojo;

public class PhoneInfo {
    Integer id;
    String code;
    String dataAtivity;
    String dataModel;
    String imei;
    String imsi;
    String internetType;
    String phoneName;
    String phoneType;
    String systemm;

    public PhoneInfo(){

    }

    public PhoneInfo(Integer id, String code, String dataAtivity, String dataModel, String imei, String imsi, String internetType, String phoneName, String phoneType, String systemm) {
        this.id = id;
        this.code = code;
        this.dataAtivity = dataAtivity;
        this.dataModel = dataModel;
        this.imei = imei;
        this.imsi = imsi;
        this.internetType = internetType;
        this.phoneName = phoneName;
        this.phoneType = phoneType;
        this.systemm = systemm;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataAtivity() {
        return dataAtivity;
    }

    public void setDataAtivity(String dataAtivity) {
        this.dataAtivity = dataAtivity;
    }

    public String getDataModel() {
        return dataModel;
    }

    public void setDataModel(String dataModel) {
        this.dataModel = dataModel;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getInternetType() {
        return internetType;
    }

    public void setInternetType(String internetType) {
        this.internetType = internetType;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getSystemm() {
        return systemm;
    }

    public void setSystemm(String systemm) {
        this.systemm = systemm;
    }
}
