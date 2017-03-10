package test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class NameTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void testtoString(String sendName)
	{
		Name jeff=new Name("J","Smith");
		String testname=jeff.toString();
		assertTrue(testname.equals(sendName));
	}
	
	public void testequals()
	{
		Name jeff2=new Name("J","Smith2");
		Object objc=new Object();
		assertTrue(objc.equals(jeff2.equals(objc)));
	}

}
