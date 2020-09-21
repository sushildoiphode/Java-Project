
public class charremove {
	public static void main(String[] args) {
		String s="rae#0hyg<g+5yz^g&%&6g#@9";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<'A' || s.charAt(i)>'Z' && s.charAt(i)<'a' || s.charAt(i)>'z')
			{
				System.out.print(s.charAt(i));
			}
	
	}

}
	
}
