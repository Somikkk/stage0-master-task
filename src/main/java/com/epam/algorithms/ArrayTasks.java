package com.epam.algorithms;

public class ArrayTasks {

    public String[] seasonsArray() {
        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    public int[] generateNumbers(int length) {
        if (length <= 0) {
            return new int[0];
        }
        int[] result = new int[length];
        for(int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    public int totalSum(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum = sum + num;
        }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == number) {
                return i;
            }
        }
        return -1;
    }


    public String[] reverseArray(String[] arr) {
        String[] reversedArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
        return reversedArr;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int count = 0;
        for(int num : arr) {
            if(num > 0) {
                count++;
            }
        }
        int[] positiveNumbers = new int[count];
        int index = 0;
        for(int num : arr) {
            if(num > 0) {
                positiveNumbers[index] = num;
                index++;
            }
        }
        return positiveNumbers;
    }

    public int[][] sortRaggedArray(int[][] arr) {
        // Sort one-dimensional arrays by length in ascending order.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length > arr[j + 1].length) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sort numbers within each one-dimensional array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }

        return arr;
    }

}
