package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            // cant use decimals
        int buffalo = 5;
        int honey = 10;

        //need {} if true and {} if false

        if(buffalo > 6) {
            System.out.println("very true");
        } else if (buffalo > 5) {
            System.out.println("not sure");
        }
        else {
            System.out.println("false");
        }
        System.out.println(buffalo);
        // == CHECKS the value whereas = SETS the value

       int Trin = 5;

        if(Trin == 4){
            System.out.println("They are equal");
        }
        else {
            System.out.println("They are not equal");
        }

        int bbq;
        bbq = 10 + honey;
        System.out.println(bbq);
        // you can declear something but not assign it(above)



        double chicken  = 5444;
        double wings = 1/4;
        System.out.println(wings);
        // A double allows decimals

        byte b = 1;
        short s = 1;
        long l = 9L;
        float f = 1.5f;

        System.out.println(f);
        // you cannot re-equal chicken to a string (letters)
        // (example) chicken = "Hi";


        boolean potato = false;
        boolean fries = true;
        // dark blue symbles = key words

        boolean loggedIn = false;

        // if something is true, then execute code block
        if(fries){
            System.out.println("really true");

        // Only Strings can use .equals, NOT int (int uses ==)
        String message1 = "Hello Beta";
        if (message1.equals ("Hello Beta")) {
            System.out.println("Totes equals");
        }
        // Example
        String message2 = "Hello";
        String message3 = "Hello There";

        if (message2.equals(message3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println("Hey you. Enter your Name Please");
        // import statements are dependecies
        Scanner robotCharlie = new Scanner(System.in);
        String inputFromUser = robotCharlie.nextLine();

        System.out.println("Here is your Name: " + inputFromUser);

        }
    }
}
