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
		
		System.out.println(name + "Consumer 시작");
		
		// while(true)
		while(!Thread.currentThread().isInterrupted())
		{
			System.out.println(name + "입력을 기다리는 중..");
			
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
			
			System.out.println("값이 입력됨.");
			
			int value = producer.getValue();
			long result = calculateFactorial1(value);
			System.out.println(String.format("%s : %d! = %d", name, value, result));
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
		
		Consumer consumer1 = new Consumer("김경훈", producer);
		new Thread(consumer1).start();
		
		/* Consumer consumer2 = new Consumer("강민석", producer);
		new Thread(consumer2).start(); */
	}
}
