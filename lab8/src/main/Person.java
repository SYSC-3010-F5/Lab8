package main;

import java.util.ArrayList;
public class Person
{
   private Name name;
   private Address address;
   private ArrayList<Course> courses;
   
   public Person( String first, String last) {
	   name = new Name(first, last);
   };
   
   public void setLastName( String name) {
	   
   };
   
   public String getLastName() { return null; };
   
   public String getFirstName() { return null; };
   
   public String getFullName() { 
	   return name.toString(); 
   };

   public void setAddress(Address addr) 
   {
	   address=addr;
   };
   public Address getAddress() { return address; };

   public Course[] getCourses() { 
	   return null; }
   public void addCourse( Course course ) {};
   public void remove(Course course) {};

    public String toString() { 
    	String returnString = "";
    	returnString = name.toString() + " " + address.toString();
    	
    	for(int i = 0; i < courses.size(); i++)
    	{
    		returnString = returnString + " " + courses.get(i).toString();
    	}
    	
    	return returnString; 
    }
    public boolean equals(Object o) { 
    	if(!(o instanceof Person))
    		return false; 
    	else
    	{
    		if(this.toString().equals(o.toString()))
    			return true;
    	}
    	return false;
    }

}     

