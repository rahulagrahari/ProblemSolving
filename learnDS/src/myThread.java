
public class myThread extends Thread{
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("child thread");
		}
	}

}
