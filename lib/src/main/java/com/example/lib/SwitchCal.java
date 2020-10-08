package com.example.lib;

import java.util.Scanner;

public class SwitchCal {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=s.nextInt();
        System.out.println("Enter second number");
        int num2=s.nextInt();
        System.out.println("Enter operator");
        char ch=s.next().charAt(0);
        switch(ch)
        {
            case '+': System.out.println("ans is "+(num1+num2));
                        break;
            case '-': System.out.println("ans is "+(num1-num2));
                break;
            case '*': System.out.println("ans is "+(num1*num2));
                break;
            case '/': if(num2!=0)
                System.out.println("ans is "+(num1/num2));
            else System.out.println("Num2 cant be 0");
                break;
            default: System.out.println("Invalid operator");
                break;
        }
    }
}
