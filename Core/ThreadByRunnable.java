package AssignmentProgram;

// W.A.J.P to create one thread by implementing Runnable interface in Class.

class ThreadByRunnable extends Object implements Runnable {
	@Override
	public void run() {
		   for(int i=1;i<=5;i++) {
			   System.out.println(i);
			   try {
				    Thread.sleep(3000);
			} catch (Exception e) {
				    e.printStackTrace();
			}
		   }
		   System.out.println("Main threads");
	}
}
class ThreadByClass extends Thread{
	   public void call() {
		   for(int i=1;i<=5;i++) {
			   System.out.println(i);
			   try {
				    Thread.sleep(3000);
			} catch (Exception e) {
				    e.printStackTrace();
			}
		   }
		   System.out.println("Main threads");
	   }


}


  
