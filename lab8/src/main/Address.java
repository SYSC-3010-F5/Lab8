package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Address
{
    private int unit;
    private String street;
    private String city;
    private String postalCode;
    
    private String postalCodeRegex = "^(?!.*[DFIOQU])[A-VXY][0-9][A-Z] ?[0-9][A-Z][0-9]$";
    private Pattern regexPattern = Pattern.compile(postalCodeRegex);
    
    
    public Address (String street, String city, String postalCode) throws Exception
    { 
    	this.street = street;
    	this.city = city;
    	if(isValidPostalCode(postalCode)){
    		this.postalCode = postalCode;
    	}
    	else{
    		throw new Exception();
    	}
    	
    };
    public Address (int unit, String street, String city, String postalCode) throws Exception
    { 
    	this(street,city,postalCode);
    	this.unit = unit;
    	
    };

     public String toString() { return null;}
     public boolean equals(Object o) {
    	 if(this == o){
    		 return true;
    	 }
    	 if(o instanceof Address){
    		 Address address = (Address)o;
    		 if(street.equals(address.getStreet()) &&
    				 city.equals(address.getCity()) &&
    				 postalCode.equals(address.getPostalCode())){
    			 return true;
    		 } 
    		 else{
    			 return false;
    		 }
    	 }
    	 else{
    		 return false;
    	 }
    	
     }
     
     private boolean isValidPostalCode( String postalCode ) { 
    	 Matcher matcher = regexPattern.matcher(postalCode);
    	 return matcher.matches();
     }
     
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
