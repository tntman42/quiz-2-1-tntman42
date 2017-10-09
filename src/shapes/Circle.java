package shapes;

public class Circle extends Shape {
	private double radius;
	
	/*
	 * Complete the implementation of this class by finishing the constructor
	 * below.  Circles cannot have a negative radius.
	 */
	public Circle(double radius) throws IllegalArgumentException {
		if (radius <= 0){
			throw new IllegalArgumentException("You cannot have a radius less than or equal to 0");
		}
		this.radius = radius;
	}
	
	/*
	 *  Implement any remaining methods demanded by the superclass.
	 */
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
