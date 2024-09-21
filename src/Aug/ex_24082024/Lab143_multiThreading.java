package Aug.ex_24082024;

public class Lab143_multiThreading {
    public static void main(String[] args) throws InterruptedException {
        Thread thread =  Thread.currentThread();
        System.out.println(thread);
        for (int i = 0;i<10;i++)
        {
            System.out.println(i+ " _ " +thread.getName());
            System.out.println(i+ " _ " +thread.getPriority());
            Thread.sleep(5000);
        }

    }
}
