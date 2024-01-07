package AssignmentProgram;

import java.util.Scanner;

// Q.5. W.A.J.P to check given number is Armstrong or not?

public class ArmstrongNumber {
       public static void main(String[] args) {
   	   	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int arm = 0, digit, num ;
		num = n;
		while (num!=0) {
			digit = num % 10;
			arm += Math.pow(digit, 3);
			num /= 10;
		}
		if (arm==n) {
			System.out.println(+n+ " is an armstrong number");
		}
		else {
			System.out.println(+n+ " is not an armstrong number");
		}

   	    }
	}
}
