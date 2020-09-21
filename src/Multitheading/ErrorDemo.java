package Multitheading;

public class ErrorDemo extends Error1 {
	public void m1()
	{
		throw new InvalidUserError();	
	}
public static void main(String[] args) {
	ErrorDemo e=new ErrorDemo();
	e.m1();
}
}

