/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

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
public class HourlyEmployeeImpl implements HourlyEmployee {

    private String name;
    private Calendar birthday;
    private String streetAddress;
    private String city;
    private String state;
    private String department;
    private String title;
    private String supervisor;
    private Calendar hireDate;
    private double hourlyWage;
    private long hoursWorked;

    public HourlyEmployeeImpl(String name,
			  String streetAddress,
			  String city,
			  String state,
			  String birthday,
			  String department,
			  String title,
			  String supervisor,
			  double hourlyWage,
			  long hoursWorked) throws IllegalArgumentException {
	setName(name);
	setStreetAddress(streetAddress);
	setCity(city);
	setState(state);
	setBirthday(birthday);
	setDepartment(department);
	setTitle(title);
	setSupervisor(supervisor);
	this.hireDate = Calendar.getInstance(Locale.US);
	setHourlyWage(hourlyWage);
	setHoursWorked(hoursWorked);
    }

    public HourlyEmployeeImpl(String name,
			  String streetAddress,
			  String city,
			  String state,
			  Calendar birthday,
			  String department,
			  String title,
			  String supervisor,
			  double hourlyWage,
			  long hoursWorked) throws IllegalArgumentException {
	setName(name);
	setStreetAddress(streetAddress);
	setCity(city);
	setState(state);
	setBirthday(birthday);
	setDepartment(department);
	setTitle(title);
	setSupervisor(supervisor);
	this.hireDate = Calendar.getInstance(Locale.US);
	setHourlyWage(hourlyWage);
	setHoursWorked(hoursWorked);
    }

    /**
     * @return the Name
     */
    @Override
    public String getName() {
	return name;
    }

    /**
     * @param name the Name to set
     */
    @Override
    public void setName(String name) throws IllegalArgumentException {
	if (name == null) {
	    throw new IllegalArgumentException("Name cannot be null!");
	}
	this.name = name;
    }

    /**
     * @return the birthday
     */
    @Override
    public Calendar getBirthday() {
	return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    @Override
    public void setBirthday(Calendar birthday) throws IllegalArgumentException {
	if (birthday == null) {
	    throw new IllegalArgumentException("Birthday cannot be null!");
	}

	Calendar now = Calendar.getInstance(Locale.US);
	if (now.before(birthday)) {
	    throw new IllegalArgumentException("Birthday cannot be in the future!");	    
	}

	this.birthday = birthday;
    }

    /**
     * @param birthday the birthday to set in MM/DD/YYYY format
     */
    @Override
    public void setBirthday(String birthday) throws IllegalArgumentException {
	if (birthday == null) {
	    throw new IllegalArgumentException("Birthday cannot be null!");
	}

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Calendar bDay = Calendar.getInstance(Locale.US);
	try {
	    bDay.setTime(dateFormat.parse(birthday));
	} catch (ParseException e) {
	    throw new IllegalArgumentException("Invalid Birthday Format!  " + e.getMessage());
	}
	
	Calendar now = Calendar.getInstance(Locale.US);
	if (now.before(bDay)) {
	    throw new IllegalArgumentException("Birthday cannot be in the future!");	    
	}

	this.birthday = bDay;
    }

    /**
     * @return the age calculated from birth date to today.
     */
    @Override
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
    @Override
    public String getStreetAddress() {
	return streetAddress;
    }

    /**
     * @param streetAddress the streetAddress to set
     */
    @Override
    public void setStreetAddress(String streetAddress) throws IllegalArgumentException {
	if (streetAddress == null) {
	    throw new IllegalArgumentException("Street Address cannot be null!");
	}

	this.streetAddress = streetAddress;
    }

    /**
     * @return the city
     */
    @Override
    public String getCity() {
	return city;
    }

    /**
     * @param city the city to set
     */
    @Override
    public void setCity(String city) throws IllegalArgumentException {
	if (city == null) {
	    throw new IllegalArgumentException("City cannot be null!");
	}

	this.city = city;
    }

    /**
     * @return the state
     */
    @Override
    public String getState() {
	return state;
    }

    /**
     * @param state the state to set
     */
    @Override
    public void setState(String state) throws IllegalArgumentException {
	if (state == null) {
	    throw new IllegalArgumentException("State cannot be null!");
	}

	this.state = state;
    }

    /**
     * @return the department
     */
    @Override
    public String getDepartment() {
	return department;
    }

    /**
     * @param department the department to set
     */
    @Override
    public void setDepartment(String department) throws IllegalArgumentException {
	if (department == null) {
	    throw new IllegalArgumentException("Department cannot be null!");
	}

	this.department = department;
    }

    /**
     * @return the title
     */
    @Override
    public String getTitle() {
	return title;
    }

    /**
     * @param title the title to set
     */
    @Override
    public void setTitle(String title) throws IllegalArgumentException {
	if (title == null) {
	    throw new IllegalArgumentException("Title cannot be null!");
	}

	this.title = title;
    }

    /**
     * @return the supervisor
     */
    @Override
    public String getSupervisor() {
	return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    @Override
    public void setSupervisor(String supervisor) throws IllegalArgumentException {
	if (supervisor == null) {
	    throw new IllegalArgumentException("Supervisor cannot be null!");
	}

	this.supervisor = supervisor;
    }

    /**
     * @return the hireDate
     */
    @Override
    public Calendar getHireDate() {
	return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    @Override
    public void setHireDate(Calendar hireDate) throws IllegalArgumentException {
	if (hireDate == null) {
	    throw new IllegalArgumentException("HireDate cannot be null!");
	}

	this.hireDate = hireDate;
    }

    /**
     * @param hireDate the hireDate to set in MM/DD/YYYY format
     */
    @Override
    public void setHireDate(String hireDate) throws IllegalArgumentException {
	if (hireDate == null) {
	    throw new IllegalArgumentException("HireDate cannot be null!");
	}

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Calendar hDate = Calendar.getInstance(Locale.US);
	try {
	    hDate.setTime(dateFormat.parse(hireDate));
	} catch (ParseException e) {
	    throw new IllegalArgumentException("Invalid HireDate Format!  " + e.getMessage());
	}

	this.hireDate = hDate;
    }

    /**
     * @return the hourlyWage
     */
    @Override
    public double getHourlyWage() {
	return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    @Override
    public void setHourlyWage(double hourlyWage) {
	if (hourlyWage < 0.0) {
	    throw new IllegalArgumentException("Cannot have employee OWE company!");
	}

	this.hourlyWage = hourlyWage;
    }

    /**
     * @return the hoursWorked
     */
    @Override
    public long getHoursWorked() {
	return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    @Override
    public void setHoursWorked(long hoursWorked) {
	if (hoursWorked < 0) {
	    throw new IllegalArgumentException("Hours Worked cannot be negative!");
	}

	this.hoursWorked = hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    @Override
    public void incrementHoursWorked(long hoursWorkedIncrement) {
	this.hoursWorked += hoursWorkedIncrement;
    }

}
