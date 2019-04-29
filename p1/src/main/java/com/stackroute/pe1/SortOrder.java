package com.stackroute.pe1;

import java.util.*;
public class SortOrder
{
    void sort(int n)
    {
        int c=0,cp=n,i,j,s=0;
        while(n>0)
        {
            n/=10;
            c++;
        }
        int a[]=new int[c];
        for(i=0;i<c;i++)
        {
            a[i]=cp%10;
            cp/=10;
        }
        for(i=0;i<c-1;i++)
        {
            for(j=0;j<c-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.print("Sorted number in non-increasing order : ");
        for(i=0;i<c;i++)
        {
            System.out.print(a[i]);
            if(a[i]%2==0)
                s+=a[i];
        }
        System.out.println();
        System.out.println("Sum of even numbers : "+s);
        if(s>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=in.nextInt();
        SortOrder ob=new SortOrder();
        ob.sort(x);
    }
}