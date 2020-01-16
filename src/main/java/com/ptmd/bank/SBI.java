package com.ptmd.bank;

/**
 * SBI extends Bank 
 * 
 * @author ANNI
 *
 */
public class SBI extends Bank {
	/**
	 * Loan Details
	 */
	private LoanDetails loanDtl;

	/**
	 * Constructor to create instance for it.
	 * two parameter for set account details and loan details
	 * 
	 * @param accDtl
	 * @param loanDtl
	 */
	public SBI(AccountDetails accDtl, LoanDetails loanDtl) {
		super(accDtl, loanDtl);
		// TODO Auto-generated constructor stub
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
