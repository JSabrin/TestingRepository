package ListConcept;

public class Employee {
	String name; // global variable
	int age;
	String dept;
	
	Employee(String name, int age, String dept){
		// initialized/global name and parameter name to match with each other we use "this keyword"
		//if the global variable name and local variable name is same that time we use "this keyword".
		this.name = name; //global variable to local variable.
		this.age = age;  //initializing the value with argument name we use this keyword 
		this.dept = dept;
		
		 
	}
}
