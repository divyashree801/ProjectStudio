package com.example.lib;

import java.util.Scanner;

public class SampleClass {
    static Scanner s=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter Username");
        String uname=s.nextLine();
        checkLoginPage(uname);
    }
    public static void checkLoginPage(String uname)
    {
        switch (uname){
            case "punit": System.out.println("valid username");
                            System.out.println("Enter password");
                            String pwd=s.nextLine();
                            if(pwd.equals("admin123"))
                            {
                                System.out.println("Login success");
                            }else
                            {
                                System.out.println("invalid pwd");
                            }
                            break;
            default: System.out.println("Invalid username");
        }
    }

}
