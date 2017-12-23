package Week2Week3Homework;

import java.util.Scanner;

public class ArraySpiral {
	
    static void printSpiral(int m,int n,int[][] mat)
    {
    	int i, l=0,k=0;
    	int last_row=m-1, last_col=n-1;
    	
    	while(k<=last_row && l<=last_col)
    	{
    		for(i=0; i<=last_col; i++)
    		{
    			System.out.println(mat[k][i]+" ");
    		}k++;
    		
    		for(i=k; i<=last_row; i++)
    		{
    			System.out.println(mat[i][last_col]+" ");
    		}last_col--;
    		
    		if(k<=last_row)
    		{
    			for(i=last_col; i>=l; i--)
        		{
        			System.out.print(mat[last_row][i]+" ");
        		}last_row--;
    		}
    		
    		
    		if(l<=last_col)
    		{
    			for(i=last_row; i>=k; i--)
        		{
        			System.out.print(mat[i][l]+" ");
        		}l++;
    		}
    		 				
    	}
    }

	public static void main(String[] args) {
		
		
		int arrayinput[][]=new int[4][4];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Elements of the array: ");
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<4;col++)
			{
				arrayinput[row][col]=sc.nextInt();
			}
		}
		
		System.out.println("Array is: ");
		
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<4;col++)
			{
				System.out.print(arrayinput[row][col]+" ");
			}System.out.println();
		}
		
		printSpiral(4,4,arrayinput);

	}

}