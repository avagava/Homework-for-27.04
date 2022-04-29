package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_David {
    public void correct() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Task 2: Read text and divide into words, display the number of occurrences of each word.");
        System.out.println("Please input a text:");

        String message = scanner.nextLine();
        //Make string lowercase so all string will be compared to regardless of case.
        message = message.toLowerCase();
        message = message.replaceAll("\\p{Punct}", "");

        //Divide text into individual words
        //String.split: used to split strings into an array
        String[] messageArray = message.split(" ");

        Arrays.sort(messageArray);

        int counter;

        //Loop over all elements in array
        for (int i = 0; i < messageArray.length; i++) {
            //Condition to check if current iteration is not a duplicate

            if (messageArray[i] == null) {
                continue;
            }
            counter = 1;
            //Loop over remaining elements to check if they're equal to current item.
            // Meaning the word is repeated in the array.
            for (int j = i + 1; j < messageArray.length; j++) {
                //Condition to check if both items are equal
                if (messageArray[i].equals(messageArray[j])) {
                    counter++;
                    messageArray[j] = null;
                }
            }

            //Print result after loop is completed to know amount of times word occurs.
            System.out.println(messageArray[i] + " - " + counter);

        }

    }
}
