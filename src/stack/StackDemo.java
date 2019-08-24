package stack;
import java.util.Scanner;
public class StackDemo {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int n=in.nextInt();
		Stack s=new Stack(n);
		int item;
		while(true)
		{
			System.out.println("\n1.push\n2.pop\n3.show\n4.exit");
			item=in.nextInt();
			switch (item)
			{
			case 1:System.out.println("Enter the item to push");
			int i=in.nextInt();s.push(i);break;
			case 2:i=s.pop();
			if(i!=-1)
				System.out.println("The item'"+i+"'is poped");break;
			case 3:s.show();break;
			case 4:return;
			}
			
		}
	}
}
