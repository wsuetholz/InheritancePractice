/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterface;

import my.concrete.*;
import java.util.Calendar;

/**
 *
 * @author wsuetholz
 */
public class HourlyEmployee extends EmployeeImpl {

    private double hourlyWage;
    private long hoursWorked;

    public HourlyEmployee(String name,
			  String streetAddress,
			  String city,
			  String state,
			  String birthday,
			  String department,
			  String title,
			  String supervisor,
			  double hourlyWage,
			  long hoursWorked) throws IllegalArgumentException {
	super(name, streetAddress, city, state, birthday, department, title, supervisor);
	setHourlyWage(hourlyWage);
	setHoursWorked(hoursWorked);
    }

    public HourlyEmployee(String name,
			  String streetAddress,
			  String city,
			  String state,
			  Calendar birthday,
			  String department,
			  String title,
			  String supervisor,
			  double hourlyWage,
			  long hoursWorked) throws IllegalArgumentException {
	super(name, streetAddress, city, state, birthday, department, title, supervisor);
	setHourlyWage(hourlyWage);
	setHoursWorked(hoursWorked);
    }

    /**
     * @return the hourlyWage
     */
    public double getHourlyWage() {
	return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    public void setHourlyWage(double hourlyWage) {
	if (hourlyWage < 0.0) {
	    throw new IllegalArgumentException("Cannot have employee OWE company!");
	}

	this.hourlyWage = hourlyWage;
    }

    /**
     * @return the hoursWorked
     */
    public long getHoursWorked() {
	return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(long hoursWorked) {
	if (hoursWorked < 0) {
	    throw new IllegalArgumentException("Hours Worked cannot be negative!");
	}

	this.hoursWorked = hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void incrementHoursWorked(long hoursWorkedIncrement) {
	this.hoursWorked += hoursWorkedIncrement;
    }

}
