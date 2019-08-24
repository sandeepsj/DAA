package dijkstra;

import java.util.Scanner;

public class Dijkstra {
	public static void main(String args[]) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int n=in.nextInt();
		int a[][] = new int[n+1][n+1];
		System.out.println("Enter the adjacancy matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				a[i][j]=in.nextInt();

		dij(a,n,1);
	}
	public static void dij(int a[][],int n,int src) {
		int vis[]=new int[n+1],dij[]=new int[n+1],count=1,v=0,u=0;
		vis[1]=1;
		for(int i=1;i<=n;i++)
			dij[i]=a[src][i];
		for(int k=1;k<n;k++) {
			int min=Integer.MAX_VALUE;
			for(int i=1;i<=n;i++)
				if(dij[i]<min && vis[i]!=1) {
					min=dij[i];
					v=i;
				}
			vis[v]=1;
			for(int i=1;i<=n;i++) {
				int sum=dij[v]+a[v][i];
				if(sum<0)
					sum=Integer.MAX_VALUE;
				if(dij[i]>sum)
					dij[i]=sum;
				
			}

		}
		for(int i=2;i<=n;i++)
			System.out.println(src+"---->"+i+":"+dij[i]);
	}
}
