package AssignmentProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

// Q.16. W.A.J.P to demonstrate multiple catch blocks

public class MultipleCatchBlocks {
       public static void main(String[] args) {
		      try {
		    	    Scanner sc = new Scanner(System.in);
		    	    System.out.println("enter num = ");
		    	    int num = sc.nextInt();
		    	    System.out.println("enter num1 = ");
		    	    int num1 = sc.nextInt();
		    	    int d = (num/num1);
					
			        System.out.println(d);
			} catch (ArithmeticException e) {
				    System.out.println("denominator cannot be zero");
			}
		      catch (InputMismatchException e) {
				    System.out.println("denominator should be numeric value");
			}
		      catch (Exception e) {
				    System.out.println("error");
			}
		      
	}
}
