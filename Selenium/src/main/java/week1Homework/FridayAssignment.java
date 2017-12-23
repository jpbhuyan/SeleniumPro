package week1Homework;

public class FridayAssignment {

	public static void main(String[] args) {
		
		for(int i=8; i<17; i++)
		{
			if(i%3==0 && i%5!=0)
				System.out.print(" FIZZ ");
			else if(i%5==0 && i%3!=0 )
				System.out.print(" BUZZ ");
			else if(i%3==0 && i%5==0)
				System.out.print(" FIZZBUZZ ");
			else
				System.out.print(" "+i+" ");
		}
			

	}

}
