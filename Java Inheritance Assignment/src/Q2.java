
/*
 Question 2
 Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The
'Employee' and 'Manager' classes have data members 'specialization' and
'department' respectively. Now, assign name, age, phone number, address and
salary to an employee and a manager by making an object of both of these
classes and print the same.
 */

class Member{
	String name;
	int age;
	String phoneNumber;
	String address;
	int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printSalary() {
		System.out.println(salary);
	}
}

class Employee extends Member{
	String specialization;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}

class Manager extends Member{
	String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

public class Q2 {

	public static void main(String[] args) {
		Employee a = new Employee();
		a.setName("Joy Brown");
		a.setAge(32);
		a.setPhoneNumber("0200500400");
		a.setAddress("5 Johnson Street");
		a.setSalary(2500);
		
		Manager b = new Manager();
		b.setName("Jerry Chucks");
		b.setAge(45);
		b.setPhoneNumber("0266858577");
		b.setAddress("25 Pawpaw Avenue");
		b.setSalary(8000);
		
		System.out.println("An Employee's Details");
		System.out.println("Name: " + a.getName());
		System.out.println("Age: " + a.getAge());
		System.out.println("Phone Number: " + a.getPhoneNumber());
		System.out.println("Address: " + a.getAddress());
		System.out.println("Salary: " + a.getSalary());
		
		System.out.println();
		
		System.out.println("A Manager's Details");
		System.out.println("Name: " + b.getName());
		System.out.println("Age: " + b.getAge());
		System.out.println("Phone Number: " + b.getPhoneNumber());
		System.out.println("Address: " + b.getAddress());
		System.out.println("Salary: " + b.getSalary());
		
	}

}
