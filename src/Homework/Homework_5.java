package Homework;

import java.util.Arrays;
import java.util.Locale;

public class Homework_5 {

    public static void main(String[] args) {

        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length()-method from String class)
         *
         * Hint: you need to use split() method and length-variable (from Array)
         */

        String country = "Mexico";
        String [] countryNameSplit = country.split("");
        int numLengthOfWord = countryNameSplit.length;

        System.out.println( "\n--> Q1 <--");
        System.out.println("Country name -> " + country);
        System.out.println("Length of country name -> " + numLengthOfWord);

        /**
        * Q2:
         * Print the number of words in the sentence2-value
        */
        String sentence = "Health was Earlier said to Be the ability of the body functioning WElL.";
        String [] sentSplit = sentence.split(" ");
        int numOfWords = sentSplit.length;

        System.out.println("\n--> Q2 <--");
        System.out.println("sentence -> " + sentence);
        System.out.println("length of sentence -> " + numOfWords);

        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */
        String sentence2 = "new york city";
        String sent2UpperCase = sentence2.toUpperCase(Locale.ROOT);
        String [] sent2Split = sent2UpperCase.split(" ");
        char letterZeroIndex = sent2Split[0].charAt(0);
        char letterOneIndex = sent2Split[1].charAt(0);
        char letterTwoIndex = sent2Split[2].charAt(0);

        System.out.println("\n--> Q3 <--");
        System.out.println("new york city -> " + letterZeroIndex + letterOneIndex + letterTwoIndex);

        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         *
         */
        System.out.println("\n--> Q4 <--");

        int num = 30;
        System.out.println("my number " + num + " is divisible by what number ?");

        if (num %5 == 0) {
            System.out.println("divisible by 5");
        } else if (num %3 == 0) {
            System.out.println("divisible by 3");
        } else if (num %5 == 0 && num %3 == 0) {
            System.out.println("divisible by 5 and 3");
        } else if (num %5 != 0 && num %3 != 0) {
            System.out.println("NOT divisible by 5 and 3");
        }
        /**
         * Q5:
         * Create two variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * double studentScore = -5 (studentScore <= maxScore)
         * int maxScore = -1 (maxScore > 0)
         *
         * (studentScore/maxScore)*100 = 92.2
         *
         * Your grade = A, percentage = 92.2
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         *
         */
        System.out.println("\n--> Q5 <--");
        double myScore = 70.98;
        double maxScore = 100;
        double scoreAvg = myScore / maxScore * 100;

        if (scoreAvg >= 91 ) {
            System.out.println("Grade A");
        } else if (scoreAvg >= 81 && scoreAvg <= 90.99) {
            System.out.println("Grade B");
        } else if (scoreAvg >= 71 && scoreAvg <= 80.99 ) {
            System.out.println("Grade C");
        } else if (scoreAvg >= 61 && scoreAvg <= 70.99) {
            System.out.println("Grade D");
        } else if (scoreAvg <= 60.99) {
            System.out.println("Grade E");
        }

        System.out.println(scoreAvg);

        /**
         * Q6:
         * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
         * print the values which has length greater than 5 and starts with l
         *
         * expected ans:
         * learning
         * living standard
         *
         */
        System.out.println("\n--> Q6 <--");
        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"};
        System.out.println("words --> " + Arrays.toString(words));
        System.out.println("\nwords which has length greater than 5 and starts with l : ");
        char startWithLetter = 'l';
        for ( int i = 0 ; i<= words.length -1 ; i++) {
            //if (words[i].length() > 5 && words[i].toLowerCase().charAt(0) == startWithLetter)
            if (words[i].length() > 5 && words[i].toLowerCase().startsWith("l")) ;

            System.out.println(words[i]);
        }


    }
}
