
public class Reverseword{
public static void main(String[] args){
	String s="I love india";
	String c[]=s.split(" ");
	for(int i=0;i<c.length;i++) {
		String rev="";
		for(int j=c[i].length()-1;j>=0;j--) {
			rev=rev+c[i].charAt(j);
		}System.out.print(rev+" ");
	}
}
}