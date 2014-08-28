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

    public void SalariedEmployee(String name,
				 String streetAddress,
				 String city,
				 String state,
				 String birthday,
				 String department,
				 String title,
				 String supervisor,
				 double annualWage) throws ParseException, IllegalArgumentException {
	super(name, streetAddress, city, state, birthday, department, title, supervisor);
	setAnnualWage(annualWage);
    

    :
    }

    public void Employee(String name,
			 String streetAddress,
			 String city,
			 String state,
			 Calendar birthday,
			 String department,
			 String title,
			 String supervisor,
			 double annualWage) throws IllegalArgumentException {
	super(name, streetAddress, city, state, birthday, department, title, supervisor);
	setAnnualWage(annualWage);
    }

    @Override
    public String toString() {
	return "SalariedEmployee{" + "annualWage=" + annualWage + '}';
    }

    public double getAnnualWage() {
	return annualWage;
    }

    public void setAnnualWage(double annualWage) throws IllegalArgumentException {
	if (age <= 16 || age > 75) {
	    throw new IllegalArgumentException("Age is not within allowable limits!");
	}
	this.annualWage = annualWage;
    }

}
