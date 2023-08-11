package com.ioc.paymentOption;

public class CreditCard implements PaymentInterface {
	public boolean payment(String billAmt) {
		System.out.println("CreditCard payment succcessful for Amount "+billAmt);
		return true;
	}
}
