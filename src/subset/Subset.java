package subset;
import java.util.Scanner;
public class Subset{
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("etner the numbe of numbers");
		int n=in.nextInt();
		System.out.println("Enter the set");
		int s[]=new int[n];
		for(int i=0;i<n;i++)
			s[i]=in.nextInt();
		System.out.println("Enter the sum:");
		int d=in.nextInt();
		solve(s,n,d);
	}

	public static void solve(int s[],int n,int d)
	{
		int[] sel=new int[n+1];
		int k=0,sum=0,found=0;
		sel[0]=1;
		while(true) {
			if(k<n && sel[k]==1) {
				if(sum+s[k]==d)
				{
					found=1;
					System.out.print("{");
					for(int i=0;i<n;i++)
						if(sel[i]==1)
							System.out.print(s[i]+"  ");
					System.out.println("}");
					sel[k]=0;
				}
				else if(sum+s[k]<d)
					sum+=s[k];
				else
					sel[k]=0;
			}
			else
			{
				k--;
				while(k>=0 && sel[k]==0)
					k--;
				if(k<0)
					break;
				sel[k]=0;
				sum-=s[k];
			}
			k++;
			sel[k]=1;
		}
		if(found==0)
			System.out.println("Not found a subset");
	}
}