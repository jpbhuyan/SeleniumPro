package Week2Week3Homework;


import java.util.Scanner;

public class ArrayDiagonal {
	
	static void sumAccrossDiagonal(int m, int n, int mat[][])
	{
		
		int i, l=0,k=0;
    	int last_row=m-1, last_col=n-1;
    	int sum_upper=0, sum_low=0;
    	
    	while(k<=last_row)
    	{
    		for(i=0; i<=last_col-1; i++)         
    		{
    			System.out.print(mat[k][i]+" ");
    			sum_upper=sum_upper+mat[k][i];
    		}k++;last_col--;
    	}last_row=m-1; last_col=n-1;
    	
    	System.out.println("Addition of upper diagonal numbers: " +sum_upper);
    	
    	while(l<=last_col)
    	{
    		for(i=last_col; i>l; i--)           
    		{
    			System.out.print(mat[last_row][i]+" ");
    			sum_low=sum_low+mat[last_row][i];
    		}last_row--;l++;
    	}
    	System.out.println("Addition of lower diagonal numbers: " +sum_low);
  
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the matrix");
		Scanner sc1=new Scanner(System.in);
		int N=sc1.nextInt();
		
		
		int[][] arrayinput=new int[N][N];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Elements of the array: ");
		for(int row=0;row<N;row++)
		{
			for(int col=0;col<N;col++)
			{
				arrayinput[row][col]=sc.nextInt();
			}
		}
		
		System.out.println("Array is: ");
		
		for(int row=0;row<N;row++)
		{
			for(int col=0;col<N;col++)
			{
				System.out.print(arrayinput[row][col]+" ");
			}System.out.println();System.out.println();
		}
		
		sumAccrossDiagonal(N, N, arrayinput);

	}



	}


