package com.makePayment;

import java.util.Scanner;

import com.missionSpring.paymentOptions.PaymentProcessing;

public class MakePayment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Payment Method m1(CreditCard), m2(DebitCard), m3(Upi)");
		
		
		//String m1 ="creditCard",m2="DebitCard",m3="Upi";
		
		String input = sc.next();
		String p1 ="" ;
		if (input.equals("m1")) 
		{
			 p1 = "CreditCard";
		}else if (input.equals("m2")) 
		{
			 p1 = "DebitCard";
		}else if (input.equals("m3")) 
		{
			 p1 = "Upi";
		}else {
			System.out.println("Please Give Proper Input");
		}
		
		System.out.println("Enter Amount");
		String p2 = sc.next();
		 PaymentProcessing pp = new PaymentProcessing();
		 pp.paymentProcessing(p1, p2);

	}

}
