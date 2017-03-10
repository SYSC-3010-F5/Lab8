package main;

public class Name
{
   private String first, last;
   public Name(String first, String last) {}
   public String toString() { 
	String name=first+" "+last;
	return name;
   }
   public boolean equals(Object o) { 
	   return toString().equals(o); }
}
