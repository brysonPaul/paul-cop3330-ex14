/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Bryson Paul
 */
package org.example;
import java.util.Scanner;
public class App {
    public static void main( String[] args ) {
        Scanner sc= new Scanner(System.in);
        float tax = 0;
        final float WI_TAX = (float).055;
        float orderAmt = Float.parseFloat( strIO("What is the order amount? ",sc));
        String state = strIO("What is the state? ",sc);
        String taxString = "";//will print nothing if the user does not get taxed
        if(state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin")) {
            String subtotal = String.format("%.02f",orderAmt);//before tax
            tax = orderAmt*WI_TAX;
            String formattedTax = String.format("%.02f",tax);
           taxString = "The subtotal is $"+subtotal+".\nThe tax is $"+formattedTax+".\n";
        }
        String totalWithTax = String.format("%.02f",(orderAmt+tax));
        System.out.println(taxString+"The total is $"+totalWithTax+".");

    }
    public static String strIO(String input, Scanner sc){
        System.out.print(input);
        String output = sc.nextLine();
        return output;
    }
}
