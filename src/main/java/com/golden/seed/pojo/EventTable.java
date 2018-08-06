package com.golden.seed.pojo;

import java.util.Date;

public class EventTable {
    private Integer id;

    private String eventArticleType;

    private String eventArticleUse;

    private String eventHappenAddr;

    private Date eventHappenTime;

    private String eventRecorder;

    private String eventRecorderCompany;

    private String eventRelevantPersonnel;

    private String eventType;

    private String farmersId;

    private String remarks;

    private String seedCode;

    private String eventInfo;

    private Date eventTime;

    private String landId;

    private String seedName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventArticleType() {
        return eventArticleType;
    }

    public void setEventArticleType(String eventArticleType) {
        this.eventArticleType = eventArticleType == null ? null : eventArticleType.trim();
    }

    public String getEventArticleUse() {
        return eventArticleUse;
    }

    public void setEventArticleUse(String eventArticleUse) {
        this.eventArticleUse = eventArticleUse == null ? null : eventArticleUse.trim();
    }

    public String getEventHappenAddr() {
        return eventHappenAddr;
    }

    public void setEventHappenAddr(String eventHappenAddr) {
        this.eventHappenAddr = eventHappenAddr == null ? null : eventHappenAddr.trim();
    }

    public Date getEventHappenTime() {
        return eventHappenTime;
    }

    public void setEventHappenTime(Date eventHappenTime) {
        this.eventHappenTime = eventHappenTime;
    }

    public String getEventRecorder() {
        return eventRecorder;
    }

    public void setEventRecorder(String eventRecorder) {
        this.eventRecorder = eventRecorder == null ? null : eventRecorder.trim();
    }

    public String getEventRecorderCompany() {
        return eventRecorderCompany;
    }

    public void setEventRecorderCompany(String eventRecorderCompany) {
        this.eventRecorderCompany = eventRecorderCompany == null ? null : eventRecorderCompany.trim();
    }

    public String getEventRelevantPersonnel() {
        return eventRelevantPersonnel;
    }

    public void setEventRelevantPersonnel(String eventRelevantPersonnel) {
        this.eventRelevantPersonnel = eventRelevantPersonnel == null ? null : eventRelevantPersonnel.trim();
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public String getFarmersId() {
        return farmersId;
    }

    public void setFarmersId(String farmersId) {
        this.farmersId = farmersId == null ? null : farmersId.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getSeedCode() {
        return seedCode;
    }

    public void setSeedCode(String seedCode) {
        this.seedCode = seedCode == null ? null : seedCode.trim();
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo == null ? null : eventInfo.trim();
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public String getLandId() {
        return landId;
    }

    public void setLandId(String landId) {
        this.landId = landId == null ? null : landId.trim();
    }

    public String getSeedName() {
        return seedName;
    }

    public void setSeedName(String seedName) {
        this.seedName = seedName == null ? null : seedName.trim();
    }
}