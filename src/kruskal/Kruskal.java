package kruskal;
import java.util.Scanner;
public class Kruskal {
	public static void main(String args[]) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int n=in.nextInt();
		int a[][] = new int[n+1][n+1];
		System.out.println("Enter the adjacancy matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				a[i][j]=in.nextInt();

		kruskal(a,n);
	}
	public static void kruskal(int a[][],int n) {
		int min,u=0,v=0,x=0,y=0,parent[]=new int[n+1],count=1,mincost=0;
		while(count<n) {
			min=Integer.MAX_VALUE;
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(a[i][j]<min)
					{
						min=a[i][j];
						u=x=i;
						v=y=j;
					}
			while(parent[u]!=0)
				u=parent[u];
			while(parent[v]!=0)
				v=parent[v];
			if(u!=v) {
				parent[v]=u;
				mincost+=min;
				System.out.println(x+"<---->"+y+":"+a[x][y]);
				count++;
			}
			a[x][y]=a[y][x]=Integer.MAX_VALUE;
		}
		System.out.println("mincost="+mincost);
	}
}
