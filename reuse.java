package com.vibin;
import java.time.LocalDate;
import java.time.LocalTime;
public class reuse {
public static boolean logInCheck(long mobNum,String passWord) {
	long mobNum1=9659644868L;
	String passWord1="vibin";
	boolean isvalid=false;
	if(mobNum1==mobNum) {
		if(passWord.equals(passWord1)) {
			System.out.println("Valid user");
			return true;
		}
	}System.out.println("Invalid user");
	return isvalid;
}
	public static int priceEstimater(int choice,int km) {
		int priceEstimation=0;
		switch(choice) {
		case 1:
			int price1=10;
			int priceEstimation1=km*price1;
			return priceEstimation1;

		case 2:
			int price2=15;
			int priceEstimation2=km*price2;
			return priceEstimation2;
		
		case 3:
			int price3=20;
			int priceEstimation3=km*price3;
			return priceEstimation3;
		}
		if(choice>3) {
			System.out.println("Enter the correct cab number");
		}
		return priceEstimation;
	}
	public static double gst(int price) {
		int gst=7;
		double priceGst=((double)gst/100*price)+price;
		return priceGst;
	}
	public static boolean dateTimeCheck(String date,String time) {
		LocalDate journeyDate=LocalDate.parse(date);
		LocalTime journeyTime=LocalTime.parse(time);
		LocalDate currentDate=LocalDate.now();
		LocalTime currentTime=LocalTime.now();
		boolean isvalid=false;
		if(journeyDate.isAfter(currentDate)) {
				System.out.println("Valid Date & Time");
				return true;
			}
		System.out.println("Invalid Date & Time");
		return isvalid;
}
	public static boolean checkPeakTime(String time) {
		LocalTime journeyTime=LocalTime.parse(time);
		int hour=journeyTime.getHour();
		if(hour>=17 && hour<=19) {
			System.out.println("Peak hour");
			return true;
		}return false;
	}
	public static double peakPrice(double priceGst) {
		double peakGst=1.25;
		double peakGstPrice=(1.25/100*priceGst)+priceGst;
		return peakGstPrice;
	}
	public static boolean checkSeniorCitizen(String date) {
		LocalDate dob=LocalDate.parse(date);
		int dobYear=dob.getYear();
		LocalDate now=LocalDate.now();
		int nowYear=now.getYear();
		int age=nowYear-dobYear;
		if(age>=60) {
			return true;
		}return false;
	}
	public static double seniorCitizenPrice(double price) {
	double seniorCitizenPrice=price/2;
	return seniorCitizenPrice;
	}
}