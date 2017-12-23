package Week2Week3Homework;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		System.out.println("String before removing duplicate characters is: "+str);
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			
			System.out.println(c);
			
		}
		

	}

}
