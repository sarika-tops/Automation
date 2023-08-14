package AssignmentProgram;

import java.util.Scanner;

// Q.1. W.A.J.P to Take three numbers from the user and print the greatest number.

public class GreatestNumber {
	    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of i");
		int i = sc.nextInt();
		System.out.println("Enter value of j");
		int j = sc.nextInt();
		System.out.println("Enter value of k");
		int k = sc.nextInt();
		System.out.println("Print the greatest number");
		
		if (i>j && i>k) 
		{
			System.out.println(" i = "+i);
		}
		if (j>i && j>k)
		{
		    System.out.println(" j = "+j);
        }
		if (k>i && k>j)
	    {
	    	System.out.println(" k = "+k);
	    }
}
}