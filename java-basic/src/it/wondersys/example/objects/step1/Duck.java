package it.wondersys.example.objects.step1;

class Duck {

  String plumageColor;
  int swimmingSpeed;
  int age;

  Duck(String plumageColor, int swimmingSpeed, int age) {
    this.plumageColor = plumageColor;
    this.swimmingSpeed = swimmingSpeed;
    this.age = age;
  }

  //Constructor overloading allow to define more than one constructor with different parameters
  Duck(int age) {
    this.plumageColor = "grey";
    this.swimmingSpeed = 2;
    this.age = age;
  }

  Duck() {
    this(3);
  }

  void swim() {
    System.out.printf("%s years old duck is swimming at speed %s\n",
        age,
        swimmingSpeed);
  }

  boolean isOld() {
    return age > 5;
  }

  String getPlumageColor() {
    return plumageColor;
  }

  int getSwimmingSpeed() {
    return swimmingSpeed;
  }

  int getAge() {
    return age;
  }

  int setAge(int newAge) {
    return age = newAge;
  }

}
