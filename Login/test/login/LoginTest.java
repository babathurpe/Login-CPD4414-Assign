/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0642703
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doLogin method, of class Login.
     */
//    @Test
//    public void testDoLogin() {
//        System.out.println("doLogin");
//        String username = "";
//        String password = "";
//        Login instance = new Login();
//        String expResult = "";
//        String result = instance.doLogin(username, password);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testBlankPasswordShouldReturnErrorMessage() {
        String username = "John";
        String password = "";
        Login instance = new Login();
        String expResult = "ERROR: Invalid Password";
        String result = instance.doLogin(username, password);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBlankUsernameShouldReturnErrorMessage() {
        String username = "";
        String password = "password";
        Login instance = new Login();
        String expResult = "ERROR: Invalid Username";
        String result = instance.doLogin(username, password);
        assertEquals(expResult, result);
    }
}
