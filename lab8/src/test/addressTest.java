package test;
import main.Address;

import static org.junit.Assert.*;

import org.junit.Test;

public class addressTest {

	@Test
	public void testGetStreet(){
		try {
			Address address = new Address("Bank","Ottawa","K1S2R2");
			assertTrue(address.getStreet().equals("Bank"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetCity(){
		try {
			Address address = new Address("Bank","Ottawa","K1S2R2");
			assertTrue(address.getCity().equals("Ottawa"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetPostalCode(){
		try {
			Address address = new Address("Bank","Ottawa","K1S2R2");
			assertTrue(address.getPostalCode().equals("K1S2R2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetStreet(){
		try {
			Address address = new Address("Bank","Ottawa","K1S2R2");
			address.setStreet("Elgin");
			assertTrue(address.getStreet().equals("Elgin")); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSetCity(){
		try {
			Address address = new Address("Bank","Ottawa","K1S2R2");
			address.setCity("Toronto");
			assertTrue(address.getCity().equals("Toronto")); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test 
	public void testSetPostalCode(){
		try {
			Address address = new Address("Bank","Ottawa","K1S2R2");
			address.setPostalCode("K1S2R4");
			assertTrue(address.getPostalCode().equals("K1S2R4")); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddress(){
		try {
			Address address = new Address("Bank","Ottawa","K1S2R2");
			assertTrue(address.getStreet().equals("Bank"));
			assertTrue(address.getCity().equals("Ottawa"));
			assertTrue(address.getPostalCode().equals("K1S2R2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	

}
