public class MultiThread2 extends Thread {
	
    public static void main(String[] args) throws InterruptedException {
        MultiThread2 T1 = new MultiThread2(); // Initiating a Thread class and creating a thread 
        MultiThread2 T2 = new MultiThread2();
        System.out.println(T1.getState());
        T1.start();
        T1.join();  
        T2.start(); 
        System.out.println(T2.getState()); // It Shows Running State
        try {
            T1.sleep(3000);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        System.out.println(T1.getState()); // Terminated
        try {
            T2.sleep(2000);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
       System.out.println("State of Thread2: "+ T2.getState());
    }
    @Override
    public void run() {
    	try {
		    Thread.sleep(1000);
	   } catch (InterruptedException e) {
			e.printStackTrace();
		}
    	for (int i=0; i<=10; i++) {
    	System.out.println(i);
    	}
    	System.out.println( "State of thread - ");
    }
     
  }