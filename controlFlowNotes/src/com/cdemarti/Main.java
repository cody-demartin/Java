package com.cdemarti;

public class Main {

    public static void main(String[] args) {
	    int x = 1;
	    int y = 1;
        System.out.println(x == y); // boolean expression
        System.out.println(x != y);

        int temp = 12;
        if (temp > 30) {
            System.out.println("It is a hot day");
        }
        else if ( temp > 20) {
            System.out.println("Beaut");
        }
        else {
            System.out.println("Brrr");
        }

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("admin");
                break;
            default:
                System.out.println("not admin");
        }

        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
