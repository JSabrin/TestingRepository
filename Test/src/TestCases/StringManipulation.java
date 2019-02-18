package TestCases;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started here some and some over there";
		String str1 = "The Rains have Started from here";
		
		System.out.println(str.length()); //length of str
		System.out.println(str.charAt(5)); //chatAt 5th position
		
		System.out.println(str.indexOf('s')); //1st occurrence of s =8
		System.out.println(str.indexOf('s', str.indexOf('s')+1)); //2nd occurrence of s =15
		System.out.println(str.indexOf('s', str.indexOf('s'+1, str.indexOf('s')+1))); //3rd occurrence of s =28
		System.out.println(str.indexOf('s', str.indexOf('s'+1, str.indexOf('s'+1, str.indexOf('s')+1))));
		System.out.println(str.indexOf("have")); //the position of have
		System.out.println(str.indexOf("Hello")); // -1 Hello is not available in that particular String so it will return -1
		
		System.out.println(str.codePointAt(4));
		//System.out.println(str.concat());
		System.out.println(str.compareTo(str1));
		System.out.println(str1.length());
		
		String m = "selenium testing";
		String n = "Selenium Testing";
		//String comparison:
		System.out.println(m.equals(n));
		System.out.println(m.equalsIgnoreCase(n));
		
		//substring:
		System.out.println(str.substring(0, 9)); //endIndex number will not included
		
		//trim:
		String s = "   Hello World    ";
		System.out.println(s.trim()); //trim method is used for remove before space and after space but it will not remove between space
		System.out.println(s.replace(" ", ""));
		
		String date = "01-01-2014";
		System.out.println(date.replace("-", "/"));
		
		//split:
		String test = "Hello_World_Test_Selenium"; //we splited the value with bases of "_",And you printing on the console.
		//and it will return with String of Array
		String testval[] = test.split("_");
		
		for(int i=0; i<testval.length; i++){
			System.out.println(testval[i]); //split method it will return String Array.
		
		}
		String s2 = "selenium";
		System.out.println(s2.concat("s")); // to add character in that particular String.
		
		//String concatenation:
		//concat means = to marge add two things
		// + sign is called concatenation operator
		//Srting can be concatenated with any data types it could be double value, int value, float value, char
		String x = "Hello";
		String y = "World";
		 int a = 100;
		 int b = 200;
		 
		 System.out.println(x+y);
		 System.out.println(a+b);
		 System.out.println(x+y+a+b); //compile will execute from left to right
		 System.out.println(a+b+x+y);
		 System.out.println(x+y+(a+b));
		
	
		
		
		
		
		
	

}
}