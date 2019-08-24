package dijkstra;

import java.lang.Math;
import java.util.Scanner;

public class Diiiiijkstra {
	public static String pathStr;
	public static int temp;
	public static void main(String args[]) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter A B C");
		int A=in.nextInt();
		int B=in.nextInt();
		int C[][]=new int[A][B];
		for(int i=0;i<A;i++)
			for (int j=0;j<B;j++)
				C[i][j]=in.nextInt();
		System.out.println(solve(A,B,C));
	}
	public static int solve(int A, int B, int[][] C) {
		int [][]a=new int[A*B][A*B];
		int Max[]=new int[A*B+1];
		for(int i=0;i<A;i++)
			for(int j=0;j<B;j++){
				int pos=i*(B)+j;
				try{
					a[pos][pos-1]=Math.abs(C[i][j]-C[i][j-1]);
				}
				catch(Exception e){}
				try{
					a[pos][pos+1]=Math.abs(C[i][j]-C[i][j+1]);
				}
				catch(Exception e){}
				try{
					a[pos][pos+B]=Math.abs(C[i][j]-C[i+1][j]);
				}
				catch(Exception e){}
				try{
					a[pos][pos-B]=Math.abs(C[i][j]-C[i-1][j]);
				}
				catch(Exception e){}
			}
		for(int i=0;i<A*B;i++) {
			for(int j=0;j<A*B;j++) {
				if((i-j!=1 && j-i!=1 && j-i!=B && i-j!=B) && (a[i][j]==0 && C[i/B][i%B]!=C[j/B][j%B])){
					a[i][j]=Integer.MAX_VALUE;
				}
				else if(a[i][j]==0)
					a[i][j]=Integer.MAX_VALUE;
				System.out.print(a[i][j]+"\t");
			}	
			System.out.println();
		}
		System.out.println("------------------------------------------------------------------");
		for (int i=0;i<A*B;i++) {
			Max[i]=dij(a,i,A*B);
			System.out.print(Max[i]+"\t");
			//System.out.println(Max[i]);
		}
		return max(Max);
	}
	public static int max(int a[]){
		int Max=0;
		for(int i:a)
			if(i>Max && i!=Integer.MAX_VALUE)
				Max=i;
		return Max;
	}
	public static int dij(int a[][],int src,int n){
		int vis[]=new int[n+1],dijk[]=new int[n+1],v=0;
		vis[1]=1;
		int path[]=new int[n],max[]=new int[n];
		path[0]=src;
		for(int i=1;i<=n;i++)
			dijk[i]=a[src][i-1];
		for(int k=1;k<n;k++) {
			int min=Integer.MAX_VALUE;
			for(int i=1;i<=n;i++)
				if(dijk[i]<min && vis[i]!=1) {
					min=dijk[i];
					v=i;
				}
			vis[v]=1;
			for(int i=1;i<=n;i++) {
				int sum=dijk[v]+a[v-1][i-1];
				if(sum<0)
					sum=Integer.MAX_VALUE;
				if(dijk[i]>sum) {
					path[i-1]=v-1;
					dijk[i]=sum;
				}
			}
		}
		String[] pather=new String[n];
		for (int i=0;i<n;i++) {
			if(i!=src) {
				pathStr=Integer.toString(i)+"-";
				pather[i]=pathFinder(path,i,a,src);
				//max[src]
				System.out.print(pather[i]+"\t");
			}
		}
		System.out.println("\n"+max[src]);

		return 1;
	}
	public static String pathFinder(int[] path,int d,int[][] a,int src) {
		if(path[d]!=src) {
			pathStr+=Integer.toString(path[d])+"-";
			pathFinder(path,path[d],a,src);
		}
		return pathStr+Integer.toString(src);
	}
}
