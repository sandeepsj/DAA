package Sort;
import java.util.Scanner;
import java.util.Random;
public class QuickSrot {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		Random r=new Random();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(50);
		int low=0;
		int high=n-1;
		float t1=System.nanoTime();
		qsort(a,low,high);
		float t2=System.nanoTime();
		/*System.out.println("The sorted array is");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");*/
		System.out.println("Time taken="+(float)(t2-t1));
	}
	public static void qsort(int a[],int low,int high) {
		if(low<high) {
			//System.out.println("Asdf");
			int p=partition(a,low,high);
			qsort(a,low,p-1);
			qsort(a,p+1,high);
		}
	}
	public static int partition(int a[],int low,int high) {
		int i=low+1;
		int p=a[low];
		int j=high;
		while(low<high)
		{
			while(a[i]<=p && i<high) {
				i++;
			}
			while(a[j]>=p && j>low ) {
				j--;
			}
			if(i<j)
			{
				//System.out.println(a[i]+" "+a[j]);
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			else
			{
				int temp=a[low];
				a[low]=a[j];
				a[j]=temp;
				break;
			}
		}
		return j;
	}
}
