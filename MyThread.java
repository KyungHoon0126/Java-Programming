package kr.hs.dgsw.c1.d0513;

public class MyThread extends Thread {

	private long delay = 900L;
	private String name;
	
	public MyThread(String name, long delay) {
		this.delay = delay;
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			
			for(int i = 0; i < 10; i++)
			{
				System.out.println(name + "  " + i);
				
				Thread.sleep(900L);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		MyThread thread = new MyThread("First", 500L);
		thread.start();
		
		MyThread thread1 = new MyThread("Second", 2000L);
		thread1.start();
	 }
}
