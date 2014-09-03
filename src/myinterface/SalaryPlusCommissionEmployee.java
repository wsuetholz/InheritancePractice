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

    double calculateCommission();

    /**
     * @return the commissionPercentage
     */
    float getCommissionPercentage();

    /**
     * @return the periodGrossSalesAmount
     */
    double getPeriodGrossSalesAmount();

    /**
     * @return the periodTargetSalesAmount
     */
    double getPeriodTargetSalesAmount();

    void incrementPeriodGrossSalesAmount(double periodGrossSalesAmountIncrement);

    /**
     * @param commissionPercentage the commissionPercentage to set
     */
    void setCommissionPercentage(float commissionPercentage);

    /**
     * @param periodGrossSalesAmount the periodGrossSalesAmount to set
     */
    void setPeriodGrossSalesAmount(double periodGrossSalesAmount);

    /**
     * @param periodTargetSalesAmount the periodTargetSalesAmount to set
     */
    void setPeriodTargetSalesAmount(double periodTargetSalesAmount);
    
}
