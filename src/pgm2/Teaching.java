package pgm2;

public class Teaching extends Staff{
	private String domain;
	private String Publication;
	public Teaching(String staffId,String name,float salary,String PhoneNumber,String domain,String Publication) {
		super(staffId,name,salary, PhoneNumber);
		this.domain=domain;
		this.Publication=Publication;
	}
	public String toString() {
		return super.toString()+"\t"+domain+"\t"+Publication;
	}
}
