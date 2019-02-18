package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		//add:
		ll.add("Test");
		ll.add("UFT");
		ll.add("Selenium");
		ll.add("RFT");
		ll.add("c#");
		
		//print:
		System.out.println("content of linkedlist: "+ll);
		
		//addFirst:
		ll.addFirst("Sabri");
		
		//addLast:
		ll.addLast("Automation");
		System.out.println("content of linkedlist: "+ll);
		
		//get:
		System.out.println(ll.get(3));
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove First and Last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist: "+ll);
		
		ll.remove(1);
		System.out.println("content of linkedlist: "+ll);
		
		//How to iterate/print all the values of LinkedList:
		//use for loop:
		System.out.println("*********using for loop");
		
		for (int i=0; i<ll.size(); i++){
		System.out.println(ll.get(i));
		}
		//advance for loop:
		System.out.println("*********using advance for loop");
		
		for(String str : ll){
			System.out.println(str);
		}
		
		//iterator:
		System.out.println("*******using iterator");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//while loop:
		System.out.println("*******using while loop");
		
		int num = 0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		
		}
		
		

	}

}
