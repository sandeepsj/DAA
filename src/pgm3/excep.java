package pgm3;
import java.util.Scanner;
public class excep {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter numerator");
		int a=in.nextInt();
		System.out.println("Enter denomenator");
		int b=in.nextInt();
		int ans;
		try {
			ans=a/b;
			System.out.println("answer="+ans);
		}
		catch(Exception ze)
		{
			System.out.println("Exception occured:"+ze.getMessage());
		}
	}
}
