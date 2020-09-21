public class Swap {
public static void main(String[] args) {
	String s="Sushil is";
	String t="Deepak";

	char c[]=s.toCharArray();
	char d[]=t.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		char temp=c[i];
		c[i]=d[i];
		d[i]=temp;
	}
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]);
	}
	System.out.println();
	for(int i=0;i<d.length;i++) {
		System.out.print(d[i]);
	}
	 
	
}
}
