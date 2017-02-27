/*
 * 
 */

package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class VendingMachineItemTest.
 */
public class VendingMachineItemTest {

	/** The item 3. */
	VendingMachineItem item1, item2, item3;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception{
		item1 = new VendingMachineItem("Skittles", 1.75);
		item2 = new VendingMachineItem("Snickers", 1.50);
	}
	
	/**
	 * Test vending machine exception.
	 */
	@Test(expected=VendingMachineException.class)
	public void testVendingMachineException() {
		item3 = new VendingMachineItem("Chips", -2.00);
	}
	
	/**
	 * Test get name.
	 */
	@Test
	public void testGetName() {
		assertEquals("Skittles", item1.getName());
		assertEquals("Snickers", item2.getName());
	}
	
	/**
	 * Test get price.
	 */
	@Test
	public void testGetPrice() {
		assertEquals(1.75, item1.getPrice(), 0.01);
		assertEquals(1.50, item2.getPrice(), 0.01);
	}
	
	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
		item1 = null;
		item2 = null;
	}
	
	
	
	
	
	
	
}
