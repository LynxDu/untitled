package org.keyf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calc calculator = new Calc();

        int a = 50;
        int b = 13;

        calculator.summ(a,b);
        calculator.sub(a,b);
        calculator.divide(a,b);
        calculator.mul(a,b);
    }
}