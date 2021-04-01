/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2assignment1;

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author CPUT
 */
public class LearnerToolTest {
    private LearnerTool tool1;
    private LearnerTool tool2;
    private LearnerTool tool3;
    private LearnerTool tool4;
    
    public LearnerToolTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
       tool1 = new LearnerTool();
       tool2 = tool4;
       tool3 = new LearnerTool();
    }
    
    @AfterEach
    public void tearDown() {
    }
     @Test        
    void testEquality()
    {
        assertEquals(true,tool1.Valid("Blackboard"));
    }
    @Test
    void testIdentity()
    {
       
        assertSame(tool2,tool4);
    }
    
    @Test
    void testFailing()
    {
       fail("Failing Test");
        assertSame(true,tool3.Valid(""));
    
    }
    
   @Test
   void TimeoutExceed ()
   {
       assertTimeout(Duration.ofMillis(17), () -> Thread.sleep(10));
   
   }

    @Test
    @Disabled
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
