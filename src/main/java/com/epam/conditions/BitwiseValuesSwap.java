package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {

        first = first ^ second; // Обмен значений
        second = second ^ first; // Восстановление значения second
        first = first ^ second; // Восстановление значения first

        System.out.println("" + first + "\n" + second);
    }

}
