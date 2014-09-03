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
public class SalariedEmployeeTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    public SalariedEmployeeTest() {
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
     * Test of getAnnualWage method, of class SalariedEmployee.
     */
    @Test
    public void testGetAnnualWage() {
	System.out.println("getAnnualWage");
	double expResult = 10000.0;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", expResult, 24, 14);
	double result = instance.getAnnualWage();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAnnualWage method, of class SalariedEmployee.
     */
    @Test
    public void testSetAnnualWage() {
	System.out.println("setAnnualWage");
	double annualWage = 15000.0;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setAnnualWage(annualWage);
	double result = instance.getAnnualWage();
	assertEquals(annualWage, result, 0.0);
    }

    @Test
    public void testConstructSetAnnualWageException() {
	System.out.println("setAnnualWage");
	double annualWage = -1.0;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", annualWage, 24, 14);
    }

    @Test
    public void testSetAnnualWageException() {
	System.out.println("setAnnualWage");
	double annualWage = -1.0;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setAnnualWage(annualWage);
    }

    /**
     * Test of getPayPeriods method, of class SalariedEmployee.
     */
    @Test
    public void testGetPayPeriods() {
	System.out.println("getPayPeriods");
	long expResult = 24L;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, expResult, 14);
	long result = instance.getPayPeriods();
	assertEquals(expResult, result);
    }

    /**
     * Test of setPayPeriods method, of class SalariedEmployee.
     */
    @Test
    public void testSetPayPeriods() {
	System.out.println("setPayPeriods");
	long payPeriods = 26L;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setPayPeriods(payPeriods);
	long result = instance.getPayPeriods();
	assertEquals(payPeriods, result);
    }

    @Test
    public void testConstructSetPayPeriodsException() {
	System.out.println("setPayPeriods");
	long payPeriods = 0L;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, payPeriods, 14);
    }

    @Test
    public void testSetPayPeriodsException() {
	System.out.println("setPayPeriods");
	long payPeriods = 0L;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setPayPeriods(payPeriods);
    }

    /**
     * Test of getVacationDays method, of class SalariedEmployee.
     */
    @Test
    public void testGetVacationDays() {
	System.out.println("getVacationDays");
	long expResult = 14L;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, expResult);
	long result = instance.getVacationDays();
	assertEquals(expResult, result);
    }

    /**
     * Test of setVacationDays method, of class SalariedEmployee.
     */
    @Test
    public void testSetVacationDays() {
	System.out.println("setVacationDays");
	long vacationDays = 21L;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setVacationDays(vacationDays);
	long result = instance.getVacationDays();
	assertEquals(vacationDays, result);
    }

    @Test
    public void testConstructSetVacationDaysException() {
	System.out.println("setVacationDays");
	long vacationDays = -1L;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, vacationDays);
    }

    @Test
    public void testSetVacationDaysException() {
	System.out.println("setVacationDays");
	long vacationDays = -1L;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setVacationDays(vacationDays);
    }

    @Test
    public void testConstructSetVacationDaysBigException() {
	System.out.println("setVacationDays");
	long vacationDays = 400L;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, vacationDays);
    }

    @Test
    public void testSetVacationDaysBigException() {
	System.out.println("setVacationDays");
	long vacationDays = 400L;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setVacationDays(vacationDays);
    }

}
