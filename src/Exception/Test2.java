package Exception;

public class Test2 {
	final void m1(int i)
	{
		System.out.println("1");
	}
	public void m1(int...w)
	{
		System.out.println("21");
	}
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.m1(null);
	}

}
