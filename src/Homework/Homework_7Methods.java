package Homework;

import java.util.Arrays;
import java.util.Locale;

public class Homework_7Methods {

    public static String abbreviationConversion (String inputWords) {
        String words = inputWords;
        String[] wordsSplit = words.split(" ");
        String wordsAbv = "";
        for (int i = 0; i <= wordsSplit.length - 1; i++) {
            wordsAbv += wordsSplit[i].toUpperCase(Locale.ROOT).substring(0, 1);
        }return wordsAbv;

    }
    public static String titlecaseConversion (String sentence) {
        String sent = sentence ;
        String [] sentSplit = sent.split(" ");
        String sentenceTitlecase = " ";

        for (int i = 1; i <= sentSplit.length - 1; i++) {
            sentenceTitlecase += " " + sentSplit[i].substring(0, 1).toUpperCase() + sentSplit[i].substring(1).toLowerCase();

        }return sentenceTitlecase;

    }
    public static String reverseSentence (String sentence) {
        String sent = sentence;
        String[] sentSplit = sent.split(" ");
        String sentReverse = "";

        for (int i = 1; i <= sentSplit.length; i++) {
            sentReverse += " " + sentSplit[sentSplit.length-i];
        }return sentReverse;

    }
    public static boolean palindrome (String wordInput) {
        String word = wordInput;
        String[] sentSplit = word.split("");
        String sentReverse = "";
        boolean palindrome = false;
        for (int i = 1; i <= sentSplit.length; i++) {
            sentReverse += sentSplit[sentSplit.length - i];
            palindrome = word.equals(sentReverse);

        }
        return palindrome;
    }

    public static String longestWordInString (String words) {

        String[] array = words.split(" ");
        String word = "";
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                word = array[i];
            } 

        }
        return word;

    }


}
