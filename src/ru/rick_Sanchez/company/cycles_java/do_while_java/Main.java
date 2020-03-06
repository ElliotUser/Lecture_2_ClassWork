package ru.rick_Sanchez.company.cycles_java.do_while_java;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        do{
            i++;
            if( i % 2 == 0) continue;
            System.out.print(i + " ");
            //if(i == 5) break;
        }while(i<10);
    }
}
