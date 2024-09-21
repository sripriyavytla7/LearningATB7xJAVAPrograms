package Aug.ex_24082024;

public class Lab145 {
    public static void main(String[] args) {
       worker0 w0 = new worker0();
       w0.start();
       worker1 w1 = new worker1();
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
class worker0 extends Thread {
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
class worker1 extends Thread {
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
