/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.concrete;

import java.text.ParseException;
import java.util.Calendar;

/**
 *
 * @author wsuetholz
 */
public class SalariedEmployee extends Employee {

    private double annualWage;

    public SalariedEmployee(String name,
			    String streetAddress,
			    String city,
			    String state,
			    String birthday,
			    String department,
			    String title,
			    String supervisor,
			    double annualWage) throws ParseException, IllegalArgumentException {
	super(name, streetAddress, city, state, birthday, department, title, supervisor);
	this.annualWage = validateAnnualWage(annualWage);
    }

    public SalariedEmployee(String name,
			    String streetAddress,
			    String city,
			    String state,
			    Calendar birthday,
			    String department,
			    String title,
			    String supervisor,
			    double annualWage) throws IllegalArgumentException {
	super(name, streetAddress, city, state, birthday, department, title, supervisor);
	this.annualWage = validateAnnualWage(annualWage);
    }

    @Override
    public String toString() {
	return "SalariedEmployee{" + "annualWage=" + annualWage + '}';
    }

    /**
     * @param annualWage the annualWage to validate
     * @return the annualWage
     */
    protected double validateAnnualWage(double annualWage) throws IllegalArgumentException {
	return annualWage;
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
	this.annualWage = validateAnnualWage(annualWage);
    }

}
