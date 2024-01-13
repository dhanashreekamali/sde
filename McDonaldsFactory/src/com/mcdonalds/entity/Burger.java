package com.mcdonalds.entity;

public class Burger {
	String patty;
	String sauce;
	/**
	 * @return the patty
	 */
	public String getPatty() {
		return patty;
	}
	/**
	 * @param patty the patty to set
	 */
	public void setPatty(String patty) {
		this.patty = patty;
	}
	/**
	 * @return the sauce
	 */
	public String getSauce() {
		return sauce;
	}
	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Burger [patty=").append(patty).append(", sauce=").append(sauce).append("]");
		return builder.toString();
	}

}
