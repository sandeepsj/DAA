package floyd;

import java.util.Scanner;
public class Floyd {
	public static void main(String args[]) {
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int n=in.nextInt();
		int a[][] = new int[n+1][n+1];
		System.out.println("Enter the adjacancy matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				a[i][j]=in.nextInt();

		floyd(a,n);
	}
	public static void floyd(int a[][],int n) {
		for(int k=1;k<=n;k++)
			for(int i=1;i<=n;i++)
				for(int j=1;j<=n;j++)
					if(a[i][j]>a[i][k]+a[k][j])
						a[i][j]=a[i][k]+a[k][j];
		System.out.println("The output is");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}
}
