package com.api.response.pojo;

public class Fairings {
	
	private String reused;
	private boolean recovery_attempt;
	private boolean recovered;
	private String[] ships;
	public String getReused() {
		return reused;
	}
	public void setReused(String reused) {
		this.reused = reused;
	}
	public boolean isRecovery_attempt() {
		return recovery_attempt;
	}
	public void setRecovery_attempt(boolean recovery_attempt) {
		this.recovery_attempt = recovery_attempt;
	}
	public boolean isRecovered() {
		return recovered;
	}
	public void setRecovered(boolean recovered) {
		this.recovered = recovered;
	}
	public String[] getShips() {
		return ships;
	}
	public void setShips(String[] ships) {
		this.ships = ships;
	}
	
	

}
