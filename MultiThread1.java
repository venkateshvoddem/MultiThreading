
public class MultiThread1 implements Runnable
{
  
	public static void main(String[] args) {
		MultiThread1 T = new MultiThread1();
        Thread obj1 = new Thread(T);// Initiating a Thread class, named as T1 and creating a thread 
        obj1.setName("T1");
        Thread obj2 = new Thread(T);
        obj2.setName("T2");
        /**
         * This method starts the execution of the thread and JVM calls the run() method on the thread.
         */
        obj1.start(); // once execution is Started, it calls the run method
        obj2.start();
        System.out.println("Thread names are: ");
    }
    @Override
    public void run() {
 
    	System.out.println("Thread Run Method "+Thread.currentThread().getName());
    }
}