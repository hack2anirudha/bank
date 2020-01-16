package com.ptmd.bank;

/**
 * LOAN Details class
 * 
 * @author ANNI
 *
 */
public class LoanDetails {

	/**
	 * PRINCIPAL of loan
	 */
	private Float principal;
	
	/**
	 * INTEREST for loan
	 */
	private Float interest;
	
	/**
	 * TIME period for loan
	 */
	private Integer time;

	/**
	 * Getter method to get principal of the loan
	 * 
	 * @return principal
	 */
	public Float getPrincipal() {
		return principal;
	}

	/**
	 * Setter method to set principal for the loan
	 * 
	 * @param principal
	 */
	public void setPrincipal(Float principal) {
		this.principal = principal;
	}

	/**
	 * Getter method to get principal of the loan
	 * 
	 * @return principal
	 */
	public Float getInterest() {
		return interest;
	}

	/**
	 * Setter method to set interest for the loan
	 * 
	 * @param interest
	 */
	public void setInterest(Float interest) {
		this.interest = interest;
	}

	/**
	 * Getter method to get time of the loan
	 * 
	 * @return time
	 */
	public Integer getTime() {
		return time;
	}

	/**
	 * Setter method to set time for the loan
	 * 
	 * @param time
	 */
	public void setTime(Integer time) {
		this.time = time;
	}

}
