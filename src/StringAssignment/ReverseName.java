package StringAssignment;

import javax.xml.stream.events.Characters;

public class ReverseName {
	
//Reverse sentence prgm -o/p- edohpioD lihsuS si eman yM
	public static void main(String[] args) {
		String s="My name is Sushil Doiphode";
		char[] ch=s.toCharArray();
		
		for (int i = ch.length-1; i >=0; i--) {
			System.out.print(ch[i]);
		}
		//edohpioD lihsuS si eman yM

	}

}
