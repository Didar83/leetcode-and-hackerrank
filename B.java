public class B extends A{
    @Override
    public void printMe() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        A test = new A();
        A treakyA = new B();
        B testB = new B();
        test.printMe();
        treakyA.printMe();
        testB.printMe();
    }
}
