package Aug.ex_24082024;

public class Lab147 {
    public static void main(String[] args) {
//        ThreadGroup threadGroup = new ThreadGroup("Workers");
        Runnable w2 = new Workerth2();
        Thread t2 = new Thread(w2);
        t2.start();
        Runnable w3 = new Workerth3();
        Thread t3 = new Thread(w2);
        t3.start();
        t3.setPriority(7);
        for ( int i =0; i<5;i++)
        {
            try {
                System.out.println(i + " " +Thread.currentThread().getName()+ " priority is  "+Thread.currentThread().getPriority());
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Workerth2 implements Runnable {

    @Override
    public void run() {
        for ( int i =0; i<5;i++)
        {
            try {
                System.out.println(i + " " +Thread.currentThread().getName()+ " priority is  "+Thread.currentThread().getPriority());
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class Workerth3 implements Runnable {

    @Override
    public void run() {
        for ( int i =0; i<5;i++)
        {
            try {
                System.out.println(i + " " +Thread.currentThread().getName()+ " priority is  "+Thread.currentThread().getPriority());
                Thread.sleep(2000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

