package com.ioc.paymentOption;

public class DebitCard implements PaymentInterface {

	public boolean payment(String billAmt) {

		System.out.println("DebitCard payment Succesful for Amnt = "+billAmt);
		
		return true;
	}

}
