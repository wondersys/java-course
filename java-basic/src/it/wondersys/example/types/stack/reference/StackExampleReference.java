package it.wondersys.example.types.stack.reference;

public class StackExampleReference {

    public static void main(String[] args) {
        Cat c1 = new Cat(8, 3.8);
        foo();
    }

    private static void foo() {
        Cat c2 = new Cat(9, 4.1);
        bar(c2);
    }

    private static void bar(Cat value) {
        Cat c3 = new Cat(10, 4.6);
    }

}
