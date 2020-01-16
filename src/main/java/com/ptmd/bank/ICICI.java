package com.ptmd.bank;

/**
 * ICICI extends Bank
 * 
 * @author ANNI
 *
 */
public class ICICI extends Bank {
	
	/**
	 * Loan Details
	 */
	private LoanDetails loanDtl;

	/**
	 * Constructor to create instance for it. two parameter for set account details
	 * and loan details
	 * 
	 * @param accDtl
	 * @param loanDtl
	 */
	public ICICI(AccountDetails accDtl, LoanDetails loanDtl) {
		super(accDtl, loanDtl);
	}

	/**
	 * Rate of interest for the SBI
	 */
	@Override
	public Float rateOfInterest() {
		loanDtl = super.loanDtl;
		Float _return = (loanDtl.getPrincipal() * loanDtl.getInterest() * loanDtl.getTime()) / 100;
		return _return;
	}

}
