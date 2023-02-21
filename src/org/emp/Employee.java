package org.emp;
public class Employee {
	private void empId() {
		
        System.out.println("12345");
	}
	private void empName() {
		
		System.out.println("Sathish");
	}
	private void empDob() {
		
		System.out.println("19061995");
	}
		
	private void empPhone() {
		
		System.out.println("8973561667");
	}
	
	private void empEmail() {
		
		System.out.println("sathishmar19@gmail.com");
}
	private void empAddress() {
		
		System.out.println("Manaparai, Trichy");
	}
	public static void main(String[] args) {
			Employee employeeclass=new Employee();
		employeeclass.empId();
		employeeclass.empName();
		employeeclass.empDob();
		employeeclass.empPhone();
		employeeclass.empEmail();
		employeeclass.empAddress();
	}	
}
