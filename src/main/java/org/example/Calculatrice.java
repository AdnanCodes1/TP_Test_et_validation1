package org.example;

public class Calculatrice {

    public double add(double a, double b){
        return a + b;
    }

    public double substraction(double a, double b){
        return a - b;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double division(double a, double b){

        if(b == 0){
            throw new ArithmeticException("Division by zero");
        }

        return a / b;
    }

}
