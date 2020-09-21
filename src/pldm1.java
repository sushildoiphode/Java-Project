
public class pldm1{
	public static void main(String[] args) {
		String s="Sushil";
		int b=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				b++;
			}
		}
			if(b==0) {
				System.out.println("Palindrom");
			}else {
				System.out.println("not palindrom");
			}
		
	}

}
