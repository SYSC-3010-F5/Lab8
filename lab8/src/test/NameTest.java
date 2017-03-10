package test;

import main.Name;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class NameTest {

	@Test
	public void testtoString()
	{
		Name jeff=new Name("J","Smith"); 
		String testname=jeff.toString();
		assertTrue(testname.equals("J Smith"));
	}
	
	@Test
	public void testequals1()
	{
		Name jeff2=new Name("J","Smith2");
		Object objc=new Object();
		assertFalse(objc.equals(jeff2.equals(objc)));
	}
	@Test
	public void testequals2()
	{
		Name name = new Name("Yeah Boi","Natey");
		Name name2 = new Name("Yeah Boi","Natey");
		assertTrue(name.equals(name2));
		
	}

}
