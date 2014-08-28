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
    private long age;
    private String streetAddress;
    private String city;
    private String state;
    private String department;
    private String title;
    private String supervisor;

    public void Employee(String name,
			 String streetAddress,
			 String city,
			 String state,
			 String birthday,
			 String department,
			 String title,
			 String supervisor) throws ParseException, IllegalArgumentException {
	setName(name);
	setStreetAddress(streetAddress);
	setCity(city);
	setState(state);
	setBirthday(birthday);
	setDepartment(department);
	setTitle(title);
	setSupervisor(supervisor);
    }

    public void Employee(String name,
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
    }

    /**
     * @return the Name
     */
    public String getName() {
	return name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String name) throws IllegalArgumentException {
	if (name == null) {
	    throw new IllegalArgumentException("Name cannot be null!");
	}
	this.name = name;
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
	if (birthday == null) {
	    throw new IllegalArgumentException("Birthday cannot be null!");
	}
	this.birthday = birthday;
	setAge(this.birthday);
    }

    /**
     * @param birthday the birthday to set in MM/DD/YYYY format
     */
    public void setBirthday(String birthday) throws ParseException, IllegalArgumentException {
	if (birthday == null) {
	    throw new IllegalArgumentException("Birthday cannot be null!");
	}
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	this.birthday = Calendar.getInstance(Locale.US);
	this.birthday.setTime(dateFormat.parse(birthday));
	setAge(this.birthday);
    }

    /**
     * @return the age
     */
    public long getAge() {
	return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(long age) throws IllegalArgumentException {
	if (age <= 16 || age > 75) {
	    throw new IllegalArgumentException("Age is not within allowable limits!");
	}
	this.age = age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Calendar birthday) throws IllegalArgumentException {
	if (birthday == null) {
	    throw new IllegalArgumentException("Birthday cannot be null!");
	}
	Calendar now = Calendar.getInstance(Locale.US);
	long age = now.get(YEAR) - birthday.get(YEAR);
	if (birthday.get(MONTH) > now.get(MONTH)
	    || (birthday.get(MONTH) == now.get(MONTH) && birthday.get(DATE) > now.get(DATE))) {
	    age--;
	}
	if (age <= 16 || age > 75) {
	    throw new IllegalArgumentException("Age is not within allowable limits!");
	}
	this.age = age;
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
	if (streetAddress == null) {
	    throw new IllegalArgumentException("Street Address cannot be null!");
	}
	this.streetAddress = streetAddress;
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
	if (city == null) {
	    throw new IllegalArgumentException("City cannot be null!");
	}
	this.city = city;
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
	if (state == null) {
	    throw new IllegalArgumentException("State cannot be null!");
	}
	this.state = state;
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
	if (department == null) {
	    throw new IllegalArgumentException("Department cannot be null!");
	}
	this.department = department;
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
	if (title == null) {
	    throw new IllegalArgumentException("Title cannot be null!");
	}
	this.title = title;
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
	if (supervisor == null) {
	    throw new IllegalArgumentException("Supervisor cannot be null!");
	}
	this.supervisor = supervisor;
    }
}
