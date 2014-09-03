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
    long getAge();

    /**
     * @return the birthday
     */
    Calendar getBirthday();

    /**
     * @return the city
     */
    String getCity();

    /**
     * @return the department
     */
    String getDepartment();

    /**
     * @return the hireDate
     */
    Calendar getHireDate();

    /**
     * @return the Name
     */
    String getName();

    /**
     * @return the state
     */
    String getState();

    /**
     * @return the streetAddress
     */
    String getStreetAddress();

    /**
     * @return the supervisor
     */
    String getSupervisor();

    /**
     * @return the title
     */
    String getTitle();

    /**
     * @param birthday the birthday to set
     */
    void setBirthday(Calendar birthday) throws IllegalArgumentException;

    /**
     * @param birthday the birthday to set in MM/DD/YYYY format
     */
    void setBirthday(String birthday) throws IllegalArgumentException;

    /**
     * @param city the city to set
     */
    void setCity(String city) throws IllegalArgumentException;

    /**
     * @param department the department to set
     */
    void setDepartment(String department) throws IllegalArgumentException;

    /**
     * @param hireDate the hireDate to set
     */
    void setHireDate(Calendar hireDate) throws IllegalArgumentException;

    /**
     * @param hireDate the hireDate to set in MM/DD/YYYY format
     */
    void setHireDate(String hireDate) throws IllegalArgumentException;

    /**
     * @param name the Name to set
     */
    void setName(String name) throws IllegalArgumentException;

    /**
     * @param state the state to set
     */
    void setState(String state) throws IllegalArgumentException;

    /**
     * @param streetAddress the streetAddress to set
     */
    void setStreetAddress(String streetAddress) throws IllegalArgumentException;

    /**
     * @param supervisor the supervisor to set
     */
    void setSupervisor(String supervisor) throws IllegalArgumentException;

    /**
     * @param title the title to set
     */
    void setTitle(String title) throws IllegalArgumentException;
    
}
