package pgm2;
import java.util.StringTokenizer;
public class Customer {
	private String CustomerName;
	private String date;
	public Customer(String CustomerName,String date)
	{
		this.CustomerName=CustomerName;
		this.date=date;
	}
	public String toString()
	{
		String returnValue=CustomerName;
		StringTokenizer st=new StringTokenizer(date,"/");
		System.out.println("The customer details are");
		while(st.hasMoreTokens()) {
			returnValue+=","+st.nextToken();
		}
		return returnValue;
	}
}
