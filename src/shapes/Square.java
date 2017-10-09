package shapes;

public class Square extends Shape {
	private double side;

	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Squares cannot have a negative side length.
	 */
	public Square(double side) throws IllegalArgumentException{
		if (side <= 0){
			throw new IllegalArgumentException("The side length of a square cannot be less than or equal to 0");
		}
		this.side = side;
	}
	
	/*
	 * Implement any remaining methods demanded by the superclass.
	 */

	public double getSide() {
		return side;
	}

	@Override
	public double calculateArea() {
		return side * side;
	}
}
