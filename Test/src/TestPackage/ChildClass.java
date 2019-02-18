package TestPackage;

public class ChildClass extends ParentClass { //if we use final keyword in the class then we cannot child of ParentClass.Bcoz it's reserved keyword.

	public static void main(String[] args) {
		
   }
	public void start(){ //when we use final reserve keyword in the parentclass method 
		//then we can not override the final method from parentclass 
		System.out.println("Childclass ----- start method");
	}
	
}
