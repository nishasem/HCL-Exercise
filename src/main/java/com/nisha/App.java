package com.nisha;

public class App 
{
    public static void main( String[] args )
    {
    	Employee e1=new Employee();
    	e1.setId(1);
    	e1.setName("Test");
    	e1.setAddress("PA");
    	System.out.println(e1.getId()+e1.getAddress()+e1.getName());
    }
}
 