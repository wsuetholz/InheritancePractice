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
public interface HourlyEmployee extends Employee {

    /**
     * @return the hourlyWage
     */
    double getHourlyWage();

    /**
     * @return the hoursWorked
     */
    long getHoursWorked();

    /**
     * @param hoursWorked the hoursWorked to set
     */
    void incrementHoursWorked(long hoursWorkedIncrement);

    /**
     * @param hourlyWage the hourlyWage to set
     */
    void setHourlyWage(double hourlyWage);

    /**
     * @param hoursWorked the hoursWorked to set
     */
    void setHoursWorked(long hoursWorked);
    
}
