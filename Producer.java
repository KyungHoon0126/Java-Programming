package kr.hs.dgsw.c1.d0513;

import java.util.Scanner;

public class Producer  implements Runnable {

	private int value;
	
	@Override
	public void run() {
		
		try {
			System.out.println("Producer ����");
			
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
					 // notify() ȣ��� Consumer���� wait �ϰ� �ִ��� Ǯ���� �ȴ�.
					 this.notify(); // ��ٸ��� �ϳ��� �����常 ����
					 
					 // this.notifyAll(); // ��ٸ��� ��� ������ ����
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
		
		// Interrupt �߻�
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
