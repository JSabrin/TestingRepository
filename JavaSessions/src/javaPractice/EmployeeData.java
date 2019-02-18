package javaPractice;

public class EmployeeData {
	//1. make it private variables so that no one can access from outside the class and 
	//Encapsulation is also called Data hiding method, it is part of OOP concepts.
	private String employeeName;
	private int employeeAge;
	private int employeeSsn;
	private String employeeDOB;
	private String employeeAddress;
	private int employeePhn; 

	public static void main(String[] args) {
	//3. I have to create a Object
		EmployeeData emp = new EmployeeData();
		emp.setEmployeeName("Steve Kim");
		emp.setEmployeeAge(25);
		emp.setEmployeeSsn(45821563);
		emp.setEmployeeAddress("12-10 35 Street Sunnyside,NY 11377");
		emp.setEmployeeDOB("12/12/1940");
		emp.setEmployeePhn(12546325);
		
		System.out.println("Employee name is: "+ emp.getEmployeeName());
		System.out.println("Employee age is: "+ emp.getEmployeeAge());
		System.out.println("Employee Ssn Number is: "+ emp.getEmployeeSsn());
		System.out.println("Employee Address is: "+ emp.getEmployeeAddress());
		System.out.println("Employee Date of Birth is: "+ emp.getEmployeeDOB());
		System.out.println("Employee Phone Number is: "+ emp.getEmployeePhn() );
		
		}
    //2. get public getter and setter method: to set and get the values from the fields.
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public int getEmployeeSsn() {
		return employeeSsn;
	}

	public void setEmployeeSsn(int employeeSsn) {
		this.employeeSsn = employeeSsn;
	}
	public String getEmployeeDOB() {
		return employeeDOB;
	}
	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public int getEmployeePhn() {
		return employeePhn;
	}
	public void setEmployeePhn(int employeePhn) {
		this.employeePhn = employeePhn;
	}

}
