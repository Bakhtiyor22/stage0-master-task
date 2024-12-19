package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int i = 0;
        int revNumber = 0;
        while(number >= 0){
            int digit = number % 10;
            revNumber = (10 * i) + digit;
            number /= 10; 
        }
        System.out.println(revNumber);
    }

}
