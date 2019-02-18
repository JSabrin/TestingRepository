package TestCases;

public class FinallyConcept {

	public static void main(String[] args){
		
		//finally it is a block. It is used for create a reserved block.
		//finally block is related with try catch block.it used always after the try catch block
		//whatever exception come in the try catch block it doesn't matter after the try catch block -
		//whatever code we write inside the finally block it will be execute anyhow & this is the property of finally
		
		//calling method by method name:
		
		//test1();
		//test2();
		//test3();
		test4();
	}
	//Example 1:
	public static void test1(){
		//use try catch block:
		try{
			System.out.println("inside test1 method");
			throw new RuntimeException("Test that method");
		}catch(Exception e ) {
			System.out.println("inside the catch block");
		
		}
		finally{
			System.out.println("inside finally block");
		}
		//finally it is a reserved block. It is used for create a reserve block
		//finally block is related with try catch block.it used always after try catch block
		//whatever exception come in the try catch block it doesn't matter after the try catch block -
		//whatever code we write inside the finally block it will be execute.this is the property of finally keyword  
	}
	//Example 2:
	public static void test2(){
		try{
			System.out.println("inside test2 method");
		}finally{
			System.out.println("inside the finally block");
		}
		//we see there has no exception but still doesn't matter try catch block has exception or not but finally block will be execute.
	}
	//Example 3:
		public static void test3(){
			int i = 40;
			try{
				System.out.println("inside the test3 method");
				int j = i/0;
			}catch(ArithmeticException e){
				System.out.println("inside catch block");
				System.out.println("In java we can not divide any value with zero");
				//and it's called ArithmeticException
			}
			finally{
				System.out.println("doesn't matter print anyway this code");
			}
		}
		//Example 4:
		public static void test4(){
			int m = 30;
			try{
				System.out.println("inside test4 method");
				int n = m/0;
			}catch(NullPointerException e){
				System.out.println("inside catch block");
				System.out.println("divide by zero error");
			}
			finally{
				System.out.println("Exceute this code even after any exception");
			}
		}
	
	
	
	
	
	
	
}
