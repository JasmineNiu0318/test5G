package com.qzkj.demo.pojo;

public class FtpDownLoad {
    Integer id;
    Integer state;
    Integer progress;
    String avgSpeed;
    String maxSpeed;
    String currServer;

    public FtpDownLoad(Integer id, Integer state, Integer progress, String avgSpeed, String maxSpeed, String currServer) {
        this.id = id;
        this.state = state;
        this.progress = progress;
        this.avgSpeed = avgSpeed;
        this.maxSpeed = maxSpeed;
        this.currServer = currServer;
    }

    public FtpDownLoad() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
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

    public String getCurrServer() {
        return currServer;
    }

    public void setCurrServer(String currServer) {
        this.currServer = currServer;
    }
}
