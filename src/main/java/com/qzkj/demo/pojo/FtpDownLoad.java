package com.qzkj.demo.pojo;

public class FtpDownLoad {
    Integer id;
    String eNB;
    String avgSpeed;
    String maxSpeed;
    String testTime;

    public FtpDownLoad(Integer id, String eNB, String avgSpeed, String maxSpeed, String testTime) {
        this.id = id;
        this.eNB = eNB;
        this.avgSpeed = avgSpeed;
        this.maxSpeed = maxSpeed;
        this.testTime = testTime;
    }

    public FtpDownLoad() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String geteNB() {
        return eNB;
    }

    public void seteNB(String eNB) {
        this.eNB = eNB;
    }

    public String getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(String avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTestTime() {
        return testTime;
    }

    public void setTestTime(String testTime) {
        this.testTime = testTime;
    }
}
