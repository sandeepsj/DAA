package tsp;
import java.util.Scanner;
public class Tsp {
	public static void main(String args[]) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int n=in.nextInt();
		int a[][] = new int[n+1][n+1];
		System.out.println("Enter the adjacancy matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				a[i][j]=in.nextInt();
		int tour[]=new int[n+1];
		for(int i=1;i<=n;i++)
			tour[i]=i;
		int min=tsp(a,n,1,tour);
		System.out.println("mincost="+min);
		for(int i=1;i<=n;i++)
			System.out.print(tour[i]+"--->");
		System.out.println(1);
	}
	public static int tsp(int a[][],int n,int start,int tour[]) {
		int mincost=Integer.MAX_VALUE;
		int mintour[]=new int[n+1];
		int temp[]=new int[n+1];
		int ccost=0;
		if(start==n-1)
			return a[tour[start]][tour[n]]+a[tour[n]][tour[1]];
		for(int i=start+1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				temp[j]=tour[j];
			temp[start+1]=tour[i];
			temp[i]=tour[start+1];
			ccost=tsp(a,n,start+1,temp);
			if(ccost+a[tour[start]][tour[i]]<mincost) {
				mincost=ccost+a[tour[start]][tour[i]];
				for(int k=1;k<=n;k++)
					mintour[k]=temp[k];
			}
		}
		for(int i=1;i<=n;i++)
			tour[i]=mintour[i];
		return mincost;
	}
}
