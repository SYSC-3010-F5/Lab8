package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import main.Person;
import main.Address;
import main.Course;
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
	
	@Test
	public void testAddCourse()
	{
		Person person = new Person("Henri", "Cheung");
		Course course = new Course("2001", "Assembly");
		person.addCourse(course);
		Course[] courses = person.getCourses();
		assertTrue(Arrays.asList(courses).contains(course));
	}
	
	@Test
	public void testRemove()
	{
		Person person = new Person("Henri", "Cheung");
		Course course = new Course("2001", "Assembly");
		person.addCourse(course);
		person.remove(course);
		Course[] courses = person.getCourses();
		assertFalse(Arrays.asList(courses).contains(course));
	}
	
	@Test
	public void testEquals()
	{
		Person person = new Person("Henri", "Cheung");
		Person person2 = new Person("Henri", "Cheung");
		assertTrue(person.equals(person2));
	}
	
}
