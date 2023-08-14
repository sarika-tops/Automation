package AssignmentProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

// Q.15. W.A.J.P to demonstrate try catch block.

public class TryCatchBlock {
       public static void main(String[] args) {
    	      
		      try {
		    	    Scanner sc = new Scanner(System.in);
		    	    System.out.println("enter num = ");
		    	    int num = sc.nextInt();
		    	    System.out.println("enter num1 = ");
		    	    int num1 = sc.nextInt();
		    	    int m = (num*num1);
					
			        System.out.println(m);
				
			} catch (InputMismatchException e) {
				   System.out.println("Value should be numeric value");
			}
		    	
	}
}
