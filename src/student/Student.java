package student;

public class Student {
	private String USN;
	private String name;
	private String branch;
	private String PhoneNumber;
	public Student(String USN,String name,String branch,String PhoneNumber) {
		this.USN=USN;
		this.name=name;
		this.branch=branch;
		this.PhoneNumber=PhoneNumber;
	}
	public String toString()
	{
		return USN+"\t"+name+"\t"+branch+"\t"+PhoneNumber;
	}
}
