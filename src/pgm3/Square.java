package pgm3;

public class Square implements Runnable{
	int a;
	public Square(int n)
	{
		a=n;
	}
	public void run() {
		System.out.println("Thread 1:Area="+a*a);	
	}
}
