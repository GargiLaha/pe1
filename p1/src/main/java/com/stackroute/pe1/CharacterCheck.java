package com.stackroute.pe1;

import java.util.*;
public class CharacterCheck
{
    void checkchar(char c)
    {
        if(Character.isUpperCase(c))
            System.out.println("Capital Letter");
        else if(Character.isLowerCase(c))
            System.out.println("Lower Case Letter");
        else if(Character.isDigit(c))
            System.out.println("Digit");
        else
            System.out.println("Special Symbol");
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Character:");
        char a=in.next().charAt(0);
        CharacterCheck ob=new CharacterCheck();
        ob.checkchar(a);
    }
}

