package main;

import java.util.ArrayList;
import java.util.Arrays;
public class Person
{
   private Name name;
   private Address address;
   private ArrayList<Course> courses;
   
   public Person( String first, String last) {
	   name = new Name(first, last);
	   courses = new ArrayList<Course>();
   };
   
   public void setLastName( String name) {
	   String first = name.toString().split(" ")[0];
	   this.name = new Name(first, name);
   };
   
   public String getLastName() { 
	   return name.toString().split(" ")[1]; 
   };
   
   public String getFirstName() { 
	   return name.toString().split(" ")[0];
   };
   
   public String getFullName() { 
	   return name.toString(); 
   };

   public void setAddress(Address addr) 
   {
	   address=addr;
   };
   public Address getAddress() { 
	   return address; 
   };

   public Course[] getCourses() {   
	   return courses.toArray(new Course[0]);
   }
   public void addCourse( Course course ) {
	   courses.add(course);
   };
   public void remove(Course course) {
	   courses.remove(course);
   };

    public String toString() { 
    	String returnString = "";
    	returnString = name.toString();
    	
    	if(address != null)
    		returnString += " " + address.toString();
    	
    	if(courses != null)
    	{
    		for(int i = 0; i < courses.size(); i++)
    		{
    			returnString = returnString + " " + courses.get(i).toString();
    		}
    	}
    	
    	return returnString; 
    }
    public boolean equals(Object o) 
    {
    	if(o instanceof Person)
    	{
    		Person person = (Person)o;
    		
    		//check name
    		if (!person.name.equals(this.name))
    		{
    			return false;
    		}
    		
    		//check address
    		if (this.address == null || person.address == null)
    		{
    			if (this.address != person.address)
    			{
    				return false;
    			}
    		}
    		else
    		{
    			if (!(this.address.equals(person.address)))
    			{
    				return false;
    			}
    		}
    		
    		//check courses
    		if (!this.courses.equals(person.courses))
    		{
    			return false;
    		}
    		
    		//we good
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    	
    	
    	/*
    	if(!(o instanceof Person))
    		return false; 
    	else
    	{
    		Person person = (Person) o;
    		if(this.name.equals(person.name))
    		{
    			if(this.address == null || this.courses == null)
    			{
    				if(person.address != null || person.courses != null)
    				{
    					return false;
    				}
    				else
    				{
    					return true;
    				}
    			}
    			if(this.address.equals(person.address) && this.courses.equals(person.courses))
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    	*/
    }

}     

