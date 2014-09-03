/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.concrete;

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
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 *
 * @author wsuetholz
 */
public class EmployeeTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    public EmployeeTest() {
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee(null, "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetNameException() {
	System.out.println("setName");
	String name = null;
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", expResult, "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
    }

    @Test
    public void testSetBirthday_CalendarException() {
	System.out.println("setBirthday");
	Calendar birthday = null;
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setBirthday(birthday);
    }

    /**
     * Test of setBirthday method, of class Employee.
     */
    @Test
    public void testSetBirthday_String() {
	System.out.println("setBirthday");
	String birthday = "01/02/1969";
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
    }

    @Test
    public void testSetBirthday_StringException() {
	System.out.println("setBirthday");
	String birthday = null;
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
	long result = instance.getAge();
	assertEquals(expResult, result);
    }

    /**
     * Test of getStreetAddress method, of class Employee.
     */
    @Test
    public void testGetStreetAddress() {
	System.out.println("getStreetAddress");
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setStreetAddress(streetAddress);
	String result = instance.getStreetAddress();
	assertEquals(streetAddress, result);
    }

    /**
     * Test of getCity method, of class Employee.
     */
    @Test
    public void testGetCity() {
	System.out.println("getCity");
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setCity(city);
	String result = instance.getCity();
	assertEquals(city, result);
    }

    /**
     * Test of getState method, of class Employee.
     */
    @Test
    public void testGetState() {
	System.out.println("getState");
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setState(state);
	String result = instance.getState();
	assertEquals(state, result);
    }

    /**
     * Test of getDepartment method, of class Employee.
     */
    @Test
    public void testGetDepartment() {
	System.out.println("getDepartment");
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setDepartment(department);
	String result = instance.getDepartment();
	assertEquals(department, result);
    }

    /**
     * Test of getTitle method, of class Employee.
     */
    @Test
    public void testGetTitle() {
	System.out.println("getTitle");
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setTitle(title);
	String result = instance.getTitle();
	assertEquals(title, result);
    }

    /**
     * Test of getSupervisor method, of class Employee.
     */
    @Test
    public void testGetSupervisor() {
	System.out.println("getSupervisor");
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setSupervisor(supervisor);
	String result = instance.getSupervisor();
	assertEquals(supervisor, result);
    }

    /**
     * Test of getHireDate method, of class Employee.
     */
    @Test
    public void testGetHireDate() {
	System.out.println("getHireDate");
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new Employee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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

}
