package hamiltonean;
import java.util.Scanner;
public class Hamiltonean{
	int a[][];
	int x[];
	int n;
	public Hamiltonean() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		n=in.nextInt();
		System.out.println("Enter the adjacancy matrix");
		a=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=in.nextInt();
		x=new int[n];
		for(int i=1;i<n;i++)
			x[i]=-1;
		ham(1);
	}
	public static void main(String args[]) {
		new Hamiltonean();
	}
	public void ham(int k) {
		while(true)
		{
			nextVal(k);
			if(x[k]==-1)
				return;
			if(k==n-1)
			{
				for(int i=0;i<n;i++)
					System.out.print((x[i]+1)+"  ");
				System.out.println(1);
			}
			else
				ham(k+1);
		}
	}
	public void nextVal(int k)
	{
		while(true) {
			int i=0;
			x[k]=(x[k]+1)%(n+1);
			if(x[k]==n)
			{
				x[k]=-1;
				return;
			}
			if (a[x[k-1]][x[k]]==1)
			{
				for(i=0;i<k;i++)
					if(x[i]==x[k])
						break;
				if(i==k)
					if(k<n-1 || k==n-1 && a[x[k]][x[0]]==1)
						return;
			}
			
		}
	}
}