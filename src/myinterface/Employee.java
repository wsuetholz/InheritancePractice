/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

import java.util.Calendar;

/**
 *
 * @author wsuetholz
 */
public interface Employee {

    /**
     * @return the employee ID
     */
    public abstract long getEmpId();

    /**
     * @return the age calculated from birth date to today.
     */
    public abstract long getAge();

    /**
     * @return the birthday
     */
    public abstract Calendar getBirthday();

    /**
     * @return the city
     */
    public abstract String getCity();

    /**
     * @return the department
     */
    public abstract String getDepartment();

    /**
     * @return the hireDate
     */
    public abstract Calendar getHireDate();

    /**
     * @return the Name as First M. Last
     */
    public abstract String getName();

    /**
     * @return the First Name
     */
    public abstract String getFirstName();

    /**
     * @return the Middle Initial
     */
    public abstract String getMiddleInitial();

    /**
     * @return the Last Name
     */
    public abstract String getLastName();

    /**
     * @return the state
     */
    public abstract String getState();

    /**
     * @return the streetAddress
     */
    public abstract String getStreetAddress();

    /**
     * @return the supervisor
     */
    public abstract String getSupervisor();

    /**
     * @return the title
     */
    public abstract String getTitle();

    /**
     * @param birthday the birthday to set
     */
    public abstract void setBirthday(Calendar birthday) throws IllegalArgumentException;

    /**
     * @param birthday the birthday to set in MM/DD/YYYY format
     */
    public abstract void setBirthday(String birthday) throws IllegalArgumentException;

    /**
     * @param city the city to set
     */
    public abstract void setCity(String city) throws IllegalArgumentException;

    /**
     * @param department the department to set
     */
    public abstract void setDepartment(String department) throws IllegalArgumentException;

    /**
     * @param hireDate the hireDate to set
     */
    public abstract void setHireDate(Calendar hireDate) throws IllegalArgumentException;

    /**
     * @param hireDate the hireDate to set in MM/DD/YYYY format
     */
    public abstract void setHireDate(String hireDate) throws IllegalArgumentException;

    /**
     * @param firstName the First Name to set
     */
    public abstract void setFirstName(String firstName) throws IllegalArgumentException;

    /**
     * @param middleInitial the Middle Initial to set
     */
    public abstract void setMiddleInitial(String middleInitial) throws IllegalArgumentException;

    /**
     * @param lastName the Last Name to set
     */
    public abstract void setLastName(String lastName) throws IllegalArgumentException;

    /**
     * @param state the state to set
     */
    public abstract void setState(String state) throws IllegalArgumentException;

    /**
     * @param streetAddress the streetAddress to set
     */
    public abstract void setStreetAddress(String streetAddress) throws IllegalArgumentException;

    /**
     * @param supervisor the supervisor to set
     */
    public abstract void setSupervisor(String supervisor) throws IllegalArgumentException;

    /**
     * @param title the title to set
     */
    public abstract void setTitle(String title) throws IllegalArgumentException;
    
    /**
     * @param empId the new employee ID to set
     */
    public abstract void setEmpId(long empId) throws IllegalArgumentException;

}
