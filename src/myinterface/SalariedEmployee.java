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
public class SalariedEmployee implements Employee {

    private String name;
    private Calendar birthday;
    private String streetAddress;
    private String city;
    private String state;
    private String department;
    private String title;
    private String supervisor;
    private Calendar hireDate;
    private double annualWage;
    private long payPeriods;
    private long vacationDays;

    public SalariedEmployee(String name,
			    String streetAddress,
			    String city,
			    String state,
			    String birthday,
			    String department,
			    String title,
			    String supervisor,
			    double annualWage,
			    long payPeriods,
			    long vacationDays) throws IllegalArgumentException {
	setName(name);
	setStreetAddress(streetAddress);
	setCity(city);
	setState(state);
	setBirthday(birthday);
	setDepartment(department);
	setTitle(title);
	setSupervisor(supervisor);
	this.hireDate = Calendar.getInstance(Locale.US);
	setAnnualWage(annualWage);
	setPayPeriods(payPeriods);
	setVacationDays(vacationDays);	
    }

    public SalariedEmployee(String name,
			    String streetAddress,
			    String city,
			    String state,
			    Calendar birthday,
			    String department,
			    String title,
			    String supervisor,
			    double annualWage,
			    long payPeriods,
			    long vacationDays) throws IllegalArgumentException {
	setName(name);
	setStreetAddress(streetAddress);
	setCity(city);
	setState(state);
	setBirthday(birthday);
	setDepartment(department);
	setTitle(title);
	setSupervisor(supervisor);
	this.hireDate = Calendar.getInstance(Locale.US);
	setAnnualWage(annualWage);
	setPayPeriods(payPeriods);
	setVacationDays(vacationDays);
    }

    @Override
    public String toString() {
	return "SalariedEmployee{" + "annualWage=" + annualWage + ", payPeriods=" + payPeriods + ", vacationDays=" + vacationDays + '}';
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

	Calendar now = Calendar.getInstance(Locale.US);
	if (now.before(birthday)) {
	    throw new IllegalArgumentException("Birthday cannot be in the future!");	    
	}

	this.birthday = birthday;
    }

    /**
     * @param birthday the birthday to set in MM/DD/YYYY format
     */
    public void setBirthday(String birthday) throws IllegalArgumentException {
	if (birthday == null) {
	    throw new IllegalArgumentException("Birthday cannot be null!");
	}

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
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
	if (hireDate == null) {
	    throw new IllegalArgumentException("HireDate cannot be null!");
	}

	this.hireDate = hireDate;
    }

    /**
     * @param hireDate the hireDate to set in MM/DD/YYYY format
     */
    public void setHireDate(String hireDate) throws IllegalArgumentException {
	if (hireDate == null) {
	    throw new IllegalArgumentException("HireDate cannot be null!");
	}

	DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
	Calendar hDate = Calendar.getInstance(Locale.US);
	try {
	    hDate.setTime(dateFormat.parse(hireDate));
	} catch (ParseException e) {
	    throw new IllegalArgumentException("Invalid HireDate Format!  " + e.getMessage());
	}

	this.hireDate = hDate;
    }
    /**
     * @return the annualWage
     */
    public double getAnnualWage() {
	return annualWage;
    }

    /**
     * @param annualWage the annualWage to set
     */
    public void setAnnualWage(double annualWage) throws IllegalArgumentException {
	if (annualWage < 0.0) {
	    throw new IllegalArgumentException("Cannot have employee OWE company!");
	}
	
	this.annualWage = annualWage;
    }

    /**
     * @return the payPeriods
     */
    public long getPayPeriods() {
	return payPeriods;
    }

    /**
     * @param payPeriods the payPeriods to set
     */
    public void setPayPeriods(long payPeriods) {
	if (payPeriods < 1) {
	    throw new IllegalArgumentException("Need at least 1 pay period!");
	}
	
	this.payPeriods = payPeriods;
    }

    /**
     * @return the vacationDays
     */
    public long getVacationDays() {
	return vacationDays;
    }

    /**
     * @param vacationDays the vacationDays to set
     */
    public void setVacationDays(long vacationDays) {
	if (vacationDays < 0) {
	    throw new IllegalArgumentException("Vacation Days cannot be negative!");
	}

	if (vacationDays > 365) {
	    throw new IllegalArgumentException("Cannot have more then a years worth of Vacation Days!");
	}
	
	this.vacationDays = vacationDays;
    }

}
