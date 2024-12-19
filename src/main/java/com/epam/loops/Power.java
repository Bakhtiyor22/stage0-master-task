package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        int original = numberToPrint;
        for (int i = 1; i <= power ; i++) {
            if (i == 1){
                numberToPrint = i * numberToPrint;
            }
            else
                numberToPrint = numberToPrint * original;
        }
        System.out.println(numberToPrint);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
