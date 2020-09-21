
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class map123 {

	public static void main(String[] args) {
		TreeMap h=new TreeMap();
		h.put(10, "Sushil");
		h.put(40, "Deepak");
		h.put("Sushil", null);
		h.put(20, null);
		h.put(90, "Ram");
		System.out.println(h);
		/*
		 * h.replace(20, "Mahesh"); h.replace(90, "Ram", "Sudhir");
		 * System.out.println(h);
		 * 
		 * Set keys=h.entrySet(); Iterator itr=keys.iterator();
		 * 
		 * while(itr.hasNext()) { Entry entry=(Entry)itr.next();
		 * if(entry.getValue().equals("Sushil")) entry.setValue("Vijay"); }
		 * System.out.println(h);
		 */
	}
}
