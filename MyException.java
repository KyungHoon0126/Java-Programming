package kr.hs.dgsw.c1.d0519;

public class MyException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() 
	{
		return "������ �������� �ʽ��ϴ�.";
	}
	
}
