package basicConcepts;

public class Test {
    public static void main(String[] args) {
        A aobj = new A();
        aobj.methodA();

        B bobj = new B();
        bobj.methodA();
        bobj.methodB();

        System.out.println("A OR B?");

//        obj has properties of A and is a type B
        A obj = new B();
        obj.methodA();

    }
}
