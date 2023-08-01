package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    	 
    	 @Test
    	    
    	    public void DemoTest() {
    	    	
    	    SoftAssert soft = new SoftAssert();
    	    System.out.println("Excecution started");
    	    soft.assertEquals("Welcome", "Welcome"); //failed
    	    soft.assertEquals(true, true); //true
    	    System.out.println("Execution completed");
    	    System.out.println("Hello");
    	    
    	    soft.assertAll();
    	    //it collect all the assertion and in case if any failure mark the
    	    //test as failed
    	    
    	   
    	    	
    	    
    	    	
    	    
    	    }
    	    
    	    @Test
    	    
    	    public void Demo() {
    	    	
    	    	    SoftAssert soft = new SoftAssert();
    	    	    System.out.println("Excecution started demo"); //failed
    	    	    soft.assertEquals("Welcome", "Welcome");
    	    	    soft.assertEquals(true, true); //false
    	    	    System.out.println("Execution completed");
    	    	    System.out.println("Hello");
    	    	    
    	    	    soft.assertAll();
    	    
    	    
    	    
    	    	
    	    
    	    	
    	    
    	    }

    	}


