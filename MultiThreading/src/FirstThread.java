
public class FirstThread extends Thread {

	@Override
	public void run() {
		for(;;) {
			System.out.print("Hello from run() method\n");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) //default thread in java
	{
		FirstThread f = new FirstThread();
		f.start();
		
	}
}
