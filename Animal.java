package kr.hs.dgsw.c1;

public class Animal {

		// private : 같은 클래스
	 	// package : 같은 클래스(private, public 아무것도 없을 때)
	    // public : 모든 클래스
	   
	
	    /**
	     * 동물의 이름
	     */
		private String name;
		
		/**
		 * 동물 다리의 개수
		 */
		private int countOfLegs; 
		
		/**
		 * 동물의 울음소리
		 */
		private String sound;
		
		/**
		 * 동물의 이름을 리턴한다.
		 * @return 동물이름
		 */
		String getName() {
			return this.name;
		}
		/**
		 * 동물의 이름을 리턴한다.
		 * @param name 동물 이름
		 */
		void setName(String name) {
			this.name = name;
		}
		/**
		 * 동물의 다리의 개수를 리턴한다.
		 * @return 동물의 다리 개수
		 */
		int getCountOfLegs() {
			return this.countOfLegs;
		}
		/**
		 * 동물의 다리의 개수를 설정한다.
		 * @param countOfLegs 동물의 다리 개수
		 */
		void setCountOfLegs(int countOfLegs) {
			this.countOfLegs = countOfLegs;
		}
		/**
		 * 동물의 울음소리를 설정한다.
		 * @return 동물의 울음소리
		 */
		String getSound() {
			return this.sound;
		}
		/**
		 * 동물의 울음소리를 설정한다.
		 * @param sound 동물의 울음소리
		 */
		void setSound(String sound) {
			this.sound = sound;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
		
		
		public static void main(String[] args) {
			
			// 오브젝트 생성
			Animal lion = new Animal();
			Animal tiger = new Animal();
			
			lion.setName("큰 고양이");
			lion.setCountOfLegs(4);
			lion.setSound("어흥");
			
			System.out.println(lion.getName() + " " + lion.getCountOfLegs());
			
			System.out.println(lion);
		}
}
