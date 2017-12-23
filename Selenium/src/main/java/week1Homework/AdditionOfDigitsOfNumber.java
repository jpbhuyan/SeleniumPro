package week1Homework;

import java.util.Scanner;

public class AdditionOfDigitsOfNumber {

	public static void main(String[] args) {
		
		int store,add=0;

		System.out.println("Enter a number:");
		
		Scanner num=new Scanner(System.in);
		num.close();
		int abc=num.nextInt();
		
		while(abc%10>1)
		{
			store=abc%10;
			add=add+store;
			
			abc=abc/10;
			
		}
		
		System.out.println("Addition of digits are: "+add);
	}

}
