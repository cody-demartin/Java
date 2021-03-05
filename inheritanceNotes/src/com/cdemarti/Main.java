package com.cdemarti;

public class Main {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(textBox);
    }

    public static void show(UIControl control) {

        System.out.println(control);
    }
}

// upcasting is when you use a subclass in place of a parent class in a param
// in the example of a method that takes an animal, could use dog since a dog
// IS A(n) animal

// downcasting is opposite. every animal not really a dog so we have to be careful
// we have to make a type check using instanceOf operator to safely downcast
// downcasting is important to get access to child methods for that object