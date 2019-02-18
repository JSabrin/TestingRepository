package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		//It is similar to HashMap, but it is Synchronized.
		//Stores the value on the basis of key n value pair
		//key---> object---Hashcode ----> value
		
		//* Hashcode:
		//when i create with the class name object JVM(Java virtual Machine) will give me
		//one internal number for that particular object its called Hashcode.It is 32 bit int number.
		
		Hashtable ht1 = new Hashtable();
		ht1.put(1, "Selenium");
		ht1.put(2, "PHP");
		ht1.put(3, "C#");
		ht1.put(4, "Ruby");
		
		//create a clone/shallow copy of Hashtable:
		Hashtable ht2 = new Hashtable();
		ht2 = (Hashtable) ht1.clone();
		
		System.out.println("The values from ht1 "+ht1);
		System.out.println("The values from ht2 "+ht2);
		
		ht1.clear();
		System.out.println("The values from ht1 "+ht1);
		System.out.println("The values from ht2 "+ht2);
		
		//Contains value:
		Hashtable ht3 = new Hashtable();
		ht3.put("A", "Steve");
		ht3.put("B", "Manager");
		ht3.put("C", "CEO");
		ht3.put("D", "Developer");
		
		if(ht3.containsValue("Developer"))
			System.out.println("Found the D value");
		
		System.out.println("===========print the values from ht3 using Enumeration==============");
		
		//print all the values from Hashtable using ---- Enumeration ---- elements()
		Enumeration e = ht3.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		
		System.out.println("===========print the values from ht3 using entrySet==============");
		//print all the values from Hashtable using --- entrySet --- Set of Hashtable values:
		Set s = ht3.entrySet();
		System.out.println(s);
		
		System.out.println("=========================");
		
		//Check both Hashtables are equal or not:
		Hashtable ht4 = new Hashtable();
		ht4.put("A", "Steve");
		ht4.put("B", "Manager");
		ht4.put("C", "CEO");
		ht4.put("D", "Developer");
		ht4.put("D", "Developer"); //it contains only the unique value
		ht4.put("B", "Java");
		//it's not define/allows null key or null value in Hashtable
		//ht4.put(null, "Pearl"); // NullPointerExecption
		//ht4.put("E", null); //same NullPointerExecption
		//But in HashMap is allowed null key and null values.
		
		System.out.println("=======Hashtable Contains only the unique values======");
		System.out.println(ht4);
		
		if(ht4.equals(ht3))
			System.out.println("Both are equal");
		
		//get the value from a key:
		System.out.println(ht4.get("D"));
		System.out.println(ht3.get("A"));
		
		//get the Hashcode value from the Hashtable object:
		System.out.println("The Hashcode value of ht4: "+ht4.hashCode());
		
		//Reference to generic tpye:
		Hashtable<String, String> ht5 = new Hashtable<String, String>();
		ht5.put("A", "Hello World");
		ht5.put("B", "Selenium");
		//ht5.put(1, "Java"); //not allowed
		System.out.println(ht5.get("B"));
		
		Hashtable<Integer, String> ht6 = new Hashtable<Integer, String>();
		ht6.put(1, "Tom");
		ht6.put(2, "Dev");
		//ht6.put("A", "Selenium"); //not allowed
		System.out.println(ht6.get(2));
	
	}

}
