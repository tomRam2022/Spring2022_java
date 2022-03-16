package Homework;

import java.util.Locale;

public class Homework_4 { public static void main(String[] args) {

    /**
     * Due date: Mar 13 (Sunday)
     */

    /**
     * Task -1
     * using Ternary operator assign value to int-variable
     *
     * Variable -> result1
     * if the length of sentence1-String is greater or equals to 5
     *      value in result1 should be 10
     * else
     *      value in result should be 15
     *
     * print:
     *      value of sentence1
     *      length of sentence1
     *      value of result1
     */

    String sent1 = "My homework is late";
    int result = sent1.length() >= 5 ? 10 : 15 ;

    System.out.println("\nTask 1");
    System.out.println("sentence 1 -> " + sent1);
    System.out.println("sentence 1 lenght -> " + sent1.length());
    System.out.println("value in result -> " + result);






    /**
     * Task - 2
     *
     * Create a String Variable and store your full name in it.
     * Print the following values:
     *  1. length of your full name
     *  2. check if your name ends with "a" (ignore the case)
     *  3. check if your name contains with "a" (ignore the case)
     *
     */
    String myName = "Tomas Ramirez";
    String myNameToLowerCase = myName.toLowerCase(Locale.ROOT);
    int lenghtOfMyName = myNameToLowerCase.length()-1;
    char endsWith = 'a';
    char lastLetterOfString = myNameToLowerCase.charAt(myName.length()-1);
    boolean containsAIgnoreCase = myNameToLowerCase.contains("a");
    boolean endWithAIgnoreCsae = lastLetterOfString == endsWith;

    System.out.println("\nTask 2");
    System.out.println("My full name --> " + myName);
    System.out.println("Does my name ends with the letter a ? " + endWithAIgnoreCsae);
    System.out.println("Does my name contains the letter a ? " + containsAIgnoreCase);


    /**
     * Print the results for:
     *  1. task3-value contains "king" (ignore cases)
     *  2. index of first occurrence of "EW" (ignore cases)
     */
    String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
    String task3ToLowerCase = task3.toLowerCase(Locale.ROOT);
    boolean containsKing = task3ToLowerCase.contains("king");
    int indexofEW = task3ToLowerCase.indexOf("ew");

    System.out.println("\nTask 3");
    System.out.println("sentence --> " + task3);
    System.out.println("Does sentence contain king ? " + containsKing);
    System.out.println("At what index does ew first occur ? " + indexofEW);



    /**
     * Convert the value in task4 variable into Titlecase
     *      (FirstCharacterUppercase and rest all in lowercase)
     *
     * "kINg" -> "King"
     * "QUEEN" -> "Queen"
     */
    String word1 = "kINg";
    String word2 = "QUEEN";
    String word1TitleCase = word1.substring(0,1).toUpperCase(Locale.ROOT) + word1.substring(1).toLowerCase(Locale.ROOT);
    String word2TitleCase = word2.substring(0,1).toUpperCase(Locale.ROOT) + word2.substring(1).toLowerCase(Locale.ROOT);

    System.out.println("\nTask 4 ");
    System.out.println("Word 1 --> " + word1);
    System.out.println("Converting word 2 into titlecase --> " + word1TitleCase) ;
    System.out.println("Word 2 -->" + word2);
    System.out.println("Converting word 2 into titlecase --> " + word2TitleCase);


}
}
