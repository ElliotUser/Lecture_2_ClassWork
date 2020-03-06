package ru.rick_Sanchez.company.cycles_java.for_java;

public class Main {
    public static void main(String[] args) {
        //for
//        for(int i = 0; i < 10; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        System.out.println(power(2,10));
    }

    private static int power(int base, int sing){
        int result = 1;
        for(int i = 0; i < sing; i++) {
            result *= base;
        }
        return result;
    }
}
