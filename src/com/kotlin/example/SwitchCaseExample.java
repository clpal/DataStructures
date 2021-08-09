package com.kotlin.example;

public class SwitchCaseExample {

    public static void main(String[] args) {
        int i=6;
        switch (i){
            case 6:
                System.out.println("value "+i);
            case 2:
                System.out.println("value "+i);
            case 1:
                System.out.println("value "+i);
                break;
                case 3:
                System.out.println("value "+i);
            default:
               System.out.println("Default ");
        }
    }
}
