/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
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
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
	System.out.println("getName");
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	String expResult = "Joe C Doe";
	String result = instance.getName();
	assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
	System.out.println("setName");
	String name = "John Q Public";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setName(name);
	String result = instance.getName();
	assertEquals(name, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testConstructorNameException() {
	System.out.println("setName");
	String name = null;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee(name, "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetNameException() {
	System.out.println("setName");
	String name = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setName(name);
    }

    /**
     * Test of getBirthday method, of class Employee.
     */
    @Test
    public void testGetBirthday() {
	System.out.println("getBirthday");
	Calendar expResult = Calendar.getInstance(Locale.US);
	expResult.set(Calendar.YEAR, 1969);
	expResult.set(Calendar.MONTH, 01);
	expResult.set(Calendar.DAY_OF_MONTH, 02);
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", expResult, "IT", "Peon", "Hi There", 10000.00, 24, 14);
	Calendar result = instance.getBirthday();
	assertEquals(expResult, result);
    }

    /**
     * Test of setBirthday method, of class Employee.
     */
    @Test
    public void testSetBirthday_Calendar() {
	System.out.println("setBirthday");
	Calendar birthday = Calendar.getInstance(Locale.US);
	birthday.set(Calendar.YEAR, 1969);
	birthday.set(Calendar.MONTH, 01);
	birthday.set(Calendar.DAY_OF_MONTH, 02);
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setBirthday(birthday);
	Calendar result = instance.getBirthday();
	assertEquals(birthday, result);
    }

    @Test
    public void testConstructBirthday_CalendarException() {
	System.out.println("setBirthday");
	Calendar birthday = null;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24, 14);
    }

    @Test
    public void testSetBirthday_CalendarException() {
	System.out.println("setBirthday");
	Calendar birthday = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setBirthday(birthday);
    }

    @Test
    public void testSetFutureBirthday_CalendarException() {
	System.out.println("setBirthday");
	Calendar birthday = Calendar.getInstance(Locale.US);
	birthday.set(Calendar.YEAR, (birthday.get(Calendar.YEAR) + 1));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be in the future!"));
	instance.setBirthday(birthday);
    }

    /**
     * Test of setBirthday method, of class Employee.
     */
    @Test
    public void testSetBirthday_String() {
	System.out.println("setBirthday");
	String birthday = "01/02/1969";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setBirthday(birthday);
	Calendar result = instance.getBirthday();
	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	dateFormat.setTimeZone(result.getTimeZone());
	String resultStr = dateFormat.format(result.getTime());
	assertEquals(birthday, resultStr);
    }

    @Test
    public void testConstructBirthday_StringException() {
	System.out.println("setBirthday");
	String birthday = null;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24, 14);
    }

    @Test
    public void testSetBirthday_StringException() {
	System.out.println("setBirthday");
	String birthday = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setBirthday(birthday);
    }

    @Test
    public void testSetFutureBirthday_StringException() {
	System.out.println("setBirthday");
	String birthday = "01/02/2250";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setBirthday(birthday);
    }

    /**
     * Test of getAge method, of class Employee.
     */
    @Test
    public void testGetAge() {
	System.out.println("getAge");
	long expResult = 45L;
	Calendar birthday = Calendar.getInstance(Locale.US);
	birthday.set(Calendar.YEAR, (birthday.get(Calendar.YEAR) - (int) expResult));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24, 14);
	long result = instance.getAge();
	assertEquals(expResult, result);
    }

    /**
     * Test of getStreetAddress method, of class Employee.
     */
    @Test
    public void testGetStreetAddress() {
	System.out.println("getStreetAddress");
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	String expResult = "123 45th Street";
	String result = instance.getStreetAddress();
	assertEquals(expResult, result);
    }

    /**
     * Test of setStreetAddress method, of class Employee.
     */
    @Test
    public void testSetStreetAddress() {
	System.out.println("setStreetAddress");
	String streetAddress = "987 65th Street";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setStreetAddress(streetAddress);
	String result = instance.getStreetAddress();
	assertEquals(streetAddress, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testConstructorSetStreetAddressException() {
	System.out.println("setStreetAddress");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Address cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", null, "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetStreetAddressException() {
	System.out.println("setStreetAddress");
	String streetAddress = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setStreetAddress(streetAddress);
    }

    /**
     * Test of getCity method, of class Employee.
     */
    @Test
    public void testGetCity() {
	System.out.println("getCity");
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	String expResult = "Normal";
	String result = instance.getCity();
	assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Employee.
     */
    @Test
    public void testSetCity() {
	System.out.println("setCity");
	String city = "Abnormal";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setCity(city);
	String result = instance.getCity();
	assertEquals(city, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testConstructorCityException() {
	System.out.println("setCity");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", null, "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetCityException() {
	System.out.println("setCity");
	String city = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setCity(city);
    }

    /**
     * Test of getState method, of class Employee.
     */
    @Test
    public void testGetState() {
	System.out.println("getState");
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	String expResult = "IL";
	String result = instance.getState();
	assertEquals(expResult, result);
    }

    /**
     * Test of setState method, of class Employee.
     */
    @Test
    public void testSetState() {
	System.out.println("setState");
	String state = "WI";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setState(state);
	String result = instance.getState();
	assertEquals(state, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testConstructorStateException() {
	System.out.println("setState");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", null, "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetStateException() {
	System.out.println("setState");
	String state = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setState(state);
    }

    /**
     * Test of getDepartment method, of class Employee.
     */
    @Test
    public void testGetDepartment() {
	System.out.println("getDepartment");
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	String expResult = "IT";
	String result = instance.getDepartment();
	assertEquals(expResult, result);
    }

    /**
     * Test of setDepartment method, of class Employee.
     */
    @Test
    public void testSetDepartment() {
	System.out.println("setDepartment");
	String department = "SALES";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setDepartment(department);
	String result = instance.getDepartment();
	assertEquals(department, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testConstructorDepartmentException() {
	System.out.println("setDepartment");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", null, "Peon", "Hi There", 10000.00, 24, 14);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetDepartmentException() {
	System.out.println("setDepartment");
	String department = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setDepartment(department);
    }

    /**
     * Test of getTitle method, of class Employee.
     */
    @Test
    public void testGetTitle() {
	System.out.println("getTitle");
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	String expResult = "Peon";
	String result = instance.getTitle();
	assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Employee.
     */
    @Test
    public void testSetTitle() {
	System.out.println("setTitle");
	String title = "Servant";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setTitle(title);
	String result = instance.getTitle();
	assertEquals(title, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testConstructorTitleException() {
	System.out.println("setTitle");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", null, "Hi There", 10000.00, 24, 14);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetTitleException() {
	System.out.println("setTitle");
	String title = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setTitle(title);
    }

    /**
     * Test of getSupervisor method, of class Employee.
     */
    @Test
    public void testGetSupervisor() {
	System.out.println("getSupervisor");
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	String expResult = "Hi There";
	String result = instance.getSupervisor();
	assertEquals(expResult, result);
    }

    /**
     * Test of setSupervisor method, of class Employee.
     */
    @Test
    public void testSetSupervisor() {
	System.out.println("setSupervisor");
	String supervisor = "So Long";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setSupervisor(supervisor);
	String result = instance.getSupervisor();
	assertEquals(supervisor, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testConstructorSupervisorException() {
	System.out.println("setSupervisor");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", null, 10000.00, 24, 14);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetSupervisorException() {
	System.out.println("setSupervisor");
	String supervisor = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setSupervisor(supervisor);
    }

    /**
     * Test of getHireDate method, of class Employee.
     */
    @Test
    public void testGetHireDate() {
	System.out.println("getHireDate");
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	Calendar expResult = Calendar.getInstance(Locale.US);
	Calendar result = instance.getHireDate();
	assertEquals(expResult, result);
    }

    /**
     * Test of setHireDate method, of class Employee.
     */
    @Test
    public void testSetHireDate_Calendar() {
	System.out.println("setHireDate");
	long expYears = 5L;
	Calendar hireDate = Calendar.getInstance(Locale.US);
	hireDate.set(Calendar.YEAR, (hireDate.get(Calendar.YEAR) - (int) expYears));
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setHireDate(hireDate);
	Calendar result = instance.getHireDate();
	assertEquals(hireDate, result);
    }

    /**
     * Test of setHireDate method, of class Employee.
     */
    @Test
    public void testSetHireDate_String() {
	System.out.println("setHireDate");
	String hireDate = "01/10/2009";
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	instance.setHireDate(hireDate);
	Calendar result = Calendar.getInstance(Locale.US);
	result.set(Calendar.YEAR, 2009);
	result.set(Calendar.MONTH, 00);
	result.set(Calendar.DAY_OF_MONTH, 10);

	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	dateFormat.setTimeZone(result.getTimeZone());
	String resultStr = dateFormat.format(result.getTime());
	assertEquals(hireDate, resultStr);
    }

    @Test
    public void testSetHireDate_CalendarException() {
	System.out.println("setHireDate");
	Calendar hireDate = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setHireDate(hireDate);
    }

    @Test
    public void testSetHireDate_StringException() {
	System.out.println("setHireDate");
	String hireDate = null;
	SalariedEmployee instance = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setHireDate(hireDate);
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
