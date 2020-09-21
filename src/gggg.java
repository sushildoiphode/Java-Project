
public class gggg {
	public static void main(String[] args) {
		String a="my I name is Sushil";
			char[] c=a.toCharArray();
		c[0]=(char)(c[0]-32);
		String p="";
		for(int i=0;i<c.length;i++) {
			
			if(c[i]==' ' && (c[i+1]<65 || c[i+1]>90)) {
				c[i+1]=(char)(c[i+1]-32);
				
			}
		
			
	}

}
}
//Sushil Is Name I My