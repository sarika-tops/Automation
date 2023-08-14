package AssignmentProgram;

// Q.11. W.A.J.P to find the index of an array element.

public class IndexOfArray {
       public static void main(String[] args) {
		      char [] arr = {'S','A','R','A'};
		      char element= 'A';
		      int index= -1;
		      int i=0;
		      while(i<arr.length) {
		    	  if(arr[i] == element) {
		    		  index=i;
		    		  break;
		    	  }
		    	  i++;
		      }
		      System.out.println("index of " + element + " is : " +index);
	}
}
