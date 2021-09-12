package org.example;
import java.util.Scanner;  // Import the Scanner class

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

public class App 
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is your name?");

        String Name = myObj.nextLine();  // Read user input
        System.out.println("Hello, " + Name + ", nice to meet you!");  // Output user input
    }
}
