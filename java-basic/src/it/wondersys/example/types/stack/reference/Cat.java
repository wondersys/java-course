package it.wondersys.example.types.stack.reference;

public class Cat {

  //These are called fields, this is the state of every instance a Cat will have
  int age;
  double weight;

  //This is called constructor. Must have same name of class.
  // If none is defined, default constructor (with no params) will be available
  // This is invoked when a "new Cat" statement is given (with the right amount of params)
  public Cat(int age, double weight) {
    this.age = age;
    this.weight = weight;
  }

  //These are methods and builds up the behavior each instance of Cat will share

  //Methods that provides access to the state are called getters
  public int getAge() {
    return age;
  }

  public double getWeight() {
    return weight;
  }

  //You can also have setters to provide a change of state
  public void setAge(int age) {
    this.age = age;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  //toString method is invoked automatically when the object needs to be printed (e.g.: System.out)
  @Override
  public String toString() {
    return "Cat{" +
        "age=" + age +
        ", weight=" + weight +
        '}';
  }
}
