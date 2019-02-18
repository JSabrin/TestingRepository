package ListConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapCocept {

	public static void main(String[] args) {
		
		//HashMap is a class implements Map Interface
		//extends Abstract Map
		//it contains only unique elements
		//stores the values key an value pair
		//it may have one null key and multiple null values
		//it maintains no order
		//if you remove key will remove completely but it will not shift the key.
		//HashMap is non-synchronized, ---- not thread safe
		//Concurrent modification execption --- fail, fast condition
		
		//Biggest Difference between Hashtable and HashMap:
		
		//* Hashtable Synchronized:
		//Synchronized means one by one, ok suppose i have 3 values(T1,T2,T3),one of the value(T1) i will attract 
		//with particular object and is not released then other value T2 and T3 will not access 
		//to the particular object & it's call synchronization thread safe method.We used for Hashtable collection.
		//Single one by one at a time thread can access in Hashtable.
		
		// * HashMap non Synchronized:
		//All the thread without problem of synchronization can hit or can access the value from the 
		//particular object it's called non Synchronization not thread safe method. We used for HashMap Collection.
		//multiple thread can access at a time in HashMap.
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "UFT");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		
		System.out.println(hm.get(1)); 
		System.out.println(hm.get(4));
		
		for(Entry m : hm.entrySet()){
			System.out.println(m.getKey()+" "+ m.getValue());
		}
		System.out.println(hm);
		hm.remove(4);
		System.out.println(hm);
		
		System.out.println("====================================");
		
		//Refererence generic type employee object:
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		//Employee object:
		Employee e1 = new Employee("Tom", 25, "QA");
		Employee e2 = new Employee("Peter", 27, "Devloper");
		Employee e3 = new Employee("Steve", 28, "Team lead");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		//traverse the Hashmap:
		for(Entry<Integer,Employee> m : emp.entrySet()){
			int key = m.getKey();
			Employee e = m.getValue(); 			
			System.out.println("Employee "+key+ " Information:");
			System.out.println(e.name + " "+ e.age + " " + e.dept);
		}
		System.out.println("===============================");
		

////	HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
////		
////		Employee e = new Employee("T", 20, "A");
////		Employee e1 = new Employee("A", 10, "R");
////		Employee e2 = new Employee("Y", 40, "E");
////		
////		hm1.put(1, e);
////		hm1.put(2, e1);
////		hm1.put(3, e2);
////		
////		for(Entry<Integer, Employee> n :hm1.entrySet()){
////			int k = n.getKey();
////			Employee p = n.getValue();
////			System.out.println(k +" " +p.name+" " + p.age+" " + p.dept);
////		}
//		
//		
	
	
	
	
	
	}	

}
