package xcs.Demoproject1;

import java.util.Date;

public class DetailsChoose {
	
	@SuppressWarnings("deprecation")
	public static void callMe() {
		
	
	String []names = {"Arunkumar Rana","Narendra Modi","Supraja m.","Radhemohan roy","Salman khan"};
	String []emails = {"Arunkumar_Rana@gmail.com","narendraModi@gov.in","Supraja@thbs.com","radhe@yahoo.com","salman@rediffmail.com"};
	String []pass = {"xxxx","xxxx","xxxx","xxxx","xxxx"};
	String []mobile = {"8888888822","8888888833","8888888844","8888888855","8888888866"};
	double []sal = {1.2E4,1200000,320000,6.7E5,17_23_000.00};
	
	@SuppressWarnings("deprecation")
	Date []cDOB = {new Date("14/2/1997"),new Date("14/2/1997"),new Date("14/2/1997"),new Date("14/2/1997"),new Date("14/2/1997")};
	String []addr = {"Mumbai maharashtra","Hydrabad,AP","Aurangabad,MH","benglore,KA","UP"};
	
	int index = (int) Math.floor(Math.random()*5);
	
	
	Employee em = new Employee();
	em.setEmpName(names[index]);
	em.setEmpEmail(emails[index]);
	em.setEmpMobile(mobile[index]);
	em.setEmpPwd(pass[index]);
	em.setEmpSalary(sal[index]);
	System.out.println("--------------Employee details----------------------");
	System.out.printf("Id :%s \nName : %s\nemail :%s\npassword :%s \nmobile :%s\nsalary :%.2f \n\n",em.empID,
			em.getEmpName(),em.getEmpEmail(),em.getEmpPwd(),em.getEmpMobile(),em.getEmpSalary());
	
	index = (int) Math.floor(Math.random()*5);
	Customer cust = new Customer();
	cust.setcAddr(addr[index]);
	cust.setcDOB(cDOB[index]);
	cust.setcName(names[index]);
	cust.setcPhone(mobile[index]);
	System.out.println("--------------Customer details----------------------");
	System.out.printf("Account no. :%s \nname: %s\nDate of Birth :%s\nAddress : %s\nphone no.:%s",cust.acc,cust.getcName(),
			cust.getcDOB().toLocaleString(),cust.getcAddr(),cust.getcPhone());
	
	}
	
}
