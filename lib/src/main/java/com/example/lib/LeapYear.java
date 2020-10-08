package com.example.lib;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        System.out.println("Enter year");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        //System.out.println("Given number is" + checkEvenOdd(num));
        checkYear(num);
    }
    public static void checkYear(int n)
    {
        if(n%4==0){
            if(n%100==0 && n%400==0){
            System.out.println("Leap year");}
            System.out.println("not");
        }
        else {
            System.out.println("not");
        }
    }
}
