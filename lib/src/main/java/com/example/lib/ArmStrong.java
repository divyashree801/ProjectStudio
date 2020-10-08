package com.example.lib;

public class ArmStrong {
    public static void main(String args[])
    {
        int num=54748;
        int len=String.valueOf(num).length();
        if(num<=3) {
            checkArmstrong(54748);
        }
        else {
            System.out.println("Number's digits should be less than or equal to 3"
                    );
        }
    }
    public static void checkArmstrong(int num)
    {
        int r; int q; int sum=0;
        r= num%10; //3
        q=num/10; //15
        r=r*r*r;
        sum=sum+r;

        r= q%10;
        q=q/10;
        r=r*r*r;
        sum=sum+r;

        r= q%10;
        q=q/10;
        r=r*r*r;
        sum=sum+r;
        System.out.println(q);

        if(num==sum)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not an Armstrong");
        }

    }
}
