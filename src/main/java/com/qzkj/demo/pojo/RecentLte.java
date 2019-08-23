package com.qzkj.demo.pojo;



public class RecentLte {
    Integer id;
    String code;
    String cellId;
    String eNB;
    String pci;
    Integer rsrp;
    Integer sinr;
    Integer tac;
    String time;

    public RecentLte() {
    }

    public RecentLte(Integer id, String code, String cellId, String eNB, String pci, Integer rsrp, Integer sinr, Integer tac, String time) {
        this.id = id;
        this.code = code;
        this.cellId = cellId;
        this.eNB = eNB;
        this.pci = pci;
        this.rsrp = rsrp;
        this.sinr = sinr;
        this.tac = tac;
        this.time = time;
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

    public String getCellId() {
        return cellId;
    }

    public void setCellId(String cellId) {
        this.cellId = cellId;
    }

    public String geteNB() {
        return eNB;
    }

    public void seteNB(String eNB) {
        this.eNB = eNB;
    }

    public String getPci() {
        return pci;
    }

    public void setPci(String pci) {
        this.pci = pci;
    }

    public Integer getRsrp() {
        return rsrp;
    }

    public void setRsrp(Integer rsrp) {
        this.rsrp = rsrp;
    }

    public Integer getSinr() {
        return sinr;
    }

    public void setSinr(Integer sinr) {
        this.sinr = sinr;
    }

    public Integer getTac() {
        return tac;
    }

    public void setTac(Integer tac) {
        this.tac = tac;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
