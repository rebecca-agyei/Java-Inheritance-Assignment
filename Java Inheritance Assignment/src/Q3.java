 /*
  Question 3
  Create a class named 'Rectangle' with two data members 'length' and 'breadth'
and two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the
length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle'
class with its constructor having a parameter for its side (suppose s) calling the
constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a
rectangle and a square.
  */
class Rectangle{
	int length;
	int breadth;
	
	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public void printArea() {
		System.out.println(length * breadth);
	}
	
	public void printPerimeter() {
		System.out.println(2 * (length + breadth));
	}
}

class Square extends Rectangle{
	int side;
	
	public Square(int s) {
		super(s,s);
	}
}

public class Q3 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(8,5);
		r.printArea();
		r.printPerimeter();
		
		Square s = new Square(6);
		s.printArea();
		s.printPerimeter();
		

	}

}
