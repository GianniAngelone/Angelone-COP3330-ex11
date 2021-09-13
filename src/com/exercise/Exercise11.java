/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise11{
    public static void main(String[] args) {
        double exchangeRate;
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        //Here we first take in the input from a user
        System.out.print("How many euros are you exchanging? ");
        String euros = input.nextLine();
        System.out.print("What is the exchange rate? ");
        exchangeRate = scan.nextDouble();
        //Next we have to make the user string input into numeric numbers
        int Euros = Integer.parseInt(euros);
        double usDollar = Euros * exchangeRate;
        //Now we print our results to the screen after calculating.
        System.out.print(String.format("%s euros at an exchange rate of %s is \n", euros, exchangeRate));
        System.out.print(String.format("%.2f U.S. dollars.", usDollar));
    }
}