package com.ioc.makepayment;

import com.ioc.paymentOption.CreditCard;
import com.ioc.paymentOption.PaymentProcessing;

public class MakePayment {

	public static void main(String[] args) {
		
		PaymentProcessing pp = new PaymentProcessing(new CreditCard());
		pp.makingPayment("CreditCard", "1334");
		

	}

}
