package com.golden.seed.pojo;

public class LandTable {
    private Integer id;

    private String farmerId;

    private String landAddress;

    private String landId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFarmerId() {
        return farmerId;
    }

    public void setFarmerId(String farmerId) {
        this.farmerId = farmerId == null ? null : farmerId.trim();
    }

    public String getLandAddress() {
        return landAddress;
    }

    public void setLandAddress(String landAddress) {
        this.landAddress = landAddress == null ? null : landAddress.trim();
    }

    public String getLandId() {
        return landId;
    }

    public void setLandId(String landId) {
        this.landId = landId == null ? null : landId.trim();
    }
}