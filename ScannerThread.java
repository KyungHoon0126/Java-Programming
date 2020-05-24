package kr.hs.dgsw.c1.d0513;

import java.util.Scanner;

public class ScannerThread {
	
	private boolean stop = false;

	public ScannerThread() {
		
		startInputThread();
		execute();
	}
	
	private void startInputThread()
	{
		InputThread thread = new InputThread();
		thread.start();
	}
	
	private void notifyInput(String text)
	{
		System.out.println("input value : " + text);
		
		if("quit".contentEquals(text))
		{
			stop = true;
		}
	}
	
	private void execute()
	{
		while(!stop)
		{
			System.out.println("Main Thread");
			
			try {
				Thread.sleep(1000L);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private class InputThread extends Thread
	{
		@Override
		public void run() {
			
			Scanner scanner = new Scanner(System.in);
			
			while(!stop)
			{
				String text = scanner.nextLine();
				
				notifyInput(text);
			}
			
			scanner.close();
		}
		
	}
	
	public static void main(String[] args) {
		
		new ScannerThread();
	}
}
