/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CPUT
 */
public class IDNumberValidatorTest {
    
    
    IDNumberValidator validator = null;
    IDNumberValidator validator2 = null;
    public IDNumberValidatorTest() {
         
    }
    
    @BeforeEach
    public void setUp() {
        validator = new IDNumberValidator();
        validator2 = new IDNumberValidator();
        validator2 = validator;
    }
    
    @Test
    public void equalityTest()
    {
        assertEquals(validator, validator2);
    }
    
    @Test
    public void failingTest()
    {
	fail("This test fails");
    }

//Timeout Test
    @Test
    @Timeout(3)
    public void timeoutTest() throws InterruptedException
    {
        Thread.sleep(2000);
    }
   //disabled test
    @Test
    @Disabled
    public void disabledTest()
    {
    System.out.println("This test is disabled");
    }
  
    
    
 
    
}
