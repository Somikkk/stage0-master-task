package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        int reversedNumber = 0;
        while(number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        System.out.println(reversedNumber);
    }

}
