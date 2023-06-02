package com.coderscampus.flightTrack.dto;

public class FlightDTO {
	
	    private String ident;
	    private IdentType identType;

	    public String getIdent() {
	        return ident;
	    }

	    public void setIdent(String ident) {
	        this.ident = ident;
	    }

	    public IdentType getIdentType() {
	        return identType;
	    }

	    public void setIdentType(IdentType identType) {
	        this.identType = identType;
	    }

	    public enum IdentType {
	        DESIGNATOR,
	        REGISTRATION
	    }
	}

