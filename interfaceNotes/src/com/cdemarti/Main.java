package com.cdemarti;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(1_000_000);
        var report = new TaxReport(calculator);
    }
}


// what are interfaces
// we use interfaces to build loosely-coupled extensible testable apps
//  A -> B, a is coupled to b
//  in larger apps a simple change can cause a huge butterfly effect
//  Abstraction
//      only expose what is needed, create a good interface
//      we can completely decouple with interfaces
//      interfaces only define the methods and have no code within them
//      put in interface between a and b to remove coupling
//      charger in a phone, as long as it fits interface it can still charge

//           Interface                        Classes
//         - what should be done            - how it should be done
//          - data compression              -
//          - encryption
//          - sorting
//          - searching