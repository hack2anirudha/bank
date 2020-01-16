package com.ptmd.bank;

/**
 * CustomerAccount to create the customer for the implementation
 * 
 * @author ANNI
 *
 */
public class CustomerAccount {

	/**
	 * Bank
	 */
	private Bank bank;

	/**
	 * Support to create customer of SBI, HDFC and ICICI.
	 * set an object of HDFC, ICICI, of SBI.
	 * 
	 * @exception runtime exception 
	 * @param obj
	 */
	public void createCustomers(Object obj) {
		if (obj instanceof HDFC || obj instanceof SBI || obj instanceof ICICI) {
			bank = (Bank) obj;
		} else {
			throw new RuntimeException("Bank not found");
		}
	}

	/**
	 * Display account details of the customer
	 */
	public void displayAccount() {
		bank.showAccountDetails();
	}

	/**
	 * Display loan details of the customer
	 */
	public void displayLoan() {
		bank.showLoanDetails();
	}

	/**
	 * display rate of interest for customer
	 */
	public void displayRateOfIntrest() {
		System.out.println("Rate of Intrest :: "+bank.rateOfInterest());
	}

}
