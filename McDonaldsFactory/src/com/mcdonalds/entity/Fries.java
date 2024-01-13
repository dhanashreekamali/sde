package com.mcdonalds.entity;

public class Fries {
	boolean isSalted; 
	boolean isPeried;
	/**
	 * @return the isSalted
	 */
	public boolean isSalted() {
		return isSalted;
	}
	/**
	 * @param isSalted the isSalted to set
	 */
	public void setSalted(boolean isSalted) {
		this.isSalted = isSalted;
	}
	/**
	 * @return the isPeried
	 */
	public boolean isPeried() {
		return isPeried;
	}
	/**
	 * @param isPeried the isPeried to set
	 */
	public void setPeried(boolean isPeried) {
		this.isPeried = isPeried;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fries [isSalted=").append(isSalted).append(", isPeried=").append(isPeried).append("]");
		return builder.toString();
	}
}
