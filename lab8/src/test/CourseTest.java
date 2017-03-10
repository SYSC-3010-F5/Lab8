package main.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import main.Course;
import main.Professor;
import main.Student;



public class CourseTest extends TestCase
{
	//local constants
	private static final String ID = "SYSC3010";
	private static final String NAME = "Third Year Eng. Project";
	private static final Student[] students = new Student[]{
											new Student("Jason","Van Kerkhoven"),
											new Student("Henri","Cheung"),
											new Student("Nate","Charlesbois"),
											new Student("Sarah","Garlough")};
	//local instance variables
	private Course course;
	
	
	@Before
	public void setUp() throws Exception 
	{
		course = new Course(ID, NAME);
	}

	@After
	public void tearDown() throws Exception 
	{
		course = null;
	}

	
	//test basic getter
	public void testGetID() 
	{
		String id = course.getId();
		assertTrue(ID.equals(id));
	}
	
	
	//test basic getter
	public void testGetName()
	{
		String name = course.getName();
		assertTrue(NAME.equals(name));
	}
	
	
	//test toString representation
	public void testToString()
	{
		//TODO
	}
	
	
	//test equals method
	public void testEquals1()
	{
		Course baseline = new Course(ID, NAME);
		assertTrue(course.equals(baseline));
	}
	public void testEquals2()
	{
		Course baseline = new Course("SYSC2001", "Motorolla ruins everything -- the course");
		assertFalse(course.equals(baseline));
	}
	public void testEquals3()
	{
		Integer notACourse = 12345;
		assertFalse(course.equals(notACourse));
	}
	public void testEquals4()
	{
		Course baseline = new Course(ID,NAME);
		for(Student s : students)
		{
			baseline.addStudent(s);
			course.addStudent(s);
		}
		
		assertTrue(course.equals(baseline));
	}
	public void testEquals5()
	{
		Course baseline = new Course(ID,NAME);
		Student[] students = new Student[]{
				new Student("Jason","Van Kerkhoven"),
				new Student("Henri","Cheung"),
				new Student("Nate","Charlesbois"),
				new Student("Sarah","Garlough")};
		for(Student s : students)
		{
			baseline.addStudent(s);
		}
		course.addStudent(new Student("John","Doe"));
		
		assertFalse(course.equals(baseline));
	}
	
	
	//test setting/getting prof
	public void testSetAndGetProf1()
	{
		Professor prof = new Professor("Ralph","Mason");
		course.setProfessor(prof);
		assertTrue(course.getProfessor().equals(prof));
	}
	public void testSetAndGetProf2()
	{
		course.setProfessor(null);
		assertTrue(course.getProfessor() == null);
	}
	
	
	//test adding/getting student
	public void testAddAndGetStudent()
	{
		for(Student s: students)
		{
			course.addStudent(s);	
		}
		Student[] gotStudents = course.getStudents();
		assertTrue(students.equals(gotStudents));
	}
	public void testGetStudents()
	{
		Student[] gotStudents = course.getStudents();
		assertTrue(new Student[]{}.equals(gotStudents));
	}
	
	
	//test removing/getting student
	public void testRemoveStudent1()
	{
		Student[] compStudent = new Student[]{
								new Student("Henri","Cheung"),
								new Student("Nate","Charlesbois"),
								new Student("Sarah","Garlough")};
		for(Student s: students)
		{
			course.addStudent(s);	
		}
		course.removeStudent(students[0]);
		assertTrue(course.getStudents().equals(compStudent));
	}
	public void testRemoveStudent2()
	{
		Student[] compStudent = new Student[]{
								new Student("Henri","Cheung"),
								new Student("Nate","Charlesbois"),
								new Student("Sarah","Garlough")};
		for(Student s: students)
		{
			course.addStudent(s);	
		}
		course.removeStudent(new Student("John","Doe"));
		assertTrue(course.getStudents().equals(students));
	}
	
	

}
