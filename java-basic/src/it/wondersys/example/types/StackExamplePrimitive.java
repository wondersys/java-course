package it.wondersys.example.types;

public class StackExamplePrimitive {

  public static void main(String[] args) {
    foo();
  }

  private static void foo() {
    int a1 = 5;
    bar(a1);
  }

  private static void bar(int value) {
    long a2 = 80;
  }
}
