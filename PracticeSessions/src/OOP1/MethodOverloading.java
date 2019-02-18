package OOP1;

public class MethodOverloading {

	public static void main(String[] args) { 
		
	}
	public static void main(int p){
		
	}
	public static void main(int s, int t){
		
	}
	//we can overload main method also
	//we can not create a method inside a method 
	//duplicate methods are not allowed --- i.e.. same method name with same number of arguments are not allowed 
	
	//when same method name with different arguments with different data types is called Method Overloading.
	
	//Method Overloading ---> when the same method name with different input arguments or input parameters 
	//with different data types within same class it's called Method Overloading. 
	
	public void sum(){ // 0 input parameter
		System.out.println("Sum method -- zero parameter");
	}
	
	public void sum(int i){ //1 parameter
		System.out.println("sum method -- 1 parameter");
		System.out.println(i);
		
	}
	
	public void sum(double d){ //1 parameter 
		System.out.println("sum method -- 1 parameter");
		System.out.println(d);
	}
	public void sum(int x, int y){ //2 parameter
		System.out.println("sum method -- 2 parameters");
		System.out.println(x+y);
		
	}
	

}
