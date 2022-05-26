import java.util.concurrent.atomic.AtomicBoolean;

public class BubbleSort implements Runnable{
  Thread bubblThread;
  private final AtomicBoolean running = new AtomicBoolean(false);

  public void start() {
    if(bubblThread == null) {
      bubblThread = new Thread(bubblThread);
      bubblThread.start();
    }
  }




  @Override
  public void run() {
    running.set(true);
    System.out.print("workde");
    
  }
  
}
