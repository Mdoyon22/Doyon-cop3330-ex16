/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        final int legalDriveAge = 16;
        System.out.print("What is your age? ");
        int age = inp.nextInt();
        boolean isLegal = age >= legalDriveAge;

        String outputLegal = "You are old enough to legally drive.";
        String outputIllegal = "You are not old enough to legally drive.";

        String messagetoPrint = (isLegal) ? outputLegal : outputIllegal;
        System.out.print(messagetoPrint);
    }
}
