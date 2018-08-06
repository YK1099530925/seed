package com.golden.seed.pojo;

public class CompanyTable {
    private Integer id;

    private String companyAddress;

    private String companyId;

    private String companyName;

    private String companyTelephone;

    private String password;

    private String passwordId;

    private String passwordTel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyTelephone() {
        return companyTelephone;
    }

    public void setCompanyTelephone(String companyTelephone) {
        this.companyTelephone = companyTelephone == null ? null : companyTelephone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPasswordId() {
        return passwordId;
    }

    public void setPasswordId(String passwordId) {
        this.passwordId = passwordId == null ? null : passwordId.trim();
    }

    public String getPasswordTel() {
        return passwordTel;
    }

    public void setPasswordTel(String passwordTel) {
        this.passwordTel = passwordTel == null ? null : passwordTel.trim();
    }
}