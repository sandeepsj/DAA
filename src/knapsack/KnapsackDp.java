package knapsack;

import java.util.Scanner;

public class KnapsackDp {
	public static void main(String args[]) {
		System.out.println("Enter the number of ietms");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		System.out.println("Enter the weights");
		int w[]=new int[n+1];
		int p[]=new int[n+1];
		for(int i=1;i<=n;i++)
			w[i]=in.nextInt();
		System.out.println("Enter the values");
		for(int i=1;i<=n;i++)
			p[i]=in.nextInt();
		System.out.println("Enter the max quantitiy");
		int m=in.nextInt();
		KnapsackDP(p,w,n,m);
	}
	public static void KnapsackDP(int p[],int[] w,int n,int m)
	{
		int V[][]=new int[n+1][m+1];
		for(int i=0;i<=n;i++)
			for(int j=0;j<=m;j++)
			{
				if(i==0 || j==0)
					V[i][j]=0;
				else if(j<w[i]) {
					V[i][j]=V[i-1][j];
				}
				else {
					V[i][j]=max(V[i-1][j],p[i]+V[i-1][j-w[i]]);
				}
			}
		System.out.println("profit:"+V[n][m]);
		int i=n;
		int j=m;
		int x[]=new int[n+1];
		while(i!=0 && j!=0) {
			if(V[i][j]!=V[i-1][j]) {
				x[i]=1;
				j-=w[i];
			}
			i--;
		}
		for(i=1;i<=n;i++)
			System.out.println("x["+i+"]="+x[i]);
	}
	public static int max(int a,int b)
	{
		return a>b?a:b;
	}
}
