package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        byte myAge = 30;
        Date now = new Date(); // instance of Date class
        System.out.println(now);

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
