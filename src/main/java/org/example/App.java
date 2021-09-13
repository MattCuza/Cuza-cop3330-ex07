/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        final double conversion = 0.09290304;
        Scanner sc= new Scanner(System.in);
        System.out.println( "What is the length of the room in feet? " );
        double length = sc.nextInt();

        System.out.println( "What is the width of the room in feet? " );
        double width = sc.nextInt();

        double f2 = (length * width);
        double m2 = (f2 * conversion);
        System.out.println( "You entered dimensions of " + length + " feet by " + width + " feet.\n" +
                "The area is \n" + f2 + " square feet\n" + m2 + " square meters");
    }
}
