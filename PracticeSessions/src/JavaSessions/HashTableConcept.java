package JavaSessions;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		
		h.put("A","Test");
		h.put("B", "Java");
		h.put("C", "Selenium");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, 300);
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		System.out.println(h.get("A"));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		//h1.put("A", 200); // you can't bcoz both key n value are String
		
		Hashtable<String,String> h2 = new Hashtable<String,String>();
		h2.put("A", "Tom");
		//h2.put(1, 200);// you can't
		
		System.out.println(h2.get("A"));
		
		Hashtable<Integer,String> h3 = new Hashtable<Integer,String>();
		h3.put(1, "Selenium");
		//h3.put("A", 200); // you can't
		
		
		
	}

}
