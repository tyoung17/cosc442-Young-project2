package edu.towson.cis.cosc442.project2.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The unit test Class for Rectangle.
 */
public class RectangleTest {
	
	/** Declaring necessary test objects for {@link Rectangle} */
	Rectangle rect1, rect2;

	/**
	 * Initializes the necessary test objects for the test cases to use.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		rect1 = new Rectangle(4.0, 7.0);
		rect2 = new Rectangle(2.0, 6.0);
	}

	/**
	 * Test for the getArea() method of the {@link Rectangle} class.
	 */
	@Test
	public void testGetArea() {
		assertEquals(28.0, rect1.getArea(),0.001);
		assertEquals(12.0, rect2.getArea(),0.001);
	}

	/**
	 * Test for the getDiagonal() method of the {@link Rectangle} class.
	 */
	@Test
	public void testGetDiagonal() {
		assertEquals(8.0623, rect1.getDiagonal(), 0.0001);
		assertEquals(6.3246, rect2.getDiagonal(), 0.0001);
	}
	
	/**
	 * Cleans up test objects after a test case is executed.
	 */
	@After
	public void tearDown(){
		rect1 = null;
		rect2 = null;
	}
}
