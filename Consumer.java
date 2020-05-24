package kr.hs.dgsw.c1.d0513;

public class Consumer implements Runnable {

	private String name;
	private Producer producer;
	
	public Consumer(String name, Producer producer) {
		this.name = name;
		this.producer = producer;
	}
	
	@Override
	public void run() {
		
		System.out.println(name + "Consumer ����");
		
		// while(true)
		while(!Thread.currentThread().isInterrupted())
		{
			System.out.println(name + "�Է��� ��ٸ��� ��..");
			
			try 
			{
				synchronized (producer) 
				{	
					producer.wait();
				}
				
			} catch (InterruptedException e) {

			}
			finally 
			{
				System.out.println("Thread is dead!");
			}
			
			System.out.println("���� �Էµ�.");
			
			int value = producer.getValue();
			long result = calculateFactorial1(value);
			System.out.println(String.format("%s : %d! = %d", name, value, result));
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

	private long calculateFactorial1(int value)
	{
		long result = 1;
		
		for(int i = value; i > 1; i--)
		{
			result *= (long)i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Producer producer = new Producer();
		new Thread(producer).start();
		
		Consumer consumer1 = new Consumer("�����", producer);
		new Thread(consumer1).start();
		
		/* Consumer consumer2 = new Consumer("���μ�", producer);
		new Thread(consumer2).start(); */
	}
}
