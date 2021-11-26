package xcs.Demoproject1;

import java.util.Date;

public class Employee extends EmpID{
	
	public Employee(String empName, String empEmail, String empPwd, String empMobile, double empSalary) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPwd = "iopo"+empPwd+"okml";
		this.empMobile = empMobile;
		this.empSalary = empSalary;
	}
	
	public Employee() {
		super();
	}

	
	String empName;
	private final Date empDOB =  new Date();
	String empEmail;
	private String empPwd;
	private String empMobile;
	private double empSalary;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpPwd() {	
		System.out.println("Encrypted password like : "+empPwd);
		return empPwd.substring(4, empPwd.length()-4);
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = "iopo"+empPwd+"okml";
	}
	public String getEmpMobile() {
		return empMobile;
	}
	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public String getEmpID() {
		return empID;
	}
	public Date getEmpDOB() {
		return empDOB;
	}
}

class EmpID{
	protected final String empID = "EMP00XC"+Math.round(Math.random()*10000000);

}