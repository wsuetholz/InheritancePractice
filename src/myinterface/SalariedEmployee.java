/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author wsuetholz
 */
public interface SalariedEmployee extends Employee {

    /**
     * @return the annualWage
     */
    public abstract double getAnnualWage();

    /**
     * @return the payPeriods
     */
    public abstract long getPayPeriods();

    /**
     * @return the vacationDays
     */
    public abstract long getVacationDays();

    /**
     * @param annualWage the annualWage to set
     */
    public abstract void setAnnualWage(double annualWage) throws IllegalArgumentException;

    /**
     * @param payPeriods the payPeriods to set
     */
    public abstract void setPayPeriods(long payPeriods);

    /**
     * @param vacationDays the vacationDays to set
     */
    public abstract void setVacationDays(long vacationDays);
    
}
