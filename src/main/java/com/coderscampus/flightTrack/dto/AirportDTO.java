package com.coderscampus.flightTrack.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirportDTO {
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
        IATA,
        LID
    }
}