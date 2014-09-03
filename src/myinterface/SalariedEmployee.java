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
    double getAnnualWage();

    /**
     * @return the payPeriods
     */
    long getPayPeriods();

    /**
     * @return the vacationDays
     */
    long getVacationDays();

    /**
     * @param annualWage the annualWage to set
     */
    void setAnnualWage(double annualWage) throws IllegalArgumentException;

    /**
     * @param payPeriods the payPeriods to set
     */
    void setPayPeriods(long payPeriods);

    /**
     * @param vacationDays the vacationDays to set
     */
    void setVacationDays(long vacationDays);
    
}
