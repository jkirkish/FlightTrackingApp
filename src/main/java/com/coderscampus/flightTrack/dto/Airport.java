package com.coderscampus.flightTrack.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Airport {
	@JsonProperty("airport_code")
    private String airportCode;

	@JsonProperty("code_icao")
    private String codeIcao;

    @JsonProperty("code_iata")
    private String codeIata;

    @JsonProperty("code_lid")
    private String codeLid;

    @JsonProperty("alternate_ident")
    private String alternateIdent;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type;

    @JsonProperty("elevation")
    private int elevation;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("longitude")
    private double longitude;

    @JsonProperty("latitude")
    private double latitude;

    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("wiki_url")
    private String wikiUrl;

    @JsonProperty("airport_flights_url")
    private String airportFlightsUrl;

    @JsonProperty("alternatives")
    private List<AlternativeAirport> alternatives;

    // Getters and setters

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getCodeIcao() {
        return codeIcao;
    }

    public void setCodeIcao(String codeIcao) {
        this.codeIcao = codeIcao;
    }

    public String getCodeIata() {
        return codeIata;
    }

    public void setCodeIata(String codeIata) {
        this.codeIata = codeIata;
    }

    public String getCodeLid() {
        return codeLid;
    }

    public void setCodeLid(String codeLid) {
        this.codeLid = codeLid;
    }

    public String getAlternateIdent() {
        return alternateIdent;
    }

    public void setAlternateIdent(String alternateIdent) {
        this.alternateIdent = alternateIdent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl =
    }
}