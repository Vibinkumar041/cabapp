package com.vibin;

import java.util.Scanner;

public class main {
public static void main(String[] args) {
	//login
	System.out.println("-----Please enter valid details-----");
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the mobnum(10 digit)=");
	long mobNum=sc.nextLong();
	System.out.print("Enter the password=");
	String passWord=sc.next();
	reuse.logInCheck(mobNum, passWord);
	System.out.println("CAB TYPES:\n1.MINI(10rs/km)\n2.MICRO(15rs/km)\n3.PREMIUM(20rs/km)");
	System.out.print("Enter your choice=");
	int choice=sc.nextInt();
	System.out.print("Enter the km=");
	int km=sc.nextInt();
	int price=reuse.priceEstimater(choice,km);
	System.out.println("The amount without gst for normal person="+price);
	double priceGst=reuse.gst(price);
	System.out.println("The amount with gst="+priceGst);
	System.out.print("Enter the journey date(YYYY-MM-DD)=");
	String journeyDate=sc.next();
	System.out.print("Enter the journey time(HH-MM-SS)=");
	String journeyTime=sc.next();
	reuse.dateTimeCheck(journeyDate,journeyTime);
	boolean peakTime=reuse.checkPeakTime(journeyTime);
	System.out.print("Enter the DOB(YYYY-MM-DD)=");
	String Dob=sc.next();
	boolean seniorCitizen=reuse.checkSeniorCitizen(Dob);
	if(seniorCitizen==true) {
		double seniorCitizenPrice=reuse.seniorCitizenPrice(priceGst);
		System.out.println("Due to senior citizen(age above 60) the amount will be="+seniorCitizenPrice);
	}
	if(peakTime==true)
	{
	double peakGstPrice=reuse.peakPrice(priceGst);
	System.out.println("The amount due to peaktime for normal person ="+peakGstPrice);
	boolean seniorCitizen1=reuse.checkSeniorCitizen(Dob);
	if(seniorCitizen==true) {
		double seniorCitizenPrice=peakGstPrice/2;
		System.out.println("The amount for Senior Citizen(age above 60) during peak time="+seniorCitizenPrice);
	}
	
	}
}
}