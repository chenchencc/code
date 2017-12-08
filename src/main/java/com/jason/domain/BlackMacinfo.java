package com.jason.domain;

import java.io.Serializable;

public class BlackMacinfo implements Serializable {
    private static final long serialVersionUID = 8918933252113037271L;
    private long id;
    private long storeId;
    private String mac;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}

