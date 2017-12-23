package week1Homework;
import java.util.Scanner;


public class MonHw {
public static void main(String[] args) {
		
	     int output;
	     
		 System.out.println("Enter two numbers:");
		 
		 Scanner sc1= new Scanner(System.in);
		 int num1=sc1.nextInt();
		 
		 Scanner sc2=new Scanner(System.in);
		 int num2=sc2.nextInt();
		 
		 System.out.println("Enter the arithmatic operation to be performed Add/Sub/Mul/Div");
		 
		 Scanner sc3=new Scanner(System.in);
		 String s=sc3.nextLine();
		 
		 sc1.close();
		 sc2.close();
		 sc3.close();
		 
		 if(s.equals("Add"))
		 {
			 output=num1+num2;
			 System.out.println("Addition is: "+output);
		 }
		 else if(s.equals("Sub"))
		 {
			 if(num1>num2)
			 {
				 output=num1-num2;
				 System.out.println("Substraction is: "+output);
			 }
			 else if(num1<num2)
			 {
				 output=num2-num1;
				 System.out.println("Substraction is: "+output);				 
			 }
			 else
				 System.out.println("Substtaction is 0");
		 }
		 else if(s.equals("Mul"))
		 {
			 output=num1*num2;
			 System.out.println("Multiplication is: "+output);
		 }
		 else if(s.equals("Div"))
		 {
			 try{
				 output=num1/num2;
				 System.out.println("Division is: "+output);
			 }
			 catch(ArithmeticException a)
			 {
				 System.out.println("Cant be divided by 0" +a);
			 }
			 
				 
					 
						 
		 }
		 else
			 System.out.println("Write correct operation to be performed");

	}

}
