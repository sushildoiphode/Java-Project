
public class Stringbuff {
	public static void main(String[] args) {
		String s="nayan";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
				{
				c++;
				}
			
		}
		if(c==0)
		{
			System.out.println("word is Palindrom");
		}else {
			System.out.println("word is not Palindrom");
		}
	}
}









