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
     * Test of getFirstName method, of class Employee.
     */
    @Test
    public void testGetEmpId() {
	System.out.println("getEmpId");
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(empId, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetEmpIdException() {
	System.out.println("setEmpId");
	long empId = -1;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, null, "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetFirstNameException() {
	System.out.println("setFirstName");
	String name = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", null, "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
    }

    /**
     * Test of MiddleInitial method, of class Employee.
     */
    @Test
    public void testSetMiddleInitialException() {
	System.out.println("setMiddleInitial");
	String name = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", null, "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
    }

    /**
     * Test of setLastName method, of class Employee.
     */
    @Test
    public void testSetLastNameException() {
	System.out.println("setLastName");
	String name = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", expResult, "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
    }

    @Test
    public void testSetBirthday_CalendarException() {
	System.out.println("setBirthday");
	Calendar birthday = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setBirthday(birthday);
    }

    @Test
    public void testSetFutureBirthday_CalendarException() {
	System.out.println("setBirthday");
	Calendar birthday = Calendar.getInstance(Locale.US);
	birthday.set(Calendar.YEAR, (birthday.get(Calendar.YEAR) + 1));
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
    }

    @Test
    public void testSetBirthday_StringException() {
	System.out.println("setBirthday");
	String birthday = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setBirthday(birthday);
    }

    @Test
    public void testSetFutureBirthday_StringException() {
	System.out.println("setBirthday");
	String birthday = "01/02/2250";
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", birthday, "IT", "Peon", "Hi There");
	long result = instance.getAge();
	assertEquals(expResult, result);
    }

    /**
     * Test of getStreetAddress method, of class Employee.
     */
    @Test
    public void testGetStreetAddress() {
	System.out.println("getStreetAddress");
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setStreetAddress(streetAddress);
	String result = instance.getStreetAddress();
	assertEquals(streetAddress, result);
    }

    /**
     * Test of setStreetAddress method, of class Employee.
     */
    @Test
    public void testConstructorSetStreetAddressException() {
	System.out.println("setStreetAddress");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Address cannot be null!"));
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", null, "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
    }

    /**
     * Test of setStreetAddress method, of class Employee.
     */
    @Test
    public void testSetStreetAddressException() {
	System.out.println("setStreetAddress");
	String streetAddress = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setCity(city);
	String result = instance.getCity();
	assertEquals(city, result);
    }

    /**
     * Test of setCity method, of class Employee.
     */
    @Test
    public void testConstructorCityException() {
	System.out.println("setCity");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", null, "IL", "01/01/1969", "IT", "Peon", "Hi There");
    }

    /**
     * Test of setCity method, of class Employee.
     */
    @Test
    public void testSetCityException() {
	System.out.println("setCity");
	String city = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setState(state);
	String result = instance.getState();
	assertEquals(state, result);
    }

    /**
     * Test of setState method, of class Employee.
     */
    @Test
    public void testConstructorStateException() {
	System.out.println("setState");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", null, "01/01/1969", "IT", "Peon", "Hi There");
    }

    /**
     * Test of setState method, of class Employee.
     */
    @Test
    public void testSetStateException() {
	System.out.println("setState");
	String state = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setDepartment(department);
	String result = instance.getDepartment();
	assertEquals(department, result);
    }

    /**
     * Test of setDepartment method, of class Employee.
     */
    @Test
    public void testConstructorDepartmentException() {
	System.out.println("setDepartment");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", null, "Peon", "Hi There");
    }

    /**
     * Test of setDepartment method, of class Employee.
     */
    @Test
    public void testSetDepartmentException() {
	System.out.println("setDepartment");
	String department = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setTitle(title);
	String result = instance.getTitle();
	assertEquals(title, result);
    }

    /**
     * Test of setTitle method, of class Employee.
     */
    @Test
    public void testConstructorTitleException() {
	System.out.println("setTitle");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", null, "Hi There");
    }

    /**
     * Test of setTitle method, of class Employee.
     */
    @Test
    public void testSetTitleException() {
	System.out.println("setTitle");
	String title = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	instance.setSupervisor(supervisor);
	String result = instance.getSupervisor();
	assertEquals(supervisor, result);
    }

    /**
     * Test of setSupervisor method, of class Employee.
     */
    @Test
    public void testConstructorSupervisorException() {
	System.out.println("setSupervisor");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Name cannot be null!"));
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", null);
    }

    /**
     * Test of setSupervisor method, of class Employee.
     */
    @Test
    public void testSetSupervisorException() {
	System.out.println("setSupervisor");
	String supervisor = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
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
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setHireDate(hireDate);
    }

    @Test
    public void testSetHireDate_StringException() {
	System.out.println("setHireDate");
	String hireDate = null;
	Employee instance = new EmployeeImpl(123, "Joe", "C", "Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There");
	exception.expect(IllegalArgumentException.class);
	//exception.expect(containsString("Birthday cannot be null!"));
	instance.setHireDate(hireDate);
    }

}
