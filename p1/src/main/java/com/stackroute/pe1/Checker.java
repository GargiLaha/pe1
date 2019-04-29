package com.stackroute.pe1;

import java.util.InputMismatchException;

public class Checker {

    static String str;

    public String tomjerry(int n) {
        int a;
        if (n % 2 != 0) {
            if (20 <= n && n <= 30)
                str = "Tom";
        } else if (20 <= n && n <= 30)
            str = "Jerry";
        else if (n < 20 || n > 30) {
            str = "Neither Tom nor Jerry";

        }
        return str;
    }

    public String error_message(String s)
    {
       if (false) {
           throw new InputMismatchException();
       }
           return ("enter int");

    }

}