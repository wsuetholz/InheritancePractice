/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

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
public class SalaryPlusCommissionEmployeeTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    public SalaryPlusCommissionEmployeeTest() {
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
     * Test of getCommissionPercentage method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testGetCommissionPercentage() {
	System.out.println("getCommissionPercentage");
	float expResult = 15.0F;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, expResult, 1500.00, 25000.00);
	float result = instance.getCommissionPercentage();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setCommissionPercentage method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testSetCommissionPercentage() {
	System.out.println("setCommissionPercentage");
	float commissionPercentage = 10.0F;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	instance.setCommissionPercentage(commissionPercentage);
	float result = instance.getCommissionPercentage();
	assertEquals(commissionPercentage, result, 0.0);
    }

    @Test
    public void testConstructSetCommissionPercentageException() {
	System.out.println("setCommissionPercentage");
	float commissionPercentage = -1.0f;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, commissionPercentage, 1500.00, 25000.00);
    }

    @Test
    public void testSetCommissionPercentageException() {
	System.out.println("setCommissionPercentage");
	float commissionPercentage = -1.0f;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setCommissionPercentage(commissionPercentage);
    }

    @Test
    public void testConstructSetCommissionPercentageBigException() {
	System.out.println("setCommissionPercentage");
	float commissionPercentage = 101.0f;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, commissionPercentage, 1500.00, 25000.00);
    }

    @Test
    public void testSetCommissionPercentageBigException() {
	System.out.println("setCommissionPercentage");
	float commissionPercentage = 101.0f;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setCommissionPercentage(commissionPercentage);
    }

    /**
     * Test of calculateCommission method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testCalculateCommission() {
	System.out.println("calculateCommission");
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	double expResult = (1500.00 * 15.0f);
	double result = instance.calculateCommission();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getPeriodGrossSalesAmount method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testGetPeriodGrossSalesAmount() {
	System.out.println("getPeriodGrossSalesAmount");
	double expResult = 1500.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, expResult, 25000.00);
	double result = instance.getPeriodGrossSalesAmount();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPeriodGrossSalesAmount method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testSetPeriodGrossSalesAmount() {
	System.out.println("setPeriodGrossSalesAmount");
	double periodGrossSalesAmount = 2000.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	instance.setPeriodGrossSalesAmount(periodGrossSalesAmount);
	double result = instance.getPeriodGrossSalesAmount();
	assertEquals(periodGrossSalesAmount, result, 0.0);
    }

    @Test
    public void testConstructSetPeriodGrossSalesException() {
	System.out.println("setPeriodGrossSales");
	double periodGrossSales = -1.0;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, periodGrossSales, 25000.00);
    }

    @Test
    public void testSetPeriodGrossSalesException() {
	System.out.println("setPeriodGrossSales");
	double periodGrossSales = -1.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setPeriodGrossSalesAmount(periodGrossSales);
    }

    /**
     * Test of incrementPeriodGrossSalesAmount method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testIncrementPeriodGrossSalesAmount() {
	System.out.println("incrementPeriodGrossSalesAmount");
	double periodGrossSalesAmountIncrement = 500.0;
	double expResult = 2000.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	instance.incrementPeriodGrossSalesAmount(periodGrossSalesAmountIncrement);
	double result = instance.getPeriodGrossSalesAmount();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getPeriodTargetSalesAmount method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testGetPeriodTargetSalesAmount() {
	System.out.println("getPeriodTargetSalesAmount");
	double expResult = 25000.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, expResult);
	double result = instance.getPeriodTargetSalesAmount();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPeriodTargetSalesAmount method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testSetPeriodTargetSalesAmount() {
	System.out.println("setPeriodTargetSalesAmount");
	double periodTargetSalesAmount = 30000.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	instance.setPeriodTargetSalesAmount(periodTargetSalesAmount);
	double result = instance.getPeriodTargetSalesAmount();
	assertEquals(periodTargetSalesAmount, result, 0.0);
    }
    
    @Test
    public void testConstructSetPeriodTargetSalesException() {
	System.out.println("setPeriodTargetSales");
	double periodTargetSales = -1.0;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, periodTargetSales);
    }

    @Test
    public void testSetPeriodTargetSalesException() {
	System.out.println("setPeriodGrossSales");
	double periodTargetSales = -1.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setPeriodTargetSalesAmount(periodTargetSales);
    }

}
