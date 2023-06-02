package com.coderscampus.flightTrack.dto;

public class OperatorDTO {

	private String id;
    private IdType idType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdType getIdType() {
        return idType;
    }

    public void setIdType(IdType idType) {
        this.idType = idType;
    }

    public enum IdType {
        ICAO,
        IATA
    }
}
