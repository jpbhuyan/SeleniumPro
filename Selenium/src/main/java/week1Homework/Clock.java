package week1Homework;

import java.util.Scanner;

public class Clock {

	public static void main(String[] args) {
		float angle;
		System.out.println("Enter Hour");		
		Scanner sc=new Scanner(System.in);
		sc.close();
		int hour=sc.nextInt();
		
		
		System.out.println("Enter Minute");		
		Scanner sc1=new Scanner(System.in);
		sc1.close();
		int minute=sc1.nextInt();
		
		System.out.println("Time is: " +hour+":"+minute);
		
		if(hour==00 && minute==00)
		{
			angle=0;
			System.out.println("Angle is" +angle);
		}
		

	}

}
