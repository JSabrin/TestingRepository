package TestCases;

public class ReverseString {

	public static void main(String[] args) {

		// Questions n Answers:
		//Q: 1.How do you reverse a particular String?
		// 2 ways we can reverse a String:
		// a. using for loop.
		// b. using for StringBuffer.

		// Q: 2.Difference between String and StringBuffer?
		// *StringBuffer is mutable class but String is immutable object.
		// *String has no reverse function but StringBuffer has mutable
		// function.

		//Q: 3. Do you have reverse function in a String?
		// No, because String is a immutable object.

//		String s1 = "Selen";
//		int len1 = s1.length();
//		String re = "";
//		for (int i = len1 - 1; i >= 0; i--) {
//			re = re + s1.charAt(i);
//		}
//		System.out.println(re);
//		
//		StringBuffer se = new StringBuffer(s1);
//		System.out.println(se.reverse());
//		System.out.println(se.replace(1, 2, "Function"));

		// using for loop:
		String s = "Selenium";
		// System.out.println(s.length()); //8
		int len = s.length(); // there's no reverse function in a String class,
								// bcoz String is a immutable object.
		String rev = "";

		for (int i=len-1; i>=0; i--) {
			rev = rev + s.charAt(i);
			// System.out.println(rev); //don't write inside in loop
		}
		System.out.println(s);

		// using StringBuffer class:
		// StringBuffer is a class, it is already available in the java.
		StringBuffer sf = new StringBuffer(s); // s means selenium
		System.out.println(sf.reverse());

	}

}
