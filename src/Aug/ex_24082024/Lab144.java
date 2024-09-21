package Aug.ex_24082024;

public class Lab144 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        for (int i = 0;i<10;i++)
        {
            System.out.println(t.getName() +i + " - " +t.getThreadGroup()+ " - "+ t.getPriority());
        }
    }
}
