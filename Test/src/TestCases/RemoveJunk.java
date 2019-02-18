package TestCases;

public class RemoveJunk {

	public static void main(String[] args) {
		
		//Q: How you remove junk or unwanted character from a particular Srting?
		
		String s = "#$%%$##$%^^&$@!@#Testng Selenium Java#@#$$$#!!!@#$$$%%";
		String s1 = "##@@@tatin String 012354$##@$";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", ""); //String has replaceAll function bcoz String is immutable object.
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		System.out.println(s1);
	}

}
