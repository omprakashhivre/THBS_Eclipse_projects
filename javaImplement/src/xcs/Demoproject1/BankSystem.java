package xcs.Demoproject1;

import java.util.Date;

public class BankSystem {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp = new Employee("ravan Dashanand Ravan","ravan@gmail.com","uiop","xcalius0",1234.00);
//		emp.setEmpName("ravan Dashanand Ravan");
//		emp.setEmpEmail("ravan@gmail.com");
//		emp.setEmpMobile("8888224459");
//		emp.setEmpPwd("password is");
//		emp.setEmpSalary(1.2E6);
//		System.out.println("--------------Employee details----------------------");
//		System.out.printf("Id :%s \nName : %s\nemail :%s\npassword :%s \nmobile :%s\nsalary :%.2f \n\n",emp.empID,
//				emp.getEmpName(),emp.getEmpEmail(),emp.getEmpPwd(),emp.getEmpMobile(),emp.getEmpSalary());
		
		//cust1omer constructor call
//		Customer cust1 = new Customer("RajaMohan Roy",new Date("5/8/1979"),"Mumbai,Maharashtra,India","8888449900");
//		cust1.setcAddr("Mumbai,Maharashtra,India");
//		cust1.setcDOB(new Date("5/8/1979"));
//		cust1.setcName("RajaMohan Roy");
//		cust1.setcPhone("8888449900");
//		System.out.println("--------------cust1omer details----------------------");
//		System.out.printf("Account no. :%s \nname: %s\nDate of Birth :%s\nAddress : %s\nphone no.:%s",cust1.acc,cust1.getcName(),
//				cust1.getcDOB().toLocaleString(),cust1.getcAddr(),cust1.getcPhone());
		
		DetailsChoose dc = new DetailsChoose();
		dc.callMe();
	}

}
