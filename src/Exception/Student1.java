package Exception;


//toString() and hashCode() for content referance
public class Student1 {
	int x;
	Student1(int x)
	{
		this.x=x;
	}
	public String toString()
	{
		return x+" ";
	}
	public static void main(String[] args) {
		Student1 s=new Student1(50);
		Student1 s1=new Student1(55);
		Student1 s2=new Student1(60);
		String s4="Sushil";
		int i=10;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s4);
		System.out.println(i);
	}

}
