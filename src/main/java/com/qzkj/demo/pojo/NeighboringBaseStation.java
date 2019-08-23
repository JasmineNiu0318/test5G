package com.qzkj.demo.pojo;

import java.io.Serializable;

public class NeighboringBaseStation implements Serializable {
    Integer id;
    String code;
    String arfcn;
    String pciCid;
    String rsrpSign;
    String tacLac;
    String type;


    public NeighboringBaseStation() {
    }

    public NeighboringBaseStation(Integer id, String code, String arfcn, String pciCid, String rsrpSign, String tacLac, String type) {
        this.id = id;
        this.code = code;
        this.arfcn = arfcn;
        this.pciCid = pciCid;
        this.rsrpSign = rsrpSign;
        this.tacLac = tacLac;
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

    public String getArfcn() {
        return arfcn;
    }

    public void setArfcn(String arfcn) {
        this.arfcn = arfcn;
    }

    public String getPciCid() {
        return pciCid;
    }

    public void setPciCid(String pciCid) {
        this.pciCid = pciCid;
    }

    public String getRsrpSign() {
        return rsrpSign;
    }

    public void setRsrpSign(String rsrpSign) {
        this.rsrpSign = rsrpSign;
    }

    public String getTacLac() {
        return tacLac;
    }

    public void setTacLac(String tacLac) {
        this.tacLac = tacLac;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
