package com.example.lib;

public class AdditionOf2Numbers {

    public static void main(String args[])
    {
        int mul=additionNumbers();
        System.out.println(mul);
        System.out.println("The result is "+additionNumbers());
    }

    public static int additionNumbers()
    {
        int num1 = 10;
        int num2=20;
        int mul= num1*num2;
        return mul;
    }
}
