package kr.hs.dgsw.c1.d0513;

public class MyRunnable implements Runnable {

	private long delay;
	
	public MyRunnable(long delay) {
		this.delay = delay;
	}
	
	@Override
	public void run() {
		try {
			
			for(int i = 0; i < 10; i++)
			{
				System.out.println("Runnable : " + i);
				
				Thread.sleep(delay);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable(700L);
		Thread thread = new Thread(myRunnable);
		thread.start();
		
		MyThread myThread = new MyThread("Thread", 1000L);
		myThread.start();
	}
}
