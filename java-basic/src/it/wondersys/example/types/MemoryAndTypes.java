package it.wondersys.example.types;

import java.awt.*;

public class MemoryAndTypes {

  public static void main(String[] args) {
    int a = 1;
    int b = a;

    a = 3; //I reassign a value to a, will the value of b change too?

    //a & b are in two different memory location, so when the value of a is assigned to b the value is copied to the
    // memory location of
    System.out.println(b);

    Point point1 = new Point(0, 0);
    Point point2 = point1; //Copies the reference to point1 and stores it in point2, the object is still the same!

    System.out.println("Point1: " + point1);
    System.out.println("Point2: " + point1);

    point1.x = 2;
    System.out.println("Point1: " + point1);
    System.out.println("Point2: " + point1);

  }

}
