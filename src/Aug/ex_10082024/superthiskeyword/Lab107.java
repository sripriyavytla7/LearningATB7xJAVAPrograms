package Aug.ex_10082024.superthiskeyword;

public class Lab107 {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
class Student extends Person{
    void display (){
       super.message();
       this.message();
    }
    @Override
    void message (){
        System.out.println("I am a student");
    }
}
class Person{
    void message()
    {
        System.out.println("I am a person");
    }
}
