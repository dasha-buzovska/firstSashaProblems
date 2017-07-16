package com.company;import java.util.ArrayList;

public class Eratosphen {

    public static void main(String[] args) {
        printArr(eratosphen(10));
    }

    public static ArrayList<Integer> eratosphen(int number) {
        //записуєио в масив усі числа
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = i+1;
        }

        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] != 0) {
                for (int j = array[i]*2-1; j < array.length; j+=array[i]) {
                    array[j] = 0;
                }
                primes.add(array[i]);
            }
        }
        return primes;
    }

    public static void printArr (ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
