
// 문자열에서 마지막 단어를 반환하는 함수를 작성

public class User_Defined_Function_Ex_Problem1 {

	public static char function(String input)
	{
		return input.charAt(input.length() -1);
		
		// charAt : 특정한 단어를 0부터 출발해서 하나씩 관리 할 수 있게 해준다. 
		//        : 즉, 몇 번째 문자열을 하나 뽑아오는 함수.
		
		// input.length : length는 1부터 시작해서 해당 문자열의 길이를 구해준다.
		
		// charAt는 Hello World를 H = 0번째 ~ d : 10번째로 인식.
		// length는 Hello World를 1부터 시작해서 총 11개로 인식.
		
		// input.length() - 1 : 문자열의 길이에서 -1, 즉 11에서 1을 뺀 값 10을 반환
		//                    : 가장 마지막에 위치한 char 문자를 가져온다.
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello World의 마지막 단어는 " + function("Hello World"));
		
	}

}
