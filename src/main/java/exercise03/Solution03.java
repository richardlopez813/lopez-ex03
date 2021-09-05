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
