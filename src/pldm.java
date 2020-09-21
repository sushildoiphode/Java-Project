
public class pldm {
public static void main(String[] args) {
	String s="asha";
	char c[]=s.toCharArray();
	int b=0;
	for(int i=0;i<c.length-1;i++){
		if(c[i]!=c[c.length-i-1]) {
			b++;
		}
	}
	
		if(b==0) {
			System.out.println("palindrom");
		}
		else
		{
			System.out.println( "not Palindrom");
		}
	
	
}
}