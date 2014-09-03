/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myabstract;

import my.concrete.*;
import java.util.Calendar;

/**
 *
 * @author wsuetholz
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {

    private float commissionPercentage;
    private double periodGrossSalesAmount;
    private double periodTargetSalesAmount;

    public SalaryPlusCommissionEmployee(String name,
					String streetAddress,
					String city,
					String state,
					String birthday,
					String department,
					String title,
					String supervisor,
					double annualWage,
					long payPeriods,
					long vacationDays,
					float commissionPercentage,
					double periodGrossSalesAmount,
					double periodTargetSalesAmount) throws IllegalArgumentException {
	super(name, streetAddress, city, state, birthday, department, title, supervisor, annualWage, payPeriods, vacationDays);
	setCommissionPercentage(commissionPercentage);
	setPeriodGrossSalesAmount(periodGrossSalesAmount);
	setPeriodTargetSalesAmount(periodTargetSalesAmount);
    }

    public SalaryPlusCommissionEmployee(String name,
					String streetAddress,
					String city,
					String state,
					Calendar birthday,
					String department,
					String title,
					String supervisor,
					double annualWage,
					long payPeriods,
					long vacationDays,
					float commissionPercentage,
					double periodGrossSalesAmount,
					double periodTargetSalesAmount) throws IllegalArgumentException {
	super(name, streetAddress, city, state, birthday, department, title, supervisor, annualWage, payPeriods, vacationDays);
	setCommissionPercentage(commissionPercentage);
	setPeriodGrossSalesAmount(periodGrossSalesAmount);
	setPeriodTargetSalesAmount(periodTargetSalesAmount);
    }

    /**
     * @return the commissionPercentage
     */
    public float getCommissionPercentage() {
	return commissionPercentage;
    }

    /**
     * @param commissionPercentage the commissionPercentage to set
     */
    public void setCommissionPercentage(float commissionPercentage) {
	if (commissionPercentage < 0.0f) {
	    throw new IllegalArgumentException("Cannot have negative commission percentage!");
	}

	if (commissionPercentage > 100.0f) {
	    throw new IllegalArgumentException("Cannot have more then 100% commission percentage!");
	}
	
	this.commissionPercentage = commissionPercentage;
    }

    public double calculateCommission () {
	return (periodGrossSalesAmount * commissionPercentage);
    }
    
    /**
     * @return the periodGrossSalesAmount
     */
    public double getPeriodGrossSalesAmount() {
	return periodGrossSalesAmount;
    }

    /**
     * @param periodGrossSalesAmount the periodGrossSalesAmount to set
     */
    public void setPeriodGrossSalesAmount(double periodGrossSalesAmount) {
	if (periodGrossSalesAmount < 0.0f) {
	    throw new IllegalArgumentException("Cannot have negative gross sales amount!");
	}

	this.periodGrossSalesAmount = periodGrossSalesAmount;
    }
    
    public void incrementPeriodGrossSalesAmount(double periodGrossSalesAmountIncrement) {
	this.periodGrossSalesAmount += periodGrossSalesAmountIncrement;	
    }

    /**
     * @return the periodTargetSalesAmount
     */
    public double getPeriodTargetSalesAmount() {
	return periodTargetSalesAmount;
    }

    /**
     * @param periodTargetSalesAmount the periodTargetSalesAmount to set
     */
    public void setPeriodTargetSalesAmount(double periodTargetSalesAmount) {
	if (periodTargetSalesAmount < 0.0f) {
	    throw new IllegalArgumentException("Cannot have negative target sales amount!");
	}

	this.periodTargetSalesAmount = periodTargetSalesAmount;
    }

}
