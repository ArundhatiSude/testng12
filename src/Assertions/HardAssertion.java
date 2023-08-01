package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
    	
    	@Test
        
        public void Demo() {
        	
        System.out.println("Hello good Evening");
        Assert.assertTrue(true);
        System.out.println("Hello");
        Assert.assertEquals("Atomation", "Atomation"); //false
        System.out.println("Execution completed");
        
        
        }
        
        @Test
        
        public void DemoTest() {
        	
        Assert.assertTrue(true);
        System.out.println("Hi good morning");
        Assert.assertEquals("Java", "Python"); //false
        System.out.println("Execution completed");
        
        }
        
        @Test
        
        public void DemoTest1() {
        	
        Assert.assertTrue(true);
        System.out.println("Hi good morning");
        Assert.assertEquals("java", "java"); //false
        System.out.println("Execution completed");
        
        
        
        
        
        
        
        }

    	

    	

    }



