package abcd;

public class BasicBeginningTesting {
	// Class name start with upper case value.

	public static void main(String[] args) {
		// Java program executation start from main method.It is a pre-definied
		// method.
		// If we don't write main method program will not execute.Without main
		// method java program will not executated.

		//1.Comments:
		//--->To make the code readable
		//--->To make the code disable from execution
		
		System.out.println("Hello World!");
		// In java every statement should be end with semicolone-- ;

		//int a = 10, b = 20;

		//System.out.println("Addition of a, b is: " + (a + b));

		// another way to make a multiple comment
		// ==== >Select the code(single or multi line)+>go to Source+>click+>Add
		// Block Comment/ for remove same way+>Remove Block Comment

		//2.Data Types in Java:
		// 2 types---- 1.Primitive data type 2.Reference data type
	    //Java is case sensetive languages all java keywords are should be start with lower case letter.
		/*int a = 40;
	    char c = 'A';
	    double d = 125.452;
	    boolean b = true;
	    
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    System.out.println(d);
		*/
		
		//3.Java Modifiers:
		//Two kinds of modifiers in java---> 1.Access modifier 2.Non-Access modifier
		
		/*public class Sample{
		  
		  public int a=10, b=20; ----> Global vars bcoz without block {
		  
		  public void add(){
		  int result;  ----> local vars bcoz inside the block{ 
		  result = a+b;
		  System.out.println(result);
		  }
		  public static void main (String [] args){
		  Sample obj = new Sample();
		  obj.add();
			
		}*/
		
		//4.Variables:
		//It is store the temporary data within the program.
		//Three types of Variable in Java: ---- 1.Local variable 2.Instance Vars 3.Class level vars/Static Var
		
		/*public Class Sample{
			public static int a=100, b=20; //--- Static variable/class level var
			public static void main (String [] args){ 
			//without the method if we declear the var inside the main method is known as instance variable.
				int c=30; //--- Instance variable
				System.out.println(a); //--100
				System.out.println(c); //--30
				
				if(a>b){
					int d=40; //--Local variable -- inside the block define the var is known as local var
					System.out.println(a+c+d); //--- 170
					System.out.println(d); //---40
					
				}
				
			}
		}*/
		
		
		  
		 
		
		
		
	}
}
