package Exception;

public class Student12 {
	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Sushil");
		StringBuilder s2=new StringBuilder("Sushil");
		StringBuilder s3=s1;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s1));
		
	}

}
