/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

/**
 *
 * @author wsuetholz
 */
public class HourlyEmployeeTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    public HourlyEmployeeTest() {
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
     * Test of getHourlyWage method, of class HourlyEmployee.
     */
    @Test
    public void testGetHourlyWage() {
	System.out.println("getHourlyWage");
	double expResult = 15.0;
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", expResult, 10);
	double result = instance.getHourlyWage();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHourlyWage method, of class HourlyEmployee.
     */
    @Test
    public void testSetHourlyWage() {
	System.out.println("setHourlyWage");
	double hourlyWage = 17.50;
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 15.00, 10);
	instance.setHourlyWage(hourlyWage);
	double result = instance.getHourlyWage();
	assertEquals(hourlyWage, result, 0.0);
    }

    @Test
    public void testConstructSetHourlyWageException() {
	System.out.println("setHourlyWage");
	double hourlyWage = -1.0;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", hourlyWage, 10);
    }

    @Test
    public void testSetHourlyWageException() {
	System.out.println("setHourlyWage");
	double hourlyWage = -1.0;
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 15.0, 10);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setHourlyWage(hourlyWage);
    }

    /**
     * Test of getHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testGetHoursWorked() {
	System.out.println("getHoursWorked");
	long expResult = 10L;
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 15.00, expResult);
	long result = instance.getHoursWorked();
	assertEquals(expResult, result);
    }

    /**
     * Test of setHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testSetHoursWorked() {
	System.out.println("setHoursWorked");
	long hoursWorked = 15L;
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 15.00, 10);
	instance.setHoursWorked(hoursWorked);
	long result = instance.getHoursWorked();
	assertEquals(hoursWorked, result);
    }

    @Test
    public void testConstructSetHoursWorkedException() {
	System.out.println("setHoursWorked");
	long hoursWorked = -1;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 15.0, hoursWorked);
    }

    @Test
    public void testSetHoursWorkedException() {
	System.out.println("setHoursWorked");
	long hoursWorked = -1;
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 15.0, 10);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setHoursWorked(hoursWorked);
    }

    /**
     * Test of incrementHoursWorked method, of class HourlyEmployee.
     */
    @Test
    public void testIncrementHoursWorked() {
	System.out.println("incrementHoursWorked");
	long hoursWorkedIncrement = 5L;
	long expResult = 10L + hoursWorkedIncrement;
	HourlyEmployee instance = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 15.00, 10);
	instance.incrementHoursWorked(hoursWorkedIncrement);
	long result = instance.getHoursWorked();
	assertEquals(expResult, result);
    }
    
}
