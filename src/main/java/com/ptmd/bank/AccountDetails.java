package com.ptmd.bank;

/**
 * Account Details class
 * 
 * @author ANNI
 *
 */
public class AccountDetails {

	/**
	 * Account Number
	 */
	private Long accNo;
	
	/**
	 * CIF Number
	 */
	private Long cifNo;
	
	/**
	 * IFSC code
	 */
	private String ifsc;
	
	/**
	 * Account Holder Name
	 */
	private String accHolderName;
	
	/**
	 * Address of the Holder
	 */
	private String address;
	
	/**
	 * Phone number of the Account holder
	 */
	private Long phoneNo;
	
	/**
	 * Current Balance
	 */
	private Long balance;

	/**
	 * Getter method to get Account Number
	 * 
	 * @return Account Number
	 */
	public Long getAccNo() {
		return accNo;
	}

	/**
	 * Setter method to set Account Number
	 * 
	 * @param accNo
	 */
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}

	/**
	 * Getter method to get CIF Number
	 * 
	 * @return cifNo
	 */
	public Long getCifNo() {
		return cifNo;
	}

	/**
	 * Setter method to set CIF Number
	 * 
	 * @param cifNo
	 */
	public void setCifNo(Long cifNo) {
		this.cifNo = cifNo;
	}

	/**
	 * Getter method to get IFSC code
	 * 
	 * @return IFSC
	 */
	public String getIfsc() {
		return ifsc;
	}

	/**
	 * Setter method to set IFSC code
	 * 
	 * @param ifsc
	 */
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	/**
	 * Getter method to get  Account Holder Name
	 * 
	 * @return accHolderName
	 */
	public String getAccHolderName() {
		return accHolderName;
	}

	/**
	 * Setter method to set Account Holder Name
	 * 
	 * @param accHolderName
	 */
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	/**
	 * Getter method to get address of the holder
	 * 
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Setter method to set address of the holder
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Getter method to get phone Number
	 * 
	 * @return phoneNo
	 */
	public Long getPhoneNo() {
		return phoneNo;
	}

	/**
	 * Setter method to set phone Number
	 * 
	 * @param phoneNo
	 */
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * Getter method to get current balance
	 * 
	 * @return balance
	 */
	public Long getBalance() {
		return balance;
	}

	/**
	 * Setter method to set current balance
	 * 
	 * @param balance
	 */
	public void setBalance(Long balance) {
		this.balance = balance;
	}

}
