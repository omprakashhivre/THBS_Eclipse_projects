package XCs_Train;

public class TrainTicket {
	private int counter;
	private String pnr;
	private String traveldate;
	private int passid,tno;
	
	
	
	public int getCounter() {
		return counter;
	}



	public void setCounter(int counter) {
		this.counter = counter;
	}



	public String getPnr() {
		return pnr;
	}



	public void setPnr(String pnr) {
		this.pnr = pnr;
	}



	public String getTraveldate() {
		return traveldate;
	}



	public void setTraveldate(String traveldate) {
		this.traveldate = traveldate;
	}



	public int getPassid() {
		return passid;
	}



	public void setPassid(int passid) {
		this.passid = passid;
	}



	public int getTno() {
		return tno;
	}



	public void setTno(int tno) {
		this.tno = tno;
	}



	void display() {
		System.out.println("counter : "+counter+"\npnr : "+pnr+"\ntrain number : "+tno+"\npassenger id : "+passid+"\ntravel date : "+traveldate);
	}
	
}
