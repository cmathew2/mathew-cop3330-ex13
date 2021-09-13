/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is the principal amount? ");
        String principal = in.nextLine();
        System.out.print("What is the rate? ");
        String rate = in.nextLine();
        System.out.print("What is the number of years? ");
        String years = in.nextLine();
        System.out.print("What is the number of times the interest is compounded per year? ");
        String comp = in.nextLine();

        //string conversion
        float p = Float.parseFloat(principal);
        float r = (Float.parseFloat(rate))/ 100;
        float t = Float.parseFloat(years);
        float n = Float.parseFloat(comp);
        //math + roundup process
        float amount = (float) (p*Math.pow(1 + (r/n), n*t));
        float ramount = (Math.round(amount * 100) / 100);

        //output
        System.out.println("$"+principal+" invested at "+rate+"% for "+years+" years compounded "+comp+" times per year is $"+ramount+".");
    }
}
