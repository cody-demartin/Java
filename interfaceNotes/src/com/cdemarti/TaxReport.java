package com.cdemarti;

public class TaxReport {
    private TaxCalc calculator;

    public TaxReport(TaxCalc calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void setCalculator(TaxCalc calculator) {
        this.calculator = calculator;
    }

}
