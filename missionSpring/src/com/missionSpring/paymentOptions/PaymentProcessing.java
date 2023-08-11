package com.missionSpring.paymentOptions;

public class PaymentProcessing {

	public boolean paymentProcessing(String payType, String billAmt) {

		if ("CreditCard".equals(payType)) {
			CreditCard cc = new CreditCard();
			boolean res = cc.payment(billAmt);
			return res;
		} else if ("DebitCard".equals(payType)) {
			DebitCard cc = new DebitCard();
			boolean res = cc.payment(billAmt);
			return res;
		} else if ("Upi".equals(payType)) {
			Upi cc = new Upi();
			boolean res = cc.payment(billAmt);
			return res;
		} else {
			return true;
		}

	}

}
