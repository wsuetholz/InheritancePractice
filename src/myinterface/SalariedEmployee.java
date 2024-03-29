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

    private long empId;
    private String firstName;
    private String middleInitial;
    private String lastName;
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

    public SalariedEmployee(long empId,
			    String firstName,
			    String middleInitial,
			    String lastName,
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
	setEmpId(empId);
	setFirstName(firstName);
	setMiddleInitial(middleInitial);
	setLastName(lastName);
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

    public SalariedEmployee(long empId,
			    String firstName,
			    String middleInitial,
			    String lastName,
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
	setEmpId(empId);
	setFirstName(firstName);
	setMiddleInitial(middleInitial);
	setLastName(lastName);
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

    /**
     * @return the Employee ID
     */
    @Override
    public long getEmpId() {
	return empId;
    }

    /**
     * @param empId the Employee ID to set
     */
    @Override
    public void setEmpId(long empId) throws IllegalArgumentException {
	if (empId <= 0) {
	    throw new IllegalArgumentException("Employee ID has to be greater then 0!");
	}
	this.empId = empId;
    }

    /**
     * @return the Name as First M. Last
     */
    @Override
    public String getName() {
	StringBuilder name = new StringBuilder(getFirstName());
	name.append(" ");
	name.append(getMiddleInitial());
	name.append(". ");
	name.append(getLastName());
	return name.toString();
    }

    /**
     * @return the First Name
     */
    @Override
    public String getFirstName() {
	return firstName;
    }

    /**
     * @param firstName the First Name to set
     */
    @Override
    public void setFirstName(String firstName) throws IllegalArgumentException {
	if (firstName == null) {
	    throw new IllegalArgumentException("firstName cannot be null!");
	}
	this.firstName = firstName;
    }

    /**
     * @return the Middle Initial
     */
    @Override
    public String getMiddleInitial() {
	return middleInitial;
    }

    /**
     * @param middleInitial the Middle Initial to set
     */
    @Override
    public void setMiddleInitial(String middleInitial) throws IllegalArgumentException {
	if (middleInitial == null) {
	    throw new IllegalArgumentException("middleInitial cannot be null!");
	}
	this.middleInitial = middleInitial;
    }

    /**
     * @return the Last Name
     */
    @Override
    public String getLastName() {
	return lastName;
    }

    /**
     * @param lastName the Last Name to set
     */
    @Override
    public void setLastName(String lastName) throws IllegalArgumentException {
	if (lastName == null) {
	    throw new IllegalArgumentException("lastName cannot be null!");
	}
	this.lastName = lastName;
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
