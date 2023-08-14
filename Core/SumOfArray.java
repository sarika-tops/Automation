package AssignmentProgram;

// Q.9. W.A.J.P to sum values of an array.

public class SumOfArray {
       public static void main(String[] args) {
    	   int arr[]= {2,4,6,8,10};
    	   int sum=0;
	          for(int index=0;index<arr.length;index++) {
	        	  sum = sum+arr[index];
	          }
	          System.out.println("sum = "+sum);
	          
	}
}
