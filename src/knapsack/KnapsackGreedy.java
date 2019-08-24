package knapsack;
import java.util.Scanner;
public class KnapsackGreedy {
	public static void main(String args[]) {
		System.out.println("Enter the number of ietms");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("Enter the weights");
		int a[][]=new int[2][n];
		for(int i=0;i<n;i++)
			a[0][i]=in.nextInt();
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
			a[1][i]=in.nextInt();
		System.out.println("Enter the max quantitiy");
		int m=in.nextInt();
		int profit=0;
		while(m>0)
		{
			float max=0;
			int u=0;
			for(int i=0;i<n;i++)
				if(((float)a[1][i]/(float)a[0][i])>max)
				{	
					max=((float)a[1][i]/(float)a[0][i]);
					u=i;
				}
				
			if(m<a[0][u]) {
				System.out.println("added quantity:"+m);
				profit+=m*max;
				m=-1;
			}
			else {
				profit+=a[1][u];
				System.out.println("added quantity:"+a[0][u]);
				m-=a[0][u];
				a[1][u]=0;
			}
		}
		System.out.println("Total profit:"+profit);
	}
}
