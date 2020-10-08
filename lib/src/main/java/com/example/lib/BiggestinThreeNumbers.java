package com.example.lib;

import java.util.Scanner;

public class BiggestinThreeNumbers {
    public static void main(String args[])
    {
        System.out.println("Enter the first number");
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        System.out.println("Enter the 2nd number");
        Scanner s1 = new Scanner(System.in);
        int num2 = s1.nextInt();
        System.out.println("Enter the 3rd number");
        Scanner s2 = new Scanner(System.in);
        int num3 = s2.nextInt();
        //System.out.println("Given number is" + checkEvenOdd(num));
        biggestNumber(num1, num2, num3);
    }

        public static void biggestNumber(int a, int b, int c)
        {

      if(a>=b && a>=c) {
          {
              if(a!=c && a!=b)
              {
                  System.out.println("A is greater number");}
              else if(a==0&& b==0&& c==0){
                  System.out.println("All numbers are 0");
              }
              else if(a==b && a==c)
              {
                  System.out.println("A B C are same");
              }
              else if(a==b)
              {
                  System.out.println("A and B are equal");
              }
              else  {
                  System.out.println( "A and c are equal");
              }
          }
      }
      else if(b >=c) {
          if(b!=c) {
              System.out.println("B is greater number");
          }
          else
          {
              System.out.println("B and C are equal");
          }
      }
      else
      {
          System.out.println(" C is greater number");
      }

    }
}
