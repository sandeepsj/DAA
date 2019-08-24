package pgm2;

public class Technical extends Staff{
	private String skills;
	public Technical(String staffId,String name,float salary,String PhoneNumber,String skills) {
		super(staffId,name,salary, PhoneNumber);
		this.skills=skills;
	}
	public String toString() {
		return super.toString()+"\t"+skills;
	}

}
