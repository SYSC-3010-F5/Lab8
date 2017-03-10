package test;

import static org.junit.Assert.*;

import org.junit.Test;
import main.Student;

public class StudentTest {
	
	@Test
	public void testGetNumber()
	{
		Student testStudent = new Student("Henri", "Cheung");
		int num = testStudent.getNumber();
		
		assertTrue(num >= 0);
	}

	@Test
	public void testGetNumber2()
	{
		Student testStudent = new Student("Henri", "Cheung");
		Student testStudent2 = new Student("Henri", "Cheung");
		Student testStudent3 = new Student("Henri", "Cheung");
		
		int num = testStudent3.getNumber();
		assertTrue(num == 2);
	}
}
