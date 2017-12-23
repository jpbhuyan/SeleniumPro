package week1Homework;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		int j=0;
		
       System.out.println("Enter a number:");
		
		Scanner num=new Scanner(System.in);
		
		int a=num.nextInt();
		num.close();
		for(int i=1; i<=10; i++)
		{
			
			j=j+1;
			System.out.println(a +" * "+j+" = " +(j*a)  );
			
		}

	}

}
