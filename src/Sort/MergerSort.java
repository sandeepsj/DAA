package Sort;
import java.util.Random;
import java.util.Scanner;
public class MergerSort {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		Random r=new Random();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=r.nextInt(5);
		int low=0;
		int high=n-1;
		float t1=System.nanoTime();
		msort(a,low,high);
		float t2=System.nanoTime();
		System.out.println("The sorted array is");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println("Time taken="+(float)(t2-t1));
	}
	public static void msort(int a[],int low,int high)
	{
		if(low<high) {
			int mid=(low+high)/2;
			msort(a,low,mid);
			msort(a,mid+1,high);
			merge(a,low,high,mid);
		}
	}
	public static void merge(int a[],int low,int high,int mid)
	{
		int i=low;
		int k=low;
		int j=mid+1;
		int resarray[]=new int[high+1];

		while(i<=mid && j<=high) {
			if(a[i]<a[j]) {
				resarray[k]=a[i];
				i++;k++;
			}
			else {
				resarray[k]=a[j];
				j++;k++;

			}
		}
		while(i<=mid) {
			resarray[k]=a[i];
			i++;k++;
		}
		while(j<=high) {
			resarray[k]=a[j];
			j++;k++;
		}
		for(k=low;k<=high;k++)
			a[k]=resarray[k];
	}
}
