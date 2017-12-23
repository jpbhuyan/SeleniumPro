package week1Homework;

import java.util.Scanner;



public class ReverseANumber {

	public static void main(String[] args) {
		
		
		int store=0,var1,count=0,rev=0;
		System.out.println("Enter a number:");
		Scanner num=new Scanner(System.in);
		num.close();
		int abc=num.nextInt();
		int abccpy=abc;     //Creating a copy of the entered number so that for the second while loop, the value will be unchanged
		
		while(abc%10>1)     //1st while loop just to calculate the digits to get the count
		{
			abc=abc/10;
			count=count+1;
			
		}
		
	    while(abccpy%10>1)   //2nd While loop to reverse the number
		{
			
			var1=abccpy%10;
			int a=(int)Math.pow(10, count-1); 
			store=var1*a;
			count=count-1;
			rev=store+rev;
			abccpy=abccpy/10;
								
		}
		System.out.println("Reverse Number is: "+rev);
		

	}

}
