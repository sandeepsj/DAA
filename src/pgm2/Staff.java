package pgm2;

public class Staff {
	private int a;
	protected String staffId;
	protected String name;
	protected float salary;
	protected String PhoneNumber;
	public Staff(String staffId,String name,float salary,String PhoneNumber)
	{
		a=0;
		this.staffId=staffId;
		this.name=name;
		this.salary=salary;
		this.PhoneNumber=PhoneNumber;
	}
	public String toString() {
		return staffId+"\t"+name+"\t"+salary+"\t"+PhoneNumber;
	}
}
