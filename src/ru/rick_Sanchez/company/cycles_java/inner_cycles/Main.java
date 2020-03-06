package ru.rick_Sanchez.company.cycles_java.inner_cycles;

public class Main {
    public static void main(String[] args) {
        pifagor(100,100 );

    }

    private static void pifagor(int rows, int cols){
        for(int y = 1; y < rows; y++) {

            for(int x = 1; x < cols; x++) {
                System.out.printf("%7d", x * y);
            }
            System.out.println();
        }
    }
}
