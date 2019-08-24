package pgm3;
import java.util.Random;
public class ThreadRandom implements Runnable{
	public void run() {
		try {
			Random r=new Random();
			for(int i=0;i<5;i++) {
				System.out.println("Thread 3 produces "+(i+1)+"th random number"+r.nextInt(100));
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
