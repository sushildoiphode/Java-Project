
public class Days {
	public static String Funct(String s, int k) {
		String[] days = new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
		int len = days.length;
		int index = 0;
		int result = 0;
		for (int i = 0; i < len; i++) {
			if (days[i] == s) {
				index = i;
				k %= 7;
				result = (index + k) % 7;
			}
		}
		return days[result];
	}

	public static void main(String[] args) {
		String S="Tue"; 
		int k=6;
		String s=Funct(S,k);
		System.out.println(s);
	}

}