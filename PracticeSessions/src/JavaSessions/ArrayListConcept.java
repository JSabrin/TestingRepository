package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3];//static array --- size is fixed
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		//a[3] = 40; //ArrayIndexOutOfBoundsException
		//Static Array:
		//In Static Array we can add 4th value bcoz first the size of array we put 3.
		//static array has size fixed, limitation of size list.
		//to solve with this use dynamic arraylist
		//in static array we have to define the size
		
		
		//dynamic Array ---- ArrayList:
		//1.can contain duplicate values/elements
		//2.maintains insertion order
		//3.is not synchronized that's why is slow other than collections
		//4.allows random access to fetch the element because it stores the values on the basis of indexes
		
		ArrayList ar = new ArrayList(); //non-generic arraylist object --- 
		//bcoz we didn't define any data type in this arraylist.
		ar.add(100); //index 0
		ar.add(200); //1
		ar.add(300); //2
		
		System.out.println(ar.size()); //size of arraylist
		
		ar.add(400); //3
		ar.add(500); //4
		
		System.out.println(ar.size());
		System.out.println(ar.get(2)); //to get the value from on index
		
		ar.add("Tom"); //5
		ar.add("01/12/1090"); //6
		ar.add(15.45); //7
		ar.add('M'); //8
		ar.add(500); //9
		
		System.out.println(ar.size());
		
		ar.remove(9);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(8));
		
		//System.out.println(ar.get(9)); //IndexOutOfBoundsException
		
		//To print all the values of ArrayList: 
		//use for Loop:
		System.out.println("***************using for loop");
		
		for (int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		//using iterator:
		
		//if you want to define/restricted data type in your ArrayList then do that way:
		//in that particular ArrayList we can add only integer value
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //generic arraylist object --- bcoz we define the data type.
		ar1.add(500);
		//ar1.add("Steve"); // you can't add String value
		
		//in that particular arraylist we can add only String value
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Kim");
		//ar2.add(200); // you can't add int value
		
		//when we are not sure what kind of data we are using in arraylist, in that time we'll using <E> 
		ArrayList<E> ar3 = new ArrayList<E>();
//		ar3.add((E) "Hello World");
//		ar3.add(600, null);
		ar3.add(0,(E)"Hello World");
		ar3.add(1,(E)"Selenium");
		//ar3.add(200, E);
		//ar3.add(600, null);
		System.out.println(ar3.get(0));
		//System.out.println(ar3.get(2));
		
		
		

	}

}