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
		
		assertTrue(num != 0);
	}

	
}
