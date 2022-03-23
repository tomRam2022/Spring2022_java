package Homework;

import java.util.Arrays;
import java.util.Locale;

public class Homework_6 {
    public static void main(String[] args) {

        /**
         * Q1:
         * Create the abbreviation
         *
         * make America great again -> MAGA
         * Good Morning -> GM
         * happy birthday to you dear friend -> HBTYDF
         * hEllo -> H
         * Air ballon -> AB
         *
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         */

        String words = "new york city";
        String[] wordsSplit = words.split(" ");
        String wordsAbv = "";
        for (int i = 0; i <= wordsSplit.length - 1; i++) {
            wordsAbv += wordsSplit[i].toUpperCase(Locale.ROOT).substring(0, 1);
        }
        System.out.println("\n--> Q1 <-- ");
        System.out.println("words to be abbreviated -> " + words);
        System.out.println(wordsAbv);

        /**
         * Q2:
         * Reverse the given String
         *
         * make america great again -> again great america make
         * good Morning -> Morning good
         * learn -> learn
         * happy birthday to you -> you to birthday happy
         *
         */

        String sent ="new york city";
        String[] sentSplit = sent.split(" ");
        String sentReverse = "";

        for (int i = 1; i <= sentSplit.length; i++) {
            sentReverse += " " + sentSplit[sentSplit.length-i];
        }

        System.out.println("\n--> Q2 <--");
        System.out.println("print in reverse -> " + sent );
        System.out.println(sentReverse);

        /**
         * Q3:
         * Convert the String value in to Titlecase
         *
         * make america great again -> Make America Great Again
         * gOOd morNING -> Good Morning
         * learn -> Learn
         * happy birTHday TO yOu -> Happy Birthday To You
         *
         */
        String sentence = " nEw york city";
        String [] sentenceSplit = sentence.split(" ");
        String sentenceTitlecase = " ";

        for (int i = 1; i <= sentenceSplit.length - 1; i++){
            sentenceTitlecase += " " + sentenceSplit[i].substring(0,1).toUpperCase() + sentenceSplit[i].substring(1).toLowerCase(Locale.ROOT);
            //System.out.println(sentenceTitlecase);
        }
        System.out.println("\n--> Q3 <--");
        System.out.println("converting into titlecase -> " + sentence);
        System.out.println(sentenceTitlecase);

        /**
         * Q4:
         * Find the minimum value from the given array
         *
         * int[] numbers = {-1, 1};     ->  -1
         * int[] numbers = {1, 21, 87, 23};     -> 1
         * int[] numbers = {87, 23, 89, 0, 54, 23}; -> 0
         */

        int[] numbers = {87, 23, 89, 1, 54, 23,};
        int num = numbers [0];
        for (int i = 0; i <= numbers.length-1 ; i++) {

            if (numbers[i] < num )
            num = numbers[i];
        }
        System.out.println("\n--> Q4 <--");
        System.out.println("Find the minimum value from the given array -> " + Arrays.toString(numbers));
        System.out.println(num);
    }
}