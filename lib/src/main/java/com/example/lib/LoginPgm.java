package com.example.lib;

import java.util.Scanner;

public class LoginPgm {
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter user name");
        String username=s.nextLine();
        System.out.println("Enter password");
        String pwd=s.nextLine();
        if(username!=" ")
        {
            System.out.println("Username cannot be blank");
        }
        else if(pwd!=" ")
        {
            System.out.println("Pwd cannot be blank");
        }
        else
        {
            System.out.println("Login success");
        }
    }
}
