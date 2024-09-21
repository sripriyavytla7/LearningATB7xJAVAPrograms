package Aug.ex_24082024;

public class Lab146 {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Workers");
        Workerth0 w0 = new Workerth0(threadGroup,"worker0");
        w0.start();
        Workerth1 w1 = new Workerth1(threadGroup,"worker1");
        w1.start();
        for ( int i =0; i<5;i++)
        {
            try {
                System.out.println(Thread.currentThread().getName()+ " priority is  "+Thread.currentThread().getPriority());
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Workerth0 extends Thread {
    Workerth0(ThreadGroup threadGroup, String name){
      super( threadGroup,  name);

  }
    @Override
    public void run() {
        for ( int i =0; i<5;i++)
        {
            try {
                System.out.println(Thread.currentThread().getName()+ " priority is  "+Thread.currentThread().getPriority());
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class Workerth1 extends Thread {
    Workerth1(ThreadGroup threadGroup, String name){
        super( threadGroup,  name);
    }
    @Override
    public void run() {
        for ( int i =0; i<5;i++)
        {
            try {
                System.out.println(Thread.currentThread().getName()+ " priority is  "+Thread.currentThread().getPriority());
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
