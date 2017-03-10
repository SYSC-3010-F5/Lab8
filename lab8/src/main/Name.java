package main;

public class Name
{
   private String first, last;
   public Name(String first, String last)
   {
	   this.first = first;
	   this.last = last;
   }
   public String toString() { 
	String name=first+" "+last;
	return name;
   }
   public boolean equals(Object o) 
   { 
	   if (o instanceof Name)
	   {
		   Name name = (Name)o;
		   return (name.toString().equals(this.toString()));
	   }
	   else
	   {
		   return false;
	   }
   }  
}
