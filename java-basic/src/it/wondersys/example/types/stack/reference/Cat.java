package it.wondersys.example.types.stack.reference;

public class Cat {

    //These are called fields, this is the state of every instance a Cat will have
    int age;
    double weight;

    //This is called constructor. If any is defined, default constructor (with no params) will be available
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

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", weight=" + weight +
                '}';
    }
}
