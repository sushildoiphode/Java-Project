
public class SentenceRevers{
public static void main(String[] args) {
	String s="Sushil is my name";
	String c[]=s.split(" ");
	
	for(int i=0;i<c.length;i++) {
		String rev="";
		for(int j=c[i].length()-1;j>=0;j--) {
			rev=rev+c[i].charAt(j);
		}
		
		System.out.print(rev+" ");
		}
	}
}

