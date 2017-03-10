package main;

import java.util.ArrayList;

public class Course
{
	//declaring local instance vairables
    private String id;
    private String name;
    private Professor professor;
    private ArrayList<Student>students;
    
    
    //generic constructor
    public Course( String id, String name) 
    {
    	//init
    	this.id = id;
    	this.name = name;
    	this.professor = null;
    	this.students = new ArrayList<Student>();
    }
    
    
    //generic getters
    public String getId() 
    { 
    	return id; 
    }
    public String getName( ) 
    { 
    	return name; 
    }

    
    @Override
    //string representation
    public String toString() 
    {
    	String s = "";
    	if(id != null)
    	{
    		s += id + " -- ";
    	}
    	else
    	{
    		s += "<null> -- ";
    	}
    	
    	if(name != null)
    	{
    		s += name + ", prof. ";
    	}
    	else
    	{
    		s += "<null>, prof. ";
    	}
    	
    	if(professor != null)
    	{
    		s += professor.getFullName() ;
    	}
    	else
    	{
    		s += "<null>";
    	}
    	return s;
    }
    
    
    @Override
    //equals method
    public boolean equals(Object o) 
    {
    	if(o instanceof Course)
    	{
    		//cast
    		Course course = (Course)o;
    		
    		//check name
    		if(course.getName() == null || this.name == null)
    		{
    			if (course.getName() != this.name)
    				return false; 
    		}
    		else
    		{
	    		if(!course.getName().equals(this.name))
	    			return false;
    		}
    		
    		//check if
    		if (course.getId() == null || this.id == null)
    		{
	    		if (course.getId() != this.id)
	    			return false;
    		}
    		else
    		{
    			if(!course.getId().equals(this.id))
	    			return false;
    		}
    		
    		//check prof
    		if(course.getProfessor() == null || this.professor == null)
    		{
    			if(course.getProfessor() != this.professor)
    				return false;
    		}
    		else
    		{
	    		if(!course.getProfessor().equals(this.professor))
	    			return false;
    		}
    		
    		//check students
    		if(!course.getStudents().equals(this.students.toArray(new Student[0])))
    		{
    			return false;
    		}
    		
    		//all good
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }

    
    //generic setter
    public void setProfessor(Professor professor)
    {
    	this.professor = professor;
    }
    
    
    //generic getter
    public Professor getProfessor()
    {
    	return this.professor;
    }

    
    //adder
    public void addStudent( Student student )
    {
    	this.students.add(student);
    }
    
    
    //remove a student
    public void removeStudent(Student student)
    {
    	this.students.remove(student);
    }
    
    
    //generic getter
    public Student[] getStudents()
    {
    	return this.students.toArray(new Student[0]);
    }
    
    
}
