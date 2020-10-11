package com.example.lib;

import java.util.Scanner;

public class TenNaturualNumbers {
    public static void main(String args[]) {
        System.out.println("How many natural number you want to print");
        int num = 10;
        int count = 1;
        System.out.println("Here are your " + num + " numbers");
        while(count<=10)
        {
            System.out.println(count);
            count++;
        }
    }

}
