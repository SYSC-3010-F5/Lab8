package test;

import static org.junit.Assert.*;
import main.Professor;
import org.junit.Test;

public class ProfessorTest {

	@Test
	public void testSetOffice()
	{
		String office = "ME 3380";
		Professor prof = new Professor("Henri", "Cheung");
		prof.setOffice(office);
		String testOffice = prof.getOffice();
		assertTrue(office.equals(testOffice));
	}
}
