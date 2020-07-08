package it.wondersys.example.objects.step1;

public class PondSimulator {

  public static void main(String[] args) {
    Duck grey = new Duck("grey", 10, 4);
    Duck defaultDuck = new Duck();

    grey.swim();
    defaultDuck.swim();
  }
}
