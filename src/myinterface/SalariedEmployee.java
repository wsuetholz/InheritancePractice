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
public class SalariedEmployee extends Employee {

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
	super(name, streetAddress, city, state, birthday, department, title, supervisor);
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
	super(name, streetAddress, city, state, birthday, department, title, supervisor);
	setAnnualWage(annualWage);
	setPayPeriods(payPeriods);
	setVacationDays(vacationDays);
    }

    @Override
    public String toString() {
	return "SalariedEmployee{" + "annualWage=" + annualWage + ", payPeriods=" + payPeriods + ", vacationDays=" + vacationDays + '}';
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
