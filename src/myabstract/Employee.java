package myabstract;

import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Locale;

/**
 *
 * @author wsuetholz
 */
public abstract class Employee {

    protected String name;
    protected Calendar birthday;
    protected String streetAddress;
    protected String city;
    protected String state;
    protected String department;
    protected String title;
    protected String supervisor;
    protected Calendar hireDate;

    public Employee(String name,
		    String streetAddress,
		    String city,
		    String state,
		    String birthday,
		    String department,
		    String title,
		    String supervisor) throws IllegalArgumentException {
	setName(name);
	setStreetAddress(streetAddress);
	setCity(city);
	setState(state);
	setBirthday(birthday);
	setDepartment(department);
	setTitle(title);
	setSupervisor(supervisor);
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
	setName(name);
	setStreetAddress(streetAddress);
	setCity(city);
	setState(state);
	setBirthday(birthday);
	setDepartment(department);
	setTitle(title);
	setSupervisor(supervisor);
	this.hireDate = Calendar.getInstance(Locale.US);
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
    public abstract void setName(String name) throws IllegalArgumentException;

    /**
     * @return the birthday
     */
    public Calendar getBirthday() {
	return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public abstract void setBirthday(Calendar birthday) throws IllegalArgumentException;

    /**
     * @param birthday the birthday to set in MM/DD/YYYY format
     */
    public abstract void setBirthday(String birthday) throws IllegalArgumentException;

    /**
     * @return the age calculated from birth date to today.
     */
    public long getAge() throws IllegalArgumentException {
	Calendar now = Calendar.getInstance(Locale.US);
	long age = now.get(YEAR) - birthday.get(YEAR);
	if (birthday.get(MONTH) > now.get(MONTH)
	    || (birthday.get(MONTH) == now.get(MONTH) && birthday.get(DATE) > now.get(DATE))) {
	    age--;
	}
	
	return age;
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
    public abstract void setStreetAddress(String streetAddress) throws IllegalArgumentException;

    /**
     * @return the city
     */
    public String getCity() {
	return city;
    }

    /**
     * @param city the city to set
     */
    public abstract void setCity(String city) throws IllegalArgumentException;

    /**
     * @return the state
     */
    public String getState() {
	return state;
    }

    /**
     * @param state the state to set
     */
    public abstract void setState(String state) throws IllegalArgumentException;

    /**
     * @return the department
     */
    public String getDepartment() {
	return department;
    }

    /**
     * @param department the department to set
     */
    public abstract void setDepartment(String department) throws IllegalArgumentException;

    /**
     * @return the title
     */
    public String getTitle() {
	return title;
    }

    /**
     * @param title the title to set
     */
    public abstract void setTitle(String title) throws IllegalArgumentException;

    /**
     * @return the supervisor
     */
    public String getSupervisor() {
	return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public abstract void setSupervisor(String supervisor) throws IllegalArgumentException;

    /**
     * @return the hireDate
     */
    public Calendar getHireDate() {
	return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public abstract void setHireDate(Calendar hireDate) throws IllegalArgumentException;

    /**
     * @param hireDate the hireDate to set in MM/DD/YYYY format
     */
    public abstract void setHireDate(String hireDate) throws IllegalArgumentException;
}
