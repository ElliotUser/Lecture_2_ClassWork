package ru.rick_Sanchez.company.array_java;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 2;
        array[4] = 8;
        int a = array[4];
        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array);
    }

}
