package com.ioc.paymentOption;

public class Upi implements PaymentInterface {

	public boolean payment(String billAmt) {
		System.out.println("UPI payment succcessful for Amount "+billAmt);
		return true;
	}

	

}
