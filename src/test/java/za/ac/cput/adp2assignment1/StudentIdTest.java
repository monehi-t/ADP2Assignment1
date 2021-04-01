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
 * @author Monehi Tuoane 219350744
 */
public class StudentIdTest {
    
     //Application Declaration for Object Equality and Identity
    private StudentId student1;
    private StudentId student2;
    private StudentId student3;
    
    //application to test test-fail calculations 
    private StudentId calculate;
    
    public StudentIdTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        student1= new StudentId();
        student2 = new StudentId();
        student3 = student1;
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    //Test Object Identitiy
     @Test
    public void testIdentity() {
        assertSame(student1,student3);
    }
    
    //Test Object Equality
     @Test
    public void testEquality() {
        assertEquals(student1,student3);
    }
    
    //Test failing test
     @Test
    public void testFail() {
        assertEquals(student1,student3);
        fail();
    }
    
    //Test Disabling Test
    @Disabled
    @Test
    public void testAddition() {
        
        int result = calculate.addition(6, 9);
        assertEquals(10, result);
    
    }
    
    //Test TimeOut
    @Test
    @Timeout (value = 500, unit = TimeUnit.MILLISECONDS)
    public void test_this(){
    }
    
}
