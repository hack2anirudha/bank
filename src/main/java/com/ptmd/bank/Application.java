package com.ptmd.bank;

/**
 * Executable java class with main method
 * 
 * @author ANNI
 *
 */
public class Application {
	/**
	 * main method to start the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Create Customer for the HDFC Bank
		 */

		// create Customer
		CustomerAccount customer1 = new CustomerAccount();

		// create Account Details and set all the data
		AccountDetails accDtlCustomer1 = new AccountDetails();
		accDtlCustomer1.setAccNo(45698532569L);
		accDtlCustomer1.setAccHolderName("Sakira");
		accDtlCustomer1.setAddress("New Delhi");
		accDtlCustomer1.setCifNo(1539247865L);
		accDtlCustomer1.setIfsc("HDFC00045");
		accDtlCustomer1.setPhoneNo(8067018159L);
		accDtlCustomer1.setBalance(589645L);

		// create Loan Details and set all the data
		LoanDetails loanDtlCustomer1 = new LoanDetails();
		loanDtlCustomer1.setPrincipal(45876f);
		loanDtlCustomer1.setInterest(12f);
		loanDtlCustomer1.setTime(6);

		// Create HDFC account
		// set account details and loan details
		HDFC hdfc = new HDFC(accDtlCustomer1, loanDtlCustomer1);
		// create account of HDFC
		customer1.createCustomers(hdfc);
		// display account details
		customer1.displayAccount();
		// display loan details
		customer1.displayLoan();
		// display rate of interest
		customer1.displayRateOfIntrest();

		/**
		 * Create Customer for the ICICI Bank
		 */

		// create Customer
		CustomerAccount customer2 = new CustomerAccount();

		// create Account Details and set all the data
		AccountDetails accDtlCustomer2 = new AccountDetails();
		accDtlCustomer2.setAccNo(78123654856L);
		accDtlCustomer2.setAccHolderName("John");
		accDtlCustomer2.setAddress("Pune");
		accDtlCustomer2.setCifNo(963589624L);
		accDtlCustomer2.setIfsc("ICICI00756");
		accDtlCustomer2.setPhoneNo(7008002144L);
		accDtlCustomer2.setBalance(975624L);

		// create Loan Details and set all the data
		LoanDetails loanDtlCustomer2 = new LoanDetails();
		loanDtlCustomer2.setPrincipal(78632f);
		loanDtlCustomer2.setInterest(18f);
		loanDtlCustomer2.setTime(4);

		// Create HDFC account
		// set account details and loan details
		ICICI icici = new ICICI(accDtlCustomer2, loanDtlCustomer2);
		// create account of HDFC
		customer2.createCustomers(icici);
		// display account details
		customer2.displayAccount();
		// display loan details
		customer2.displayLoan();
		// display rate of interest
		customer2.displayRateOfIntrest();

		/**
		 * Create Customer for the SBI Bank
		 */

		// create Customer
		CustomerAccount customer3 = new CustomerAccount();

		// create Account Details and set all the data
		AccountDetails accDtlCustomer3 = new AccountDetails();
		accDtlCustomer3.setAccNo(65324158967L);
		accDtlCustomer3.setAccHolderName("Charle");
		accDtlCustomer3.setAddress("Chenai");
		accDtlCustomer3.setCifNo(7569584751L);
		accDtlCustomer3.setIfsc("SBI00012");
		accDtlCustomer3.setPhoneNo(9437358944L);
		accDtlCustomer3.setBalance(9975145L);

		// create Loan Details and set all the data
		LoanDetails loanDtlCustomer3 = new LoanDetails();
		loanDtlCustomer3.setPrincipal(485692F);
		loanDtlCustomer3.setInterest(14f);
		loanDtlCustomer3.setTime(8);

		// Create HDFC account
		// set account details and loan details
		SBI sbi = new SBI(accDtlCustomer3, loanDtlCustomer3);
		// create account of HDFC
		customer3.createCustomers(sbi);
		// display account details
		customer3.displayAccount();
		// display loan details
		customer3.displayLoan();
		// display rate of interest
		customer3.displayRateOfIntrest();
	}
}
