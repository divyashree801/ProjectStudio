package com.example.lib;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]) {
        System.out.println("Enter a number to check even or odd");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //System.out.println("Given number is" + checkEvenOdd(num));
        checkEvenOdd(num);
    }

    public static void checkEvenOdd(double num) {
        if(num % 2 == 0)
        {
            System.out.println("Even");}
            else
            System.out.println("Odd");


    }
}