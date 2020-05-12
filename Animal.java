package kr.hs.dgsw.c1;

public class Animal {

		// private : ���� Ŭ����
	 	// package : ���� Ŭ����(private, public �ƹ��͵� ���� ��)
	    // public : ��� Ŭ����
	   
	
	    /**
	     * ������ �̸�
	     */
		private String name;
		
		/**
		 * ���� �ٸ��� ����
		 */
		private int countOfLegs; 
		
		/**
		 * ������ �����Ҹ�
		 */
		private String sound;
		
		/**
		 * ������ �̸��� �����Ѵ�.
		 * @return �����̸�
		 */
		String getName() {
			return this.name;
		}
		/**
		 * ������ �̸��� �����Ѵ�.
		 * @param name ���� �̸�
		 */
		void setName(String name) {
			this.name = name;
		}
		/**
		 * ������ �ٸ��� ������ �����Ѵ�.
		 * @return ������ �ٸ� ����
		 */
		int getCountOfLegs() {
			return this.countOfLegs;
		}
		/**
		 * ������ �ٸ��� ������ �����Ѵ�.
		 * @param countOfLegs ������ �ٸ� ����
		 */
		void setCountOfLegs(int countOfLegs) {
			this.countOfLegs = countOfLegs;
		}
		/**
		 * ������ �����Ҹ��� �����Ѵ�.
		 * @return ������ �����Ҹ�
		 */
		String getSound() {
			return this.sound;
		}
		/**
		 * ������ �����Ҹ��� �����Ѵ�.
		 * @param sound ������ �����Ҹ�
		 */
		void setSound(String sound) {
			this.sound = sound;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
		
		
		public static void main(String[] args) {
			
			// ������Ʈ ����
			Animal lion = new Animal();
			Animal tiger = new Animal();
			
			lion.setName("ū �����");
			lion.setCountOfLegs(4);
			lion.setSound("����");
			
			System.out.println(lion.getName() + " " + lion.getCountOfLegs());
			
			System.out.println(lion);
		}
}
