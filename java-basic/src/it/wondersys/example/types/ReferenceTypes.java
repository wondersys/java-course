package it.wondersys.example.types;

import it.wondersys.example.types.stack.reference.Cat;

import java.util.Date;

public class ReferenceTypes {

    public static void main(String[] args) {
        byte age = 36;

        //IntelliSense should suggest available types while typing Date
        //now is a Reference type variable with type Date
        Date now = new Date(); //'new' keyword allows to create new instances of a class

        long millisSince1970 = now.getTime(); // Members can be accessed with the dot notation, check the documentation

        System.out.println("Millis since 1970: " + millisSince1970);
        System.out.println(now);

        final Cat cat = new Cat(8, 4.1);

        //These two statements do exactly the same thing!
        System.out.println(cat);
        System.out.println(cat.toString());
    }
}
