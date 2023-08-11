package com.ioc.paymentOption;

public class PaymentProcessing {

	private PaymentInterface pay = null;

   // PaymentInterface pay1 = new CreditCard();
	
	public PaymentProcessing(PaymentInterface pay) {

		this.pay=pay;
	}

	public boolean makingPayment(String payType, String billAmt) {

		return pay.payment(billAmt);
	}
}
