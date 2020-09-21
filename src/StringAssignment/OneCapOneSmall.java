package StringAssignment;

public class OneCapOneSmall {
	public static void main(String[] args) {
		String s="I love my India";
		char[] c=s.toCharArray();
		if (c[0]>='a' && c[0]<='z') {
			c[0]=(char) (c[0]-32);
		}
		for (int i = 0; i < c.length; i++) {
			if ((c[i]>='a' && c[i]<='z') || c[i]==' '){
				c[i+1]=(char) (c[i+1]-32);
			}
		System.out.print(c[i]);
	}
	}
}
