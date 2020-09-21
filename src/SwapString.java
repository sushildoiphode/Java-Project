
public class SwapString{
public static void main(String[] args) {
	String s="Sushil Doiphode ";
	String t="India Country";
	s=s+t;
	 t=s.substring(0,s.length()-t.length());
	 s=s.substring(t.length());
	System.out.println(s);
	System.out.println(t);
}
}
