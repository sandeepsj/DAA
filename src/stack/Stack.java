package stack;

public class Stack {
	int a[];
	int top;
	public Stack(int n)
	{
		a=new int [n];
		top=-1;
	}
	void push(int n) {
		if(top==a.length-1)
			System.out.println("StackOverflow");
		else
			a[++top]=n;
	}
	int pop() {
		if(top==-1) {
			System.out.println("StackUnderflow");
			return -1;
		}
		else
			return a[top--];
	}
	void show() {
		if(top==-1)
			System.out.println("Stack Empty");
		else
		{
			System.out.println("Stack Elements are");
			for(int i=top;i>=0;i--)
				System.out.print(a[i]+" ");
		}
	}
	
}
