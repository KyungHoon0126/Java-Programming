package kr.hs.dgsw.c1.d0513;

import java.util.Scanner;

public class Producer  implements Runnable {

	private int value;
	
	@Override
	public void run() {
		
		try {
			System.out.println("Producer 시작");
			
			Scanner scanner = new Scanner(System.in);
			
			// while(true)
			while(!Thread.currentThread().isInterrupted())
			{
				 value = scanner.nextInt();
				 
				 if(value <= 0)
				 {
					 break;
				 }
				 
				 synchronized (this) 
				 {
					 // notify() 호출시 Consumer에서 wait 하고 있던게 풀리게 된다.
					 this.notify(); // 기다리는 하나의 쓰레드만 가능
					 
					 // this.notifyAll(); // 기다리는 모든 쓰레드 가능
				 }
			}
			
			scanner.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Thread is dead!");
		}
		
		// Interrupt 발생
		try 
		{	
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
		
		Thread.interrupted();
	}

	public int getValue() {
		return value;
	}
}
