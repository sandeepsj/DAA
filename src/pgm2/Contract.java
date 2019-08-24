package pgm2;

public class Contract extends Staff{
	private String period;
	public Contract(String staffId,String name,float salary,String PhoneNumber,String period) {
		super(staffId,name,salary, PhoneNumber);
		this.period=period;
	}
	public String toString() {
		return super.toString()+"\t"+period;
	}

}