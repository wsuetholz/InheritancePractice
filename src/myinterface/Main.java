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
public class Main {

    public static void main(String[] args) {
	HourlyEmployee hourlyEmployee = new HourlyEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 15.0, 10);
	SalariedEmployee salariedEmployee = new SalariedEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14);
	SalaryPlusCommissionEmployee salaryPlusCommissionEmployee = new SalaryPlusCommissionEmployee("Joe C Doe", "123 45th Street", "Normal", "IL", "01/01/1969", "IT", "Peon", "Hi There", 10000.00, 24, 14, 15.0f, 1500.00, 25000.00);

	Main.printlnEmployee ( hourlyEmployee, "Employee");  // Note, any of the constructed classes could be here!
	Main.printlnSalariedEmployee ( salariedEmployee, "SalariedEmployee");
	Main.printlnSalaryPlusCommissionEmployee ( salaryPlusCommissionEmployee, "SalaryPlusCommissionEmployee");
	Main.printlnHourlyEmployee ( hourlyEmployee, "HourlyEmployee");
    }

    private static void printEmployee(Employee employee, String leadin) {
	System.out.println(leadin + " {Name=" + employee.getName() + ", StreetAddress=" + employee.getStreetAddress()
			   + ", City=" + employee.getCity() + ", State=" + employee.getState());
	System.out.print(leadin + "  Department=" + employee.getDepartment() + ", Title=" + employee.getTitle()
			 + ", Supervisor=" + employee.getSupervisor() + ", Age=" + employee.getAge());
    }

    private static void printlnEmployee(Employee employee, String leadin) {
	printEmployee(employee, leadin);
	System.out.println("}");
    }

    private static void printSalariedEmployee(SalariedEmployee employee, String leadin) {
	printEmployee(employee, leadin);
	System.out.println(",");
	System.out.print(leadin + "  AnnualWage=" + Double.toString(employee.getAnnualWage()) + ", PayPeriods=" + Long.toString(employee.getPayPeriods())
			 + ", VacationDays=" + Long.toString(employee.getVacationDays()));
    }

    private static void printlnSalariedEmployee(SalariedEmployee employee, String leadin) {
	printSalariedEmployee(employee, leadin);
	System.out.println("}");
    }

    private static void printSalaryPlusCommissionEmployee(SalaryPlusCommissionEmployee employee, String leadin) {
	printSalariedEmployee(employee, leadin);
	System.out.println(",");
	System.out.println(leadin + "  CommissionPercentage=" + Float.toString(employee.getCommissionPercentage()) + ", PeriodGrossAmount=" + Double.toString(employee.getPeriodGrossSalesAmount()) + ",");
	System.out.print(leadin + "  PeriodTargetAmount=" + Double.toString(employee.getPeriodTargetSalesAmount()) + ", CommissionAmount=" + Double.toString(employee.calculateCommission()));
    }

    private static void printlnSalaryPlusCommissionEmployee(SalaryPlusCommissionEmployee employee, String leadin) {
	printSalaryPlusCommissionEmployee(employee, leadin);
	System.out.println("}");
    }

    private static void printHourlyEmployee(HourlyEmployee employee, String leadin) {
	printEmployee(employee, leadin);
	System.out.println(",");
	System.out.print(leadin + "  HourlyWage=" + Double.toString(employee.getHourlyWage()) + ", HoursWorked=" + Long.toString(employee.getHoursWorked()));
    }

    private static void printlnHourlyEmployee(HourlyEmployee employee, String leadin) {
	printHourlyEmployee(employee, leadin);
	System.out.println("}");
    }

}
