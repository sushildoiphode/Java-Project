
public class vovelscount {
	public static void main(String[] args) {
		String s="I love India ";
		char c[]=s.toCharArray();
		int p=0;
		int q=0;
		int r=0;
		int t=0;
		int v=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a' || c[i]=='A') {
				p++;
			}
			if(c[i]=='e' || c[i]=='E') {
				q++;
			}
			if(c[i]=='i' || c[i]=='I') {
				r++;
			}
			if(c[i]=='o' || c[i]=='O') {
				t++;
			}
			if(c[i]=='u' || c[i]=='U') {
				v++;
			}
			
		}
		System.out.println("a and A: "+p);
		System.out.println("e and E: "+q);
		System.out.println("i and I: "+r);
		System.out.println("o and O: "+t);
		System.out.println("u and U: "+v);
		
		
	}

}
