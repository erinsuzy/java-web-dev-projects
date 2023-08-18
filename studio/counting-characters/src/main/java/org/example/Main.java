package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = hiddenFigures.toCharArray();

        HashMap<Character, Integer> counts = new HashMap<>();
        for(Character character : charactersInString){
            if(counts.containsKey(character)) {
                counts.put(character, counts.get(character) +1);
            } else {
                counts.put(character, 1);
            }

            }


        System.out.println(counts);
        }
        }


