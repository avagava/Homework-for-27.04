package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    /*
    Write a program that reads the text entered by the user and then
    divides it into individual words. Then counts the number of occurrences
    of words regardless of case and writes them to the console in alphabetical order.
    For example, for the text "Ala likes cats, but she is not liked
    by the Cats.", the program should write in the console:
        ala - 1
        but - 1
        by - 1
        cats - 2
        is - 1
        liked - 1
        likes - 1
        not - 1
        she - 1
        the - 1
    Assume that any punctuation marks may appear in the text.
    Get the data from the user in the console using the Scanner class.
    */

    public void seperate() {
        System.out.println("Welcome to Task 2");
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter text");

        String userInput = scanner.nextLine();
        userInput = userInput.replace(",","");

        String lowerCase = userInput.toLowerCase();
        String words[] = lowerCase.split("\\s");

        ArrayList<String> arr = new ArrayList<String>();
        for (int i=0; i < words.length; i++) {
            arr.add(words[i]);
        }

        while (arr.size() != 0) {
            String word = arr.get(0);
            int frequency = Collections.frequency(arr, word);
            arr.removeAll(Collections.singleton(word));
                System.out.println(word + " - " + frequency);
        }
    // Cannot figure out how to sort in alphabetical order.
    }

}
