package Homework;

public class Homework_7QA {
    public static void main(String[] args) {
        System.out.println("");
        String words = "new york city";

        System.out.println("--> " + words + " <--");

        String wordsAbv = Homework_7Methods.abbreviationConversion(words);
        System.out.println("\nabbreviated -> " + wordsAbv);


        String titlecase = Homework_7Methods.titlecaseConversion(words);
        System.out.println("\ntitlecase -> " + titlecase);

        String reversed = Homework_7Methods.reverseSentence(words);
        System.out.println("\nreversed -> " + reversed);

        String word2 = "level";
        boolean palindrome = Homework_7Methods.palindrome(word2);
        System.out.println("");
        System.out.println("is word " + word2 + " palindrome-> " + palindrome);

        String wordds = "car plane shippppp jet";
        String longestWordInArray = Homework_7Methods.longestWordInString(wordds);
        System.out.println("\n" + longestWordInArray);
    }



}