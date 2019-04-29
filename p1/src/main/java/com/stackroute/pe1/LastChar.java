package com.stackroute.pe1;

import java.util.*;
public class LastChar
{
    void last(String a, int b)
    {
        String s1;
        int l=a.length();
        s1=a.substring(l-b);
        System.out.print(a);
        for(int i=1;i<=b;i++)
            System.out.print(s1);
    }
    public static void main(String args[])
    {
        String s; int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string:");
        s=in.nextLine();
        System.out.println("Enter the value for n:");
        n=in.nextInt();
        LastChar ob=new LastChar();
        ob.last(s,n);
    }
}