package org.launchcode.studios;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args){
        String bookSen = "Alice was beginning to get very tired of sitting by her sister on the bank," +
            "and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
            "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without " +
            "pictures or conversation?'";


        Scanner input = new Scanner(System.in);

        System.out.println("Enter word to search: ");
        String word = input.nextLine().toUpperCase();
        boolean isContains = bookSen.toUpperCase().contains(word);
        System.out.println(isContains);

        Integer index = bookSen.indexOf(word);
        Integer length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = bookSen.replace(word,"");
        System.out.println(modifiedSentence);

    }

}
