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
 * The Class VendingMachineTest.
 */
public class VendingMachineTest {
	
	/** The vending machine items test objects */
	VendingMachineItem item1, item2, item3, item4;
	
	/** The vending machine test object */
	VendingMachine machine1; 
	
	/**
	 * The setUp method that creates the necessary test objects.
	 */
	@Before 
	public void setUp() {
		item1 = new VendingMachineItem("Skittles", 1.75);
		item2 = new VendingMachineItem("Snickers", 1.50);
		item3 = new VendingMachineItem("BigRed", 1.25);
		item4 = new VendingMachineItem("Twix", 1.50);
		
		machine1 = new VendingMachine();
	}
	
	/**
	 * Test vending machine exception when an item is added
	 * into a slot that is not null or if an item is added with 
	 * incorrect 'code' for the slot where the item is to be added.
	 */
	@Test(expected=VendingMachineException.class)
	public void testVendingMachineExceptionAddItem() {
		machine1.addItem(item1, "A");
		machine1.addItem(item3, "A");
		
		machine1.addItem(item2, "tyler");
	}
	
	/**
	 * Test add item to see if an item is correctly added to 
	 * the slot specified by the 'code' parameter. 
	 */
	@Test
	public void testAddItem() {
		machine1.addItem(item1, "A");
		assertNotNull(machine1.getItem("A"));
		
		machine1.addItem(item2, "B");
		assertNotNull(machine1.getItem("B"));
		
		machine1.addItem(item3, "C");
		assertNotNull(machine1.getItem("C"));
		
		machine1.addItem(item4, "D");
		assertNotNull(machine1.getItem("D"));
	}
	
	/**
	 * Test vending machine exception an item is removed 
	 * from a slot that is specified by the 'code' parameter. 
	 * Throws the exception if the slot with the item trying to 
	 * be removed is already null or the 'code' specifying the slot
	 * is incorrect.
	 */
	@Test(expected=VendingMachineException.class)
	public void testVendingMachineExceptionRemoveItem() {
		machine1.removeItem("A");
		
		machine1.removeItem("tyler");
	}
	
	/**
	 * Test remove item to see if an item is correctly removed 
	 * from the slot specified by the 'code' parameter. 
	 */
	@Test
	public void testRemoveItem() {
		machine1.addItem(item1, "A");
		machine1.removeItem("A");
		assertNull(machine1.getItem("A"));
		
		machine1.addItem(item2, "B");
		machine1.removeItem("B");
		assertNull(machine1.getItem("B"));
		
		machine1.addItem(item3, "C");
		machine1.removeItem("C");
		assertNull(machine1.getItem("C"));
		
		machine1.addItem(item4, "D");
		machine1.removeItem("D");
		assertNull(machine1.getItem("D"));
	}
	
	/**
	 * Test vending machine exception insert money to see if
	 * an amount < 0 is trying to be inserted.
	 */
	@Test(expected=VendingMachineException.class)
	public void testVendingMachineExceptionInsertMoney() {
		machine1.insertMoney(-1.00);
	}
	
	/**
	 * Test insert money to see if it inserts the correct amount
	 * into the machine.
	 */
	@Test
	public void testInsertMoney() {
		machine1.insertMoney(2.00);
		assertEquals(2.00, machine1.getBalance(), 0.01);
	}
	
	/**
	 * Test get balance to see if the current amount of 'money' in 
	 * the machine returns correctly.
	 */
	@Test
	public void testGetBalance() {
		machine1.insertMoney(1.50);
		assertEquals(1.50, machine1.getBalance(), 0.01);
	}
	
	/**
	 * Test make purchase to see if it returns true if the 
	 * balance is >= the price of the item trying to be purchased.
	 * Or if it returns false if the balance is < the price of the 
	 * item trying to purchased.
	 */
	@Test 
	public void testMakePurchase() {
		machine1.addItem(item1, "A");
		machine1.insertMoney(2.00);
		assertTrue(machine1.makePurchase("A"));
		
		assertFalse(machine1.makePurchase("A"));		
	}
	
	/**
	 * Test return change to see if it returns the correct amount
	 * of change based off of the balance of the machine at the 
	 * time of purchase. (eg. balance=2.00 itemPrice=1.75 then change=0.25)
	 */
	@Test
	public void testReturnChange() {
		machine1.addItem(item1, "A");
		machine1.insertMoney(2.00);
		machine1.makePurchase("A");
		assertEquals(0.25, machine1.returnChange(), 0.01);
	}
	
	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		item1 = null;
		item2 = null;
		item3 = null;
		item4 = null;
		machine1 = null;
	}
}
