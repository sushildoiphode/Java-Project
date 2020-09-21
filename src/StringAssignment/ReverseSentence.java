package StringAssignment;

public class ReverseSentence {

	public static void main(String[] args) {
		String s="My name is Sushil Doiphode";
		String[] c=s.split(" ");
		String rev="";
		for (int i = 0; i < c.length; i++) {
			for (int j = c[i].length()-1; j>=0; j--) {
				rev=rev+c[i].charAt(j);
			}
			rev=rev+" ";
		}
		
		System.out.println(rev);
	//yM eman si lihsuS edohpioD 
	}

}
