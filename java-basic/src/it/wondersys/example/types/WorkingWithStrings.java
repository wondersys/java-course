package it.wondersys.example.types;

public class WorkingWithStrings {

    public static void main(String[] args) {
        String message = new String("hello world"); //new String() is redundant,

        //use the shortand literal, you can also concatenate strings with +
        message = "Hello" + "!!  ";

        System.out.println(message);

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));

        System.out.println(message.length());
        System.out.println(message.isEmpty());

        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("l"));
        System.out.println(message.indexOf("Q"));

        System.out.println(message.substring(0,5));
        System.out.println(message.trim());
        System.out.println(message.trim().length());

        System.out.println(message.replace("!","?"));
        System.out.println(message);

        //Check documentation of methods by pressing CTRL+Q when the cursor is on the name of method
        String betterHelloWithEscapeSequence = "Hello \"Luigi\""; // Use escape sequence to use special characters
        System.out.println(betterHelloWithEscapeSequence);

        String myPathOnWindows = "C:\\Windows\\system32"; //the backslash needs to be escaped
        System.out.println(myPathOnWindows);

        //Some special escape sequences

        // Tabulation
        System.out.println("Name\tAge");
        System.out.println("John\t36");

        // Carriage return
        System.out.println("Hello\nI'm here");

    }


}
