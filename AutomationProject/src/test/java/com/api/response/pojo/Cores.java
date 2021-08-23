package com.api.response.pojo;

public class Cores {
	private String core;
	private int flight;
	private boolean gridfins;
	private boolean legs;
	private boolean reused;
	private boolean landing_attempt;
	private boolean landing_success;
	private String landing_type;
	private String landpad;
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public int getFlight() {
		return flight;
	}
	public void setFlight(int flight) {
		this.flight = flight;
	}
	public boolean isGridfins() {
		return gridfins;
	}
	public void setGridfins(boolean gridfins) {
		this.gridfins = gridfins;
	}
	public boolean isLegs() {
		return legs;
	}
	public void setLegs(boolean legs) {
		this.legs = legs;
	}
	public boolean isReused() {
		return reused;
	}
	public void setReused(boolean reused) {
		this.reused = reused;
	}
	public boolean isLanding_attempt() {
		return landing_attempt;
	}
	public void setLanding_attempt(boolean landing_attempt) {
		this.landing_attempt = landing_attempt;
	}
	public boolean isLanding_success() {
		return landing_success;
	}
	public void setLanding_success(boolean landing_success) {
		this.landing_success = landing_success;
	}
	public String getLanding_type() {
		return landing_type;
	}
	public void setLanding_type(String landing_type) {
		this.landing_type = landing_type;
	}
	public String getLandpad() {
		return landpad;
	}
	public void setLandpad(String landpad) {
		this.landpad = landpad;
	}
	
	

}
