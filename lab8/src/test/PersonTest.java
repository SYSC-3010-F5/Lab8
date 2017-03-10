package test;

import static org.junit.Assert.*;
import main.Person;
import main.Address;
import org.junit.Test;

public class PersonTest {

	@Test
	public void testGetFirstName()
	{
		Person person = new Person("Henri", "Cheung");
		assertTrue(person.getFirstName().equals("Henri"));
	}
	
	@Test
	public void testGetLastName()
	{
		Person person = new Person("Henri", "Cheung");
		assertTrue(person.getLastName().equals("Cheung"));
	}
	
	@Test
	public void testGetFullName()
	{
		Person person = new Person("Henri", "Cheung");
		assertTrue(person.getFullName().equals("Henri Cheung"));
	}
	
	@Test
	public void testSetLastName()
	{
		Person person = new Person("Henri", "Cheung");
		person.setLastName("Page");
		assertTrue(person.getLastName().equals("Page"));
	}
	
	@Test
	public void testSetAddress()
	{
		Person person = new Person("Henri", "Cheung");
		Address address = null;
		try {
			address = new Address("James Long Court", "Nepean", "K2J4R1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		person.setAddress(address);
		assertTrue(person.getAddress().equals(address));
	}
	
}
