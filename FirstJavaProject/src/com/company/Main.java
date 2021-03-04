package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte myAge = 30;
        Date now = new Date(); // instance of Date class
        System.out.println(now);

        String message = "Hello World" + "!!"; // strings reference types in Java
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", "*")); // returns a new string
        // strings are immutable in Java

        int[][] numbers = new int[2][3]; // 2 x 3 2d array
        numbers[0][0] = 1;
        System.out.println(Arrays.deepToString(numbers));
        // arrays have fixed length


        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        long viewsCount = 3_123_456_789L; // add L to long numbers
        float price = 10.99F; // add F to floats
        char letter = 'A'; // single char with single, strings with double
        boolean isEligible = false;
        System.out.println("hi");
    }
}





// primitive types
//  for storing simple values
//      bytes 1 byte [-128, 127]
//      short 2 bytes [-32k, 32k]
//      int   4 bytes [-2B, 2B]
//      long  8 bytes even larger
//      float 4 bytes
//      double 8 bytes
//      char   2 bytes
//      boolean 1 byte true/false

// reference type
//
