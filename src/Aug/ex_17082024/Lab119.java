package Aug.ex_17082024;

public class Lab119 {
    public static void main(String[] args) {
        abc a = new abc() { //Here abc is Anonymous Class
            @Override
            public void ma() {
                System.out.println("ma method");
            }

            @Override
            public void dad() {
                System.out.println("dad method");
            }
        };

        CBA a1 = new CBA() {

            @Override
            void m3() {
                System.out.println("m3 abstract method");
            }
        };
        a1.m3();
        a.dad();
        a.ma();
    }
}

   interface  abc{
       void ma();
       void dad();

   }
    abstract class CBA{
        abstract void m3();
    }

