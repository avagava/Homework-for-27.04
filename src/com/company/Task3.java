package com.company;

import java.util.Scanner;

public class Task3 {
    /*
    Write a program that receives text from the user and then creates
    a string that is the inverted text and displays it in the console.
    For example, for the text "Cat", the program should write the text
    "taC" in the console. Get the data from the user in the console
    using the Scanner class.
     */

    public void reverse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Task 3");
        System.out.println("Please enter text");
        String text = scanner.nextLine();

        StringBuilder string1 = new StringBuilder(text);
        string1.reverse();
        System.out.println("String 1 " + string1);

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }

    }
}
