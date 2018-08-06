package com.golden.seed.pojo;

public class FarmerTable {
    private Integer id;

    private String farmersAddress;

    private String farmersId;

    private String farmersName;

    private String farmersSex;

    private String farmersTelephone;

    private String password;

    @Override
	public String toString() {
		return "FarmerTable [id=" + id + ", farmersAddress=" + farmersAddress + ", farmersId=" + farmersId
				+ ", farmersName=" + farmersName + ", farmersSex=" + farmersSex + ", farmersTelephone="
				+ farmersTelephone + ", password=" + password + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFarmersAddress() {
        return farmersAddress;
    }

    public void setFarmersAddress(String farmersAddress) {
        this.farmersAddress = farmersAddress == null ? null : farmersAddress.trim();
    }

    public String getFarmersId() {
        return farmersId;
    }

    public void setFarmersId(String farmersId) {
        this.farmersId = farmersId == null ? null : farmersId.trim();
    }

    public String getFarmersName() {
        return farmersName;
    }

    public void setFarmersName(String farmersName) {
        this.farmersName = farmersName == null ? null : farmersName.trim();
    }

    public String getFarmersSex() {
        return farmersSex;
    }

    public void setFarmersSex(String farmersSex) {
        this.farmersSex = farmersSex == null ? null : farmersSex.trim();
    }

    public String getFarmersTelephone() {
        return farmersTelephone;
    }

    public void setFarmersTelephone(String farmersTelephone) {
        this.farmersTelephone = farmersTelephone == null ? null : farmersTelephone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}