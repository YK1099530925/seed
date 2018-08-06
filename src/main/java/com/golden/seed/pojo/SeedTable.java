package com.golden.seed.pojo;

import java.util.Date;

public class SeedTable {
    private Integer id;

    private String seedCode;

    private String seedTraceability;

    private String farmerId;

    private String seedName;

    private Date storageTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSeedCode() {
        return seedCode;
    }

    public void setSeedCode(String seedCode) {
        this.seedCode = seedCode == null ? null : seedCode.trim();
    }

    public String getSeedTraceability() {
        return seedTraceability;
    }

    public void setSeedTraceability(String seedTraceability) {
        this.seedTraceability = seedTraceability == null ? null : seedTraceability.trim();
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId == null ? null : farmerId.trim();
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        this.seedName = seedName == null ? null : seedName.trim();
    }

    public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }
}