package pgm2;
import java.util.Scanner;
public class CustomerDemo {
	public static void main(String args[])
	{
		String CustomerName;
		String date;
		Scanner in=new Scanner(System.in);
		System.out.println("name");
		CustomerName=in.next();
		System.out.println("Enter date (dd/mm/yy");
		date=in.next();
		Customer c=new Customer(CustomerName,date);
		System.out.println(c);
	}
}
