package tests;

import org.junit.Assert;
import org.junit.Test;

import shapes.Circle;
import shapes.Square;

public class ShapeTest {

	/*
	 * Write a test for Shape's compareTo method.
	 * 
	 * Also create SquareTest.java and CircleTest.java JUnit test cases.
	 * Test each class's constructor method and calculateArea method.
	 */
	@Test
	public void testCompareTo() {
		Assert.assertTrue((new Square(20)).compareTo(new Square(10)) > 0);
		Assert.assertTrue((new Circle(200)).compareTo(new Circle(10)) > 0);
		Assert.assertTrue((new Square(50)).compareTo(new Circle(100)) < 0);
		Assert.assertTrue((new Circle(50)).compareTo(new Square(50)) > 0);
	}

}
