package TestCases;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"Javascript", "Ruby", "PHP", "C#", "Python", "Ruby", "PHP"};
		
		//compare each elements:
		for(int i=0; i<names.length; i++){
			for(int j=i+1; j<names.length; j++){ //j=i+1 start with next to the array
				
				if((names[i]).equals(names[j])){
					System.out.println("duplicate name is::: "+(names[i]));
				
				
				}
				
			}
		}
	}
}
