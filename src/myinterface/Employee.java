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
     * @return the Name
     */
    public abstract String getName();

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
     * @param name the Name to set
     */
    public abstract void setName(String name) throws IllegalArgumentException;

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
    
}
