
/*
 Question 4
 Now repeat the above example to print the area of 10 squares.
 Hint - Use an array of objects
 */

public class Q4 {

	public static void main(String[] args) {		
		
		Square[] s = new Square[10]; //Square has already been defined in Q3
		int x = 3;
		for(int i = 0; i < 10; i++) {
			s[i] = new Square(x);
			x++;
		}
		
		for(int i = 0; i < 10; i++) {
			s[i].printArea();
			
		}
		
		

	}

}
