package xcs.Demoproject1;

import java.util.Date;

public class Customer extends CustID{
		public Customer(String cName, Date date, String cAddr, String cPhone) {
		super();
		this.cName = cName;
		this.cDOB = date;
		this.cAddr = cAddr;
		this.cPhone = cPhone;
	}
	public Customer() {
			super();
	}

	private String cName;
	private Date cDOB;
	private String cAddr;
	private String cPhone;
	
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Date getcDOB() {
		return cDOB;
	}
	public void setcDOB(Date cDOB) {
		this.cDOB = cDOB;
	}
	public String getcAddr() {
		return cAddr;
	}
	public void setcAddr(String cAddr) {
		this.cAddr = cAddr;
	}
	public String getcPhone() {
		return cPhone;
	}
	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}
		public String getacc() {
		return acc;
	}
	
}

class CustID{
	final String acc = "CUST00XC"+Math.round(Math.random()*10000000);
	
}
