/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Richard Lopez
 */

/*
    1. Input Scanner
    2. prompt user for their quote of choice
    3. Scan for quote
    4. prompt user for the quote's author
    5. Scan for author name
    6. Output result with inputs
 */

package exercise03;

import java.util.Scanner;

public class Solution03 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is the quote? ");
        String quote = in.nextLine();
        System.out.print("Who said it? ");
        String author = in.nextLine();

        System.out.println(author + " says, " + "\"" + quote + "\"");
    }

}
