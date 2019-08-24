package pgm3;
import java.util.Scanner;
public class MultiThreadDemo {
	public static void main(String args[]) {
		Square s=new Square(10);
		Triangle t=new Triangle(10,20);
		ThreadRandom tr=new ThreadRandom();
		Thread t1=new Thread(s);
		Thread t2=new Thread(t);
		Thread t3=new Thread(tr);
		
		t3.start();
		t1.start();
		t2.start();
	}
}
