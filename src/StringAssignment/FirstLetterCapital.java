package StringAssignment;

public class FirstLetterCapital {

	public static void main(String[] args) {
		String s="India is my country.";
		char[] c=s.toCharArray();
		if (c[0]>='a' && c[0]<='z') { 
		  c[0]=(char) (c[0]-32);
		  }
	
		for (int j = 0; j < c.length; j++) 
		{
			if (c[j]==' ' && c[j+1]>='a' && c[j+1]<='z'){
			c[j+1]=(char) (c[j+1]-32);
		}
		System.out.print(c[j]);
		}
	}

}
