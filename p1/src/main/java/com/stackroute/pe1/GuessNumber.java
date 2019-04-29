package com.stackroute.pe1;

import java.util.Scanner;

public class GuessNumber
{
    void guess()
    {
        int number=27, user_guess;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Guess number (Range 1-50)");
            user_guess = input.nextInt();

            if (user_guess == number) {
                System.out.println("It is right guess. " + number + " is correct");
                break;
            } else if (user_guess < number) {
                System.out.println("Guessed Number is Less than original number");
            } else
                System.out.println("Guessed Number is greater than original number");

        }
    }

    public static void main(String[] args)
    {
        GuessNumber ob=new GuessNumber();
        ob.guess();
    }
}