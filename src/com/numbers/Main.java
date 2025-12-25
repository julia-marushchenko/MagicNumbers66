/**
 *  Program to find numbers dividable by 3.
  */

package com.numbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a list of integers
        List<Integer> list = new ArrayList<>();

        // Variable to store number of iteration
        int number = 1;

        // Adding random 66 numbers to the list
        while (true) {

            if (number < 67) {

                list.add(new Random().nextInt());

            } else {

                // Stop loop
                break;
            }

            // Increasing number by value 1
            number++;

        }

        // Printing the whole list to console
        // Helping index
        int index = 0;

        // Creating Iterator to print each element of the list
        Iterator<Integer> it = list.iterator();

        // Checking if list has next element
        while (it.hasNext()) {

            System.out.print(it.next());
            System.out.print(" ");

            // Incrementing index
            index++;

            // Condition
            if (index % 3 == 0) {
                System.out.println();
            }
        }

        // Checking if numbers are dividable by 3 and printing to console
        for (int index1 = 0; index1 < list.size(); index1++) {

            // Saving value of current element of the list
            int current_element = list.get(index1);

            // Condition for division by 3
            if (current_element % 3 == 0) {

                // Printing the result to console
                System.out.println(current_element + " is dividable by 3.");

            } else {

                // Printing the result to console
                System.out.println(current_element + " is not dividable by 3.");

            }
        }

    }
}