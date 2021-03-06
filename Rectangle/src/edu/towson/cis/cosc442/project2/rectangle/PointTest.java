/*
 * 
 */
package edu.towson.cis.cosc442.project2.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class PointTest.
 */
public class PointTest {
	
	/** The p 2. */
	Point p1, p2;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		p1 = new Point(4.0, 6.0);
		p2 = new Point(2.0, 2.0);
	}
	
	/**
	 * Test get X.
	 */
	@Test
	public void testGetX() {
		assertEquals(4.0, p1.getX(), 0.001);
		assertEquals(2.0, p2.getX(), 0.001);
	}
	
	/**
	 * Test get Y.
	 */
	@Test
	public void testGetY() {
		assertEquals(6.0, p1.getY(), 0.001);
		assertEquals(2.0, p2.getY(), 0.001);
	}
	
	/**
	 * Test set X.
	 */
	@Test
	public void testSetX() {
		p1.setX(4.0);
		assertEquals(4.0, p1.getX(), 0.001);
		
		p2.setX(12.0);
		assertEquals(12.0, p2.getX(), 0.001);
	}
	
	/**
	 * Test set Y.
	 */
	@Test
	public void testSetY() {
		p1.setY(3.0);
		assertEquals(3.0, p1.getY(), 0.001);
		
		p2.setY(7.0);
		assertEquals(7.0, p2.getY(), 0.001);
	}
	
	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		p1 = null;
		p2 = null;
	}
	
}
