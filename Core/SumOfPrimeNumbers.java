package AssignmentProgram;

// Q.8. W.A.J.P to compute the sum of the first 100 prime numbers.

public class SumOfPrimeNumbers {
       public static void main(String[] args) {
   	   int counter,sum=0;
   	   for(int num=1;num<=100;num++) {
   	      counter=0;
   	      for(int i=2;i<=num/2;i++) {
   	    		if(num%i==0) {
   	    		counter++;
   	    		break;
   	    		}
   	    	}
   	      if(counter==0 && num!=1) {
   	    	sum=sum+num;
   	    	}
   	    }
   	    System.out.println(sum);  
   	    		}
	}

