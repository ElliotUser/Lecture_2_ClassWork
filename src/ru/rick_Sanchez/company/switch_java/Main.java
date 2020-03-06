package ru.rick_Sanchez.company.switch_java;

public class Main {
    public static void main(String[] args) {
        //switch
        String recipient = "ivan";
        switch(recipient){
            case "ivan":
                System.out.println("sent to desk #5");
                break;
            case "petr":
                System.out.println("sent to desk #15");
                break;
            case "vasiliy":
                System.out.println("sent to desk #40");
                break;
            default:
                System.out.println("none of names matched");
        }
    }
}
