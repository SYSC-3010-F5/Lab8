package main;

public class Address
{
    private int unit;
    private String street;
    private String city;
    private String postalCode;

    public Address (String street, String city, String postalCode) throws Exception
    { };
    public Address (int unit, String street, String city, String postalCode) throws Exception
    { };

     public String toString() { return null;}
     public boolean equals(Object o) { return false; }
     
     private boolean isValidPostalCode( String postalCode ) { return false; }
     
     public String getStreet(){
    	 return street;
     }
     
     public String getCity(){
    	 return city;
     }
     
     public String getPostalCode(){
    	 return postalCode; 
     }
     
     public void setStreet(String newStreet){
    	 street = newStreet;
     }
     
     public void setCity(String newCity){
    	 city = newCity;
     }
     
     public void setPostalCode(String newPostalCode){
    	 postalCode = newPostalCode;
     } 
 
} 
