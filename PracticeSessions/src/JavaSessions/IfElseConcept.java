package JavaSessions;

public class IfElseConcept {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		
		if(b<a){
			System.out.println("b is greater than a");
		}else{
			System.out.println("a is greater than b");
		}
	
		//comparison operators:
				// < > <= >= == !=
				
		int c = 50;
		int d = 50;
		
		if(c==d){
			System.out.println("c and d are equal");
		}else{
			System.out.println("c and d are not equal");
			}
		
		//write a logic to find out the highest number
		int a1 = 100;
		int b1 = 500;
		int c1 = 300;
		
		//nested if-else concept:
		if (a1>b1 & a1>c1){
			System.out.println("a1 is the greatest number");
		}else if (b1>c1){
			System.out.println("b1 is the greatest number");
		}else {
			System.out.println("c1 is the greatest number");
		}
		
		
	
	
	
	
	
	}
	
	

}
