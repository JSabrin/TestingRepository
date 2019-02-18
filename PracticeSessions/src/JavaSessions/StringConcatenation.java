package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 12.33;
		double d = 10.56;
		
		// + : this sign is concatenation operator
		//println = is used to print on the console with a new line.
		//print = is just used to print in same line on the console.
		//execution start left to right..
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println(c+d);
		System.out.println(x+c+y+d);
		System.out.println(c+d+x+y);
		System.out.println(x+y+c+d);
		System.out.println("hello world");
		System.out.println(a);
		System.out.println("The value of a is: "+ a);
		System.out.println("The value of b is: "+ b);
		System.out.println("the addition of a and b is: "+a+b);
		System.out.println("the addition of a and b is: "+(a+b));
		

	}

}
