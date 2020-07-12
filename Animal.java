package kr.hs.dgsw.c1.anonymousclass;

public class Animal {

	protected Sound sound;

	public void sound() 
	{
		this.sound.sound();
	}

	public void setSound(Sound sound) 
	{
		this.sound = sound;
	}

	public static void main(String[] args) 
	{
		Animal dog = new Animal();
		dog.setSound(new Sound() 
		{
			@Override
			public void sound() 
			{
				System.out.println("ùûùû");
			}

		});

		dog.sound();

		Animal cat = new Animal();
		cat.setSound(new Sound() 
		{
			@Override
			public void sound() 
			{
				System.out.println("ÎýÐº");
			}
		});

		cat.sound();
	}
}