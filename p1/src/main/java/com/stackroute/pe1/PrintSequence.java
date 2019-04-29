package com.stackroute.pe1;

import java.util.Scanner;

public class PrintSequence {
    void sequence(int n)
    {
     for(int i=1;i<=n;i++)
     {
         for(int j=1; j<=i;j++)
         System.out.print(" "+i);
     }

    }

    public static void main(String args[])
    {
        int n;
        System.out.println("Enter the limit:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        PrintSequence ob=new PrintSequence();
        ob.sequence(n);
    }
}
