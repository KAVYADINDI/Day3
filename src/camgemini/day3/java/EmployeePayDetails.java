package camgemini.day3.java;

public class EmployeePayDetails {
 private String employeeId;//private no required
 private String employeeName;
 private double hra;
 private double pf;
 private static int pt=200;
 private double basicSalary;
 private double grossSalary;
 private double netSalary;
 private double medical;
 
 public EmployeePayDetails()
 {
	 
 }
 
 public EmployeePayDetails(String employeeId,String employeeName,double basicSalary,double medical)
 {
	 this.employeeId=employeeId;
	 this.employeeName=employeeName;
	 this.basicSalary=basicSalary;
	 this.medical=medical;
 }
 public double netSalary()
 {
	 hra=basicSalary/2;
	 pf=12*basicSalary/100;
	 grossSalary=hra+basicSalary+medical;
	 netSalary=grossSalary-(pf+pt);
	 return netSalary;
 }
 public void displayEmployeePayDetails()
 {
	 System.out.println(" Employee ID: "+ employeeId);
	 System.out.println("Employee Name: "+ employeeName);
	 System.out.println("Net Salary is: "+netSalary);
 }
}
