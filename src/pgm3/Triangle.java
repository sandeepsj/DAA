package pgm3;

public class Triangle implements Runnable{
	int b;
	int h;
	public Triangle(int b,int h) {
		this.b=b;
		this.h=h;
	}
	public void run() {
		System.out.println("Thread2:area:"+(b*h*0.5));
	}
}
