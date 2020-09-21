
public class logicaloperator {
	public static void main(String[] args) {
		String s="I love my India";
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]!='P') {
				System.out.print(c[i]);
			}
		}
	}

}

