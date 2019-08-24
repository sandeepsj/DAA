package pgm2;
import java.util.Scanner;
public class StaffDemo {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of stafffs in each category");
		int n=in.nextInt();
		Technical technical[]=new Technical[n];
		Teaching teaching[]=new Teaching[n];
		Contract contract[]=new Contract[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the teaching staff details");
			System.out.println("Enter \n1.staffId\n2.name\n3.salary\n4.phonenumber\n5.domain\n6.publication");
			teaching[i]=new Teaching(in.next(),in.next(),in.nextFloat(),in.next(),in.next(),in.next());
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the technical staff details");
			System.out.println("Enter \n1.staffId\n2.name\n3.salary\n4.phonenumber\n5.skills");
			technical[i]=new Technical(in.next(),in.next(),in.nextFloat(),in.next(),in.next());
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Contract staff details");
			System.out.println("Enter \n1.staffId\n2.name\n3.salary\n4.phonenumber\n5.period");
			contract[i]=new Contract(in.next(),in.next(),in.nextFloat(),in.next(),in.next());
			
		}
		System.out.println("Teaching staffs");
		for(int i=0;i<n;i++)
			System.out.println(teaching[i]);
		System.out.println("Technical staffs");
		for(int i=0;i<n;i++)
			System.out.println(technical[i]);
		System.out.println("contract staffs");
		for(int i=0;i<n;i++)
			System.out.println(contract[i]);
	}
}
