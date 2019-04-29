package com.stackroute.pe1;

import java.util.*;
public class StringReverse
{
    void reverse(String s)
    {
        int l=s.length();
        for(int i=l-1;i>=0;i--)
            System.out.print(s.charAt(i));
    }

    public static void main(String args[])
    {
        String s;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        s=in.nextLine();
        StringReverse ob=new StringReverse();
        ob.reverse(s);
    }
}
