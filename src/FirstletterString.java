
public class FirstletterString{
	public static void main(String[] args) {
		String s="sushil is my name";
		char []c=s.toCharArray();
		if(c[0]>'a' && c[0]<'z') {
		c[0]=(char)(c[0]-32);
		}
		System.out.print(c[0]);
		
		for(int i=0;i<=c.length-1;i++) {
		if(c[i]==' ' && (c[i+1]>'a' && c[i+1]<'z')) {
			c[i+1]=(char)(c[i+1]-32);
		
			System.out.print(c[i+1]);
		
		
		}
		
	}
	}
}

