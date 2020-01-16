package com.ptmd.bank;

/**
 * Bank abstract class
 * 
 * @author ANNI
 *
 */
public abstract class Bank {

	/**
	 * Account Details
	 */
	private AccountDetails accDtl;
	
	/**
	 * Loan Details
	 */
	public LoanDetails loanDtl;

	/**
	 * Constructor to create instance for it.
	 * set account details and loan details as constructor parameter.
	 * 
	 * @param accDtl
	 * @param loanDtl
	 */
	public Bank(AccountDetails accDtl, LoanDetails loanDtl) {
		this.accDtl = accDtl;
		this.loanDtl = loanDtl;
	}

	/**
	 * Display the Account Details on the console.
	 */
	public void showAccountDetails() {
		System.out.println("Account Holder Name :: " + accDtl.getAccHolderName());
		System.out.println("Account Number :: " + accDtl.getAccNo());
		System.out.println("CIF :: " + accDtl.getCifNo());
		System.out.println("IFSC :: " + accDtl.getIfsc());
		System.out.println("Address :: " + accDtl.getAddress());
		System.out.println("Phone Num :: " + accDtl.getPhoneNo());
		System.out.println("BALANCE :: " + accDtl.getBalance());
	}

	/**
	 * Display the Loan Details on the console.
	 */
	public void showLoanDetails() {
		System.out.println("PRINCIPAL :: " + loanDtl.getPrincipal());
		System.out.println("INTEREST :: " + loanDtl.getInterest());
		System.out.println("TIME :: " + loanDtl.getTime());
	}

	/**
	 * Calculate Rate of interest for the loan details.
	 * implement on the child class.
	 */
	public abstract Float rateOfInterest();

}
