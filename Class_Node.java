
// Node : �ϳ��� ��ǥ�� ���Ѵ�.

public class Class_Node {
	
	private int x; 
	private int y;
	
	// private : Java ��ü ���� ���α׷��� : ���� �߽� �� x, y�� �ܺο��� �Ժη� �ٲܼ� ������ �ϱ� ����.
	
	// x, y�� ���� �������� ���ؼ� ���� �Լ����� ����� �־�� �Ѵ�.
	// ��, �ܺο��� ������ �����ϴٴ� �ǹ̷� public�� ����Ѵ�.
	
	public int getX() // x�� ���� �������� �Լ�.
	{
		return x;	
	}
	
	public void setX(int x) // x�� ���� �����ϴ� �Լ�.
	{
		this.x = x; // this : �ڽ��� ������ �ִ� ���� ���� �ٲٱ� ����.
	}
	
	public int getY() // y�� ���� �������� �Լ�.
	{
		return y;
	}
	
	public void setY(int y) // y�� ���� �����ϴ� �Լ�.
	{
		this.y = y;
	}
	
	public Node(int x, int y) 
	{
		// ������ : �ν��Ͻ�(��ü)�� ������� �� �ڵ����� ������ �ʱ�ȭ���ִ� �Լ�.
		
		this.x = x;
		this.y = y;
	}
	
	public Node getCenter(Node other) 
	{
		// getCenter : �ٸ� Node�� �Ű������� �޴´�.
		// �ٸ� Node���� ���ؼ�, �ڽ��� ������ �ִ� x, y ��ǥ�� �ٸ� Node�� x, y ��ǥ�� ���ؼ� ���߾��� ������ ��ǥ�� ��ȯ���ش�.
		
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
}
