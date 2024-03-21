package thread;

public class MultipleThread implements Runnable{

	String name;
	Thread t;
	
	public MultipleThread(String name) {
		this.name = name;
		t=new Thread(this.name);
		System.out.println("New Thread created : "+t);
		t.start();
		
	}
	@Override
	public void run() {
	

	}
	
	
	
	public static void main(String[] args) {

	}


}
