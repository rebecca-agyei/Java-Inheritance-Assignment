
/*
 Question 1
 Create a class with a method that prints "This is parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of the
class and call
a. 1 - method of parent class by the object of the parent class
b. 2 - method of child class by the object of the child class
c. 3 - method of parent class by the object of the child class
 */

class parentClass{
	public void parentMethod() {
		System.out.println("This is parent class");
	}
}

class childClass extends parentClass{
	public void childMethod() {
		System.out.println("This is child class");
	}
}

public class Q1 {

	public static void main(String[] args) {
		parentClass p = new parentClass();
		childClass c = new childClass();
		p.parentMethod();
		c.childMethod();
		c.parentMethod();

	}

}
