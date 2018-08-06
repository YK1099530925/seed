package com.golden.seed.pojo;

public class EventTypeTable {
    private Integer id;

    private String eventType;

    private String farmerid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType == null ? null : eventType.trim();
    }

    public String getFarmerid() {
        return farmerid;
    }

    public void setFarmerid(String farmerid) {
        this.farmerid = farmerid == null ? null : farmerid.trim();
    }

	@Override
	public String toString() {
		return "EventTypeTable [id=" + id + ", eventType=" + eventType + ", farmerid=" + farmerid + "]";
	}
    
}