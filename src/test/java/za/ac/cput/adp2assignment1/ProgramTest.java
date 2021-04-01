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
 * @author Cameron Clyde Van Wyk 219076936
 */
public class ProgramTest {
    
    private Program prg1;
    private Program prg2;
    private Program prg3;
    
    public ProgramTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        prg1 = new Program();
        prg2 = new Program();
        prg1 = prg3; 
    }
    //Object Identity
    @Test
    void testIdentity() {
        assertSame(prg1,prg3);
    }

    //Object Equality
    @Test
    void testEquality() {
        assertEquals(prg1,prg3);
    }
    
    //Failing Test
    @Test
    void testPrgTest() {
        assertEquals(prg1,prg2);
        fail();
    }
    
    //Disabling Test
    @Test
    @Disabled
    void testName() {
        assertSame(prg3,prg2);
    }
    
    //Timeouts
    // timed out after 500 miliseconds
    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void test_this() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
}
