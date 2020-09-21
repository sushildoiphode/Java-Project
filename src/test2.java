
public class test2{
	public static void main(String[] args) {
		String s="Sushil is good boy.Sushil Playing Cricket";
		char c[]=s.toCharArray();
		int a=0;
		if(c[0]=='S' && c[1]=='u' && c[2]=='s' && c[3]=='h' && c[4]=='i' && c[5]=='l') {
			a++;
		}
		
		for (int i = 0; i < c.length; i++) {
			if(c[i]==' ' && c[i+1]=='S' && c[i+2]=='u' && c[i+3]=='s' && c[i+4]=='h' && c[i+5]=='i' && c[i+6]=='l')
			{
				a++;
			}
			
		}
		System.out.println(a);
		
	}

}
