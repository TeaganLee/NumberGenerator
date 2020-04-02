package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        randomNumber();

    }
    public static void randomNumber(){
        System.out.println((int) (Math.random() * 100) + 1);


    if ( int < 50){
        System.out.println("Large number");
    }else if ( int > 50){
        System.out.println("Tiny number");
    }else{
        System.out.println("Your middling");
    }

}
