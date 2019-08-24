package student;
import java.util.Scanner;
public class StudentDemo {
	public static void main(String [] args) {
		int i;
		String usn;
		String name;
		String branch;
		String PhoneNumber;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number of Student");
		int n=in.nextInt();
		Student[] student=new Student[n];
		System.out.println("Enter student details");
		for( i=0;i<n;i++)
		{
			System.out.println("Enter Student"+(i+1)+"Detail");
			System.out.println("Enter Student USN");
			usn=in.next();
			System.out.println("Enter the Name");
			name=in.next();
			System.out.println("Enter student Branch");
			branch=in.next();
			System.out.println("Enter Student Phone Number");
			PhoneNumber=in.next();
			student[i]=new Student(usn,name,branch,PhoneNumber);
		}
		for(i=0;i<n;i++)
		{
			System.out.println(student[i]);
		}



	}
}
