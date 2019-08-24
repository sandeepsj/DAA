package prims;
import java.util.Scanner;
public class Prims {
	public static void main(String args[]) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int n=in.nextInt();
		int a[][] = new int[n+1][n+1];
		System.out.println("Enter the adjacancy matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				a[i][j]=in.nextInt();

		prims(a,n);
	}
	public static void prims(int a[][],int n) {
		int vis[]=new int[n+1];
		int min,count=1,mincost=0;
		int u=0,v=0;
		vis[1]=1;
		while(count<n) {
			min=Integer.MAX_VALUE;
			for (int i=1;i<=n;i++)
			{	if(vis[i]==1)
				for(int j=1;j<=n;j++)
					if((a[i][j]<min) && (vis[j]!=1))
					{
						min=a[i][j];
						u=i;
						v=j;
					}
			}
			System.out.println(u+"<---->"+v+":"+a[u][v]);
			mincost+=min;
			vis[v]=1;
			/*for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(vis[i]==1 && vis[j]==1)
						a[i][j]=a[i][j]=Integer.MAX_VALUE;*/
			count++;
		}
		System.out.println("Mincost="+mincost);
	}

}
