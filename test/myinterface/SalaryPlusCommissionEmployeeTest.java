/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

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
     * Test of getFirstName method, of class Employee.
     */
    @Test
    public void testGetEmpId() {
	System.out.println("getEmpId");
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	long expResult = 123;
	long result = instance.getEmpId();
	assertEquals(expResult, result);
    }

    /**
     * Test of getEmpId method, of class Employee.
     */
    @Test
    public void testSetEmpId() {
	System.out.println("setEmpId");
	long empId = 321;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	instance.setEmpId(empId);
	long result = instance.getEmpId();
	assertEquals(empId, result);
    }

    /**
     * Test of setEmpId method, of class Employee.
     */
    @Test
    public void testConstructorEmpIdException() {
	System.out.println("setEmpId");
	long empId = -1;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(empId, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetEmpIdException() {
	System.out.println("setEmpId");
	long empId = -1;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setEmpId(empId);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
	System.out.println("getName");
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	String expResult = "Joe C. Doe";
	String result = instance.getName();
	assertEquals(expResult, result);
    }

    /**
     * Test of getFirstName method, of class Employee.
     */
    @Test
    public void testGetFirstName() {
	System.out.println("getFirstName");
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	String expResult = "Joe";
	String result = instance.getFirstName();
	assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetFirstName() {
	System.out.println("setFirstName");
	String name = "John";
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	instance.setFirstName(name);
	String result = instance.getFirstName();
	assertEquals(name, result);
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testConstructorFirstNameException() {
	System.out.println("setFirstName");
	String name = null;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, null, "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetFirstNameException() {
	System.out.println("setFirstName");
	String name = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setFirstName(name);
    }

    /**
     * Test of getMiddleInitial method, of class Employee.
     */
    @Test
    public void testGetMiddleInitial() {
	System.out.println("getMiddleInitial");
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	String expResult = "C";
	String result = instance.getMiddleInitial();
	assertEquals(expResult, result);
    }

    /**
     * Test of setMiddleInitial method, of class Employee.
     */
    @Test
    public void testSetMiddleInitial() {
	System.out.println("setMiddleInitial");
	String name = "Q";
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	instance.setMiddleInitial(name);
	String result = instance.getMiddleInitial();
	assertEquals(name, result);
    }

    /**
     * Test of constructor exception handling, of class Employee.
     */
    @Test
    public void testConstructorMiddleInitialException() {
	System.out.println("setMiddleInitial");
	String name = null;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", null, "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of MiddleInitial method, of class Employee.
     */
    @Test
    public void testSetMiddleInitialException() {
	System.out.println("setMiddleInitial");
	String name = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setMiddleInitial(name);
    }

    /**
     * Test of getLastName method, of class Employee.
     */
    @Test
    public void testGetLastName() {
	System.out.println("getFirstName");
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	String expResult = "Doe";
	String result = instance.getLastName();
	assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @Test
    public void testSetLastName() {
	System.out.println("setLastName");
	String name = "Public";
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	instance.setLastName(name);
	String result = instance.getLastName();
	assertEquals(name, result);
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @Test
    public void testConstructorLastNameException() {
	System.out.println("setLastName");
	String name = null;
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", null, "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @Test
    public void testSetLastNameException() {
	System.out.println("setLastName");
	String name = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	instance.setLastName(name);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", expResult, "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
    }

    @Test
    public void testSetBirthday_CalendarException() {
	System.out.println("setBirthday");
	Calendar birthday = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setBirthday(birthday);
    }

    @Test
    public void testSetFutureBirthday_CalendarException() {
	System.out.println("setBirthday");
	Calendar birthday = Calendar.getInstance(Locale.US);
	birthday.set(Calendar.YEAR, (birthday.get(Calendar.YEAR) + 1));
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
    }

    @Test
    public void testSetBirthday_StringException() {
	System.out.println("setBirthday");
	String birthday = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setBirthday(birthday);
    }

    @Test
    public void testSetFutureBirthday_StringException() {
	System.out.println("setBirthday");
	String birthday = "01/02/2250";
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
	long result = instance.getAge();
	assertEquals(expResult, result);
    }

    /**
     * Test of getStreetAddress method, of class Employee.
     */
    @Test
    public void testGetStreetAddress() {
	System.out.println("getStreetAddress");
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", null, "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetStreetAddressException() {
	System.out.println("setStreetAddress");
	String streetAddress = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", null, "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetCityException() {
	System.out.println("setCity");
	String city = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", null, "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetStateException() {
	System.out.println("setState");
	String state = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", null, "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetDepartmentException() {
	System.out.println("setDepartment");
	String department = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", null, "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetTitleException() {
	System.out.println("setTitle");
	String title = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", null, 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetSupervisorException() {
	System.out.println("setSupervisor");
	String supervisor = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setHireDate(hireDate);
    }

    @Test
    public void testSetHireDate_StringException() {
	System.out.println("setHireDate");
	String hireDate = null;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setHireDate(hireDate);
    }
    /**
     * Test of getAnnualWage method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testGetAnnualWage() {
	System.out.println("getAnnualWage");
	double expResult = 10000.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", expResult, 24,14, 15.0f, 1500.00, 25000.00);
	double result = instance.getAnnualWage();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAnnualWage method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testSetAnnualWage() {
	System.out.println("setAnnualWage");
	double annualWage = 15000.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", annualWage, 24,14, 15.0f, 1500.00, 25000.00);
    }

    @Test
    public void testSetAnnualWageException() {
	System.out.println("setAnnualWage");
	double annualWage = -1.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setAnnualWage(annualWage);
    }

    /**
     * Test of getPayPeriods method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testGetPayPeriods() {
	System.out.println("getPayPeriods");
	long expResult = 24L;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, expResult,14, 15.0f, 1500.00, 25000.00);
	long result = instance.getPayPeriods();
	assertEquals(expResult, result);
    }

    /**
     * Test of setPayPeriods method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testSetPayPeriods() {
	System.out.println("setPayPeriods");
	long payPeriods = 26L;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, payPeriods,14, 15.0f, 1500.00, 25000.00);
    }

    @Test
    public void testSetPayPeriodsException() {
	System.out.println("setPayPeriods");
	long payPeriods = 0L;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setPayPeriods(payPeriods);
    }

    /**
     * Test of getVacationDays method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testGetVacationDays() {
	System.out.println("getVacationDays");
	long expResult = 14L;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, expResult, 15.0f, 1500.00, 25000.00);
	long result = instance.getVacationDays();
	assertEquals(expResult, result);
    }

    /**
     * Test of setVacationDays method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testSetVacationDays() {
	System.out.println("setVacationDays");
	long vacationDays = 21L;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, vacationDays, 15.0f, 1500.00, 25000.00);
    }

    @Test
    public void testSetVacationDaysException() {
	System.out.println("setVacationDays");
	long vacationDays = -1L;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, vacationDays, 15.0f, 1500.00, 25000.00);
    }

    @Test
    public void testSetVacationDaysBigException() {
	System.out.println("setVacationDays");
	long vacationDays = 400L;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24,14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setVacationDays(vacationDays);
    }

    /**
     * Test of getCommissionPercentage method, of class SalaryPlusCommissionEmployee.
     */
    @Test
    public void testGetCommissionPercentage() {
	System.out.println("getCommissionPercentage");
	float expResult = 15.0F;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, expResult, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, commissionPercentage, 1500.00, 25000.00);
    }

    @Test
    public void testSetCommissionPercentageException() {
	System.out.println("setCommissionPercentage");
	float commissionPercentage = -1.0f;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, commissionPercentage, 1500.00, 25000.00);
    }

    @Test
    public void testSetCommissionPercentageBigException() {
	System.out.println("setCommissionPercentage");
	float commissionPercentage = 101.0f;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, expResult, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, periodGrossSales, 25000.00);
    }

    @Test
    public void testSetPeriodGrossSalesException() {
	System.out.println("setPeriodGrossSales");
	double periodGrossSales = -1.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, expResult);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
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
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, periodTargetSales);
    }

    @Test
    public void testSetPeriodTargetSalesException() {
	System.out.println("setPeriodGrossSales");
	double periodTargetSales = -1.0;
	SalaryPlusCommissionEmployee instance = new SalaryPlusCommissionEmployee(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Cannot have employee OWE company!"));
	instance.setPeriodTargetSalesAmount(periodTargetSales);
    }

}
