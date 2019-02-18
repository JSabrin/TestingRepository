package OOP1;

public class FunctionsInJava {
	//main method ---> starting point of execution
	
	public static void main(String[] args) {
		
		//How to call this factory/function/method --- need the entity & it's call Object -- need to create object with that specific class
		//Function & method are same thing 
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, obj is the reference variable, referring to the Object.
		//after creating the object, the copy of all the non static methods will be given to this particular object
		
		obj.test();
		
		int c1 = obj.pqr();
		System.out.println(c1);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		// main method is void -- never returns a value
		
	}
	// non static methods 
	// void -- doesn't return any value
	// return type -- void
	public void test(){ //no input , no output
		System.out.println("test method");
	}
	
	// return type -- int
	public int pqr(){ //no input, some output
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	public String qa(){ //no input, some output
		System.out.println("Qa method");
		String s = "Selenum";
		return s;
	}
	//return type -- int
	// x,y -- input parameters/arguments
	public int division(int x, int y){
		System.out.println("division method");
		int d = x/y;
		return d;
	}
		
		
	

}
