package my.concrete;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Locale;

/**
 *
 * @author wsuetholz
 */
public class Employee {

    private String name;
    private Calendar birthday;
    private String streetAddress;
    private String city;
    private String state;
    private String department;
    private String title;
    private String supervisor;
    private Calendar hireDate;

    public Employee(String name,
		    String streetAddress,
		    String city,
		    String state,
		    String birthday,
		    String department,
		    String title,
		    String supervisor) throws IllegalArgumentException {
	this.name = validateName(name);
	this.streetAddress = validateStreetAddress(streetAddress);
	this.city = validateCity(city);
	this.state = validateState(state);
	this.birthday = validateBirthday(birthday);
	this.department = validateDepartment(department);
	this.title = validateTitle(title);
	this.supervisor = validateSupervisor(supervisor);
	this.hireDate = Calendar.getInstance(Locale.US);
    }

    public Employee(String name,
		    String streetAddress,
		    String city,
		    String state,
		    Calendar birthday,
		    String department,
		    String title,
		    String supervisor) throws IllegalArgumentException {
	this.name = validateName(name);
	this.streetAddress = validateStreetAddress(streetAddress);
	this.city = validateCity(city);
	this.state = validateState(state);
	this.birthday = validateBirthday(birthday);
	this.department = validateDepartment(department);
	this.title = validateTitle(title);
	this.supervisor = validateSupervisor(supervisor);
	this.hireDate = Calendar.getInstance(Locale.US);
    }

    /**
     * @param name the Name to validate
     * @return the Name
     */
    protected static String validateName(String name) throws IllegalArgumentException {
	if (name == null) {
	    throw new IllegalArgumentException("Name cannot be null!");
	}
	return name;
    }

    /**
     * @return the Name
     */
    public String getName() {
	return name;
    }

    /**
     * @param name the Name to set
     */
    public void setName(String name) throws IllegalArgumentException {
	this.name = validateName(name);
    }

    /**
     * @param birthday the birthday to validate
     * @return the birthday
     */
    protected static Calendar validateBirthday(Calendar birthday) {
	if (birthday == null) {
	    throw new IllegalArgumentException("Birthday cannot be null!");
	}

	return birthday;
    }

    /**
     * @param birthday the birthday to validate
     * @return the birthday
     */
    protected static Calendar validateBirthday(String birthday) throws IllegalArgumentException {
	if (birthday == null) {
	    throw new IllegalArgumentException("Birthday cannot be null!");
	}

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Calendar bday = Calendar.getInstance(Locale.US);
	try {
	    bday.setTime(dateFormat.parse(birthday));
	} catch (ParseException e) {
	    throw new IllegalArgumentException("Invalid Birthday Format!  " + e.getMessage());
	}
	return bday;
    }

    /**
     * @return the birthday
     */
    public Calendar getBirthday() {
	return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Calendar birthday) throws IllegalArgumentException {
	this.birthday = validateBirthday(birthday);
    }

    /**
     * @param birthday the birthday to set in MM/DD/YYYY format
     */
    public void setBirthday(String birthday) throws IllegalArgumentException {
	this.birthday = validateBirthday(birthday);
    }

    /**
     * @return the age calculated from birth date to today.
     */
    public long getAge() {
	Calendar now = Calendar.getInstance(Locale.US);
	long age = now.get(YEAR) - birthday.get(YEAR);
	if (birthday.get(MONTH) > now.get(MONTH)
	    || (birthday.get(MONTH) == now.get(MONTH) && birthday.get(DATE) > now.get(DATE))) {
	    age--;
	}
	return age;
    }

    /**
     * @param streetAddress the streetAddress to validate
     * @return the streetAddress
     */
    protected static String validateStreetAddress(String streetAddress) throws IllegalArgumentException {
	if (streetAddress == null) {
	    throw new IllegalArgumentException("Street Address cannot be null!");
	}
	return streetAddress;
    }

    /**
     * @return the streetAddress
     */
    public String getStreetAddress() {
	return streetAddress;
    }

    /**
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) throws IllegalArgumentException {
	this.streetAddress = validateStreetAddress(streetAddress);
    }

    /**
     * @param city the city to validate
     * @return the city
     */
    protected static String validateCity(String city) throws IllegalArgumentException {
	if (city == null) {
	    throw new IllegalArgumentException("City cannot be null!");
	}
	return city;
    }

    /**
     * @return the city
     */
    public String getCity() {
	return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) throws IllegalArgumentException {
	this.city = validateCity(city);
    }

    /**
     * @param state the state to validate
     * @return the state
     */
    protected static String validateState(String state) throws IllegalArgumentException {
	if (state == null) {
	    throw new IllegalArgumentException("State cannot be null!");
	}
	return state;
    }

    /**
     * @return the state
     */
    public String getState() {
	return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) throws IllegalArgumentException {
	this.state = validateState(state);
    }

    /**
     * @param department the department to validate
     * @return the department
     */
    protected static String validateDepartment(String department) throws IllegalArgumentException {
	if (department == null) {
	    throw new IllegalArgumentException("Department cannot be null!");
	}
	return department;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
	return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) throws IllegalArgumentException {
	this.department = validateDepartment(department);
    }

    /**
     * @param title the title to validate
     * @return the title
     */
    protected static String validateTitle(String title) throws IllegalArgumentException {
	if (title == null) {
	    throw new IllegalArgumentException("Title cannot be null!");
	}
	return title;
    }

    /**
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) throws IllegalArgumentException {
	this.title = validateTitle(title);
    }

    /**
     * @param supervisor the supervisor to validate
     * @return the supervisor
     */
    protected static String validateSupervisor(String supervisor) throws IllegalArgumentException {
	if (supervisor == null) {
	    throw new IllegalArgumentException("Supervisor cannot be null!");
	}
	return supervisor;
    }

    /**
     * @return the supervisor
     */
    public String getSupervisor() {
	return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(String supervisor) throws IllegalArgumentException {
	this.supervisor = validateSupervisor(supervisor);
    }

    /**
     * @param hireDate the hireDate to validate
     * @return the hireDate
     */
    protected static Calendar validateHireDate(Calendar hireDate) {
	if (hireDate == null) {
	    throw new IllegalArgumentException("HireDate cannot be null!");
	}

	return hireDate;
    }

    /**
     * @param hireDate the hireDate to validate
     * @return the hireDate
     */
    protected static Calendar validateHireDate(String hireDate) throws IllegalArgumentException {
	if (hireDate == null) {
	    throw new IllegalArgumentException("HireDate cannot be null!");
	}

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Calendar bday = Calendar.getInstance(Locale.US);
	try {
	    bday.setTime(dateFormat.parse(hireDate));
	} catch (ParseException e) {
	    throw new IllegalArgumentException("Invalid HireDate Format!  " + e.getMessage());
	}
	return bday;
    }

    /**
     * @return the hireDate
     */
    public Calendar getHireDate() {
	return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Calendar hireDate) throws IllegalArgumentException {
	this.hireDate = validateHireDate(hireDate);
    }

    /**
     * @param hireDate the hireDate to set in MM/DD/YYYY format
     */
    public void setHireDate(String hireDate) throws IllegalArgumentException {
	this.hireDate = validateHireDate(hireDate);
    }
}
