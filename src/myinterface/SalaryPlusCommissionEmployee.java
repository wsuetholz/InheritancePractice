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
public interface SalaryPlusCommissionEmployee extends SalariedEmployee {

    public abstract double calculateCommission();

    /**
     * @return the commissionPercentage
     */
    public abstract float getCommissionPercentage();

    /**
     * @return the periodGrossSalesAmount
     */
    public abstract double getPeriodGrossSalesAmount();

    /**
     * @return the periodTargetSalesAmount
     */
    public abstract double getPeriodTargetSalesAmount();

    public abstract void incrementPeriodGrossSalesAmount(double periodGrossSalesAmountIncrement);

    /**
     * @param commissionPercentage the commissionPercentage to set
     */
    public abstract void setCommissionPercentage(float commissionPercentage);

    /**
     * @param periodGrossSalesAmount the periodGrossSalesAmount to set
     */
    public abstract void setPeriodGrossSalesAmount(double periodGrossSalesAmount);

    /**
     * @param periodTargetSalesAmount the periodTargetSalesAmount to set
     */
    public abstract void setPeriodTargetSalesAmount(double periodTargetSalesAmount);
    
}
