package com.example.lib;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String args[]) {
        System.out.println("Enter a number to check even or odd");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //System.out.println("Given number is" + checkEvenOdd(num));
        checkNumStatus(num);
    }
    public static void checkNumStatus(int n)
    {
        if(n>0){
        System.out.println("Positive number");}
        else if(n<0)
            System.out.println("Negative number");
        else {
            System.out.println("Neutral number");
        }
    }

}
