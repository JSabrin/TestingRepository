package TestCases;

public class StringSwap {

	public static void main(String[] args) {
		
		//Swap to swap Strings without using temp/thrid variable:
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swapping:");
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		
		//1. append a and b:
		a = a+b; //HelloWorld
		
		//2. String initial String a in String b:
		b = a.substring(0, a.length()-b.length());
		
		//3. String initial String b in String a:
		//System.out.println(a.lastIndexOf('r'));
		a = a.substring(b.length());
		
		System.out.println("**************************");
		System.out.println("the value of a and b after swapping");
		System.out.println("the value of a is: "+a);
		System.out.println("the value of b is: "+b);
		
		
	}

}
