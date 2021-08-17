//An example to demonstrate the differences between static and public methods:
public class Difference {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public Method");

    }

    public static void main(String args[]) {
        myStaticMethod();
        Difference ob = new Difference();
        ob.myPublicMethod();
    }

}