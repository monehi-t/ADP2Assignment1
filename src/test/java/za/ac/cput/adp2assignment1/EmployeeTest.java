/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2assignment1;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author Ashante Valentine 218153619
 */
public class EmployeeTest {
    
    public EmployeeTest() {
        this.sum = app.sum(20,20);
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    Employee app = new Employee();
    
    int sum;
    
    
   // Method to showcase equality assert equals
   @Test
   public void testSum() {
       
       assertEquals(sum,40);
          
    }
   // Method to showcase equality assert equals
   
   Employee emp1 = new Employee("shamir","abrahams",22);
  
   
   
   int testage = 22;
   @Test
   public void testGetAge()
   {
       
       assertSame(emp1.getAge(),testage);
      
     
       
  }
   
     // Method to showcase failed test equals
   @Test
   public void testSum1() {
       
       assertEquals(sum,40);
       fail();
          
    }
        // Method to disable test
   @Test
   @Disabled
   public void testSum2() {
       
       assertEquals(sum,40);
       
       
   }
   
   
   // This function is going to test the timeout
   @Test
   @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
   public void testTimeout() 
   {
       for(int i = 0; i <50000;i++)
       {
           
           System.out.println(i);
       }
           
          
        
   }
    
   

}