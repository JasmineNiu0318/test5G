package com.qzkj.demo.pojo;

public class NetworkInfo {
    Integer id;
    String code;
    String cellId;
    String ci;
    String eNB;
    String earfcn;
    Integer pci;
    Integer rsrp;
    Integer rsrq;
    Integer sinr;
    String tac;
    String type;

    public NetworkInfo(){

    }

    public NetworkInfo(Integer id, String code, String cellId, String ci, String eNB, String earfcn, Integer pci, Integer rsrp, Integer rsrq, Integer sinr, String tac, String type) {
        this.id = id;
        this.code = code;
        this.cellId = cellId;
        this.ci = ci;
        this.eNB = eNB;
        this.earfcn = earfcn;
        this.pci = pci;
        this.rsrp = rsrp;
        this.rsrq = rsrq;
        this.sinr = sinr;
        this.tac = tac;
        this.type = type;
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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String geteNB() {
        return eNB;
    }

    public void seteNB(String eNB) {
        this.eNB = eNB;
    }

    public String getEarfcn() {
        return earfcn;
    }

    public void setEarfcn(String earfcn) {
        this.earfcn = earfcn;
    }

    public Integer getPci() {
        return pci;
    }

    public void setPci(Integer pci) {
        this.pci = pci;
    }

    public Integer getRsrp() {
        return rsrp;
    }

    public void setRsrp(Integer rsrp) {
        this.rsrp = rsrp;
    }

    public Integer getRsrq() {
        return rsrq;
    }

    public void setRsrq(Integer rsrq) {
        this.rsrq = rsrq;
    }

    public Integer getSinr() {
        return sinr;
    }

    public void setSinr(Integer sinr) {
        this.sinr = sinr;
    }

    public String getTac() {
        return tac;
    }

    public void setTac(String tac) {
        this.tac = tac;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
