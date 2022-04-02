package Practice;

import Test.TestMethod;

import java.util.Arrays;
import java.util.Locale;

public class Practice1 {
    public static void main(String[] args) {


        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */

        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String containsKing = "king";
        String task3InLower = task3.toLowerCase(Locale.ROOT);
        String containsKingInlower = containsKing.toLowerCase(Locale.ROOT);

        //boolean task3ContainsKing = task3InLower.contains(containsKingInlower);


        boolean containKing = task3.toLowerCase(Locale.ROOT).contains("king".toLowerCase(Locale.ROOT));
        //System.out.println(containKing);


        String sent1 = "I love you";
        String contWord = "you";
        boolean cont = sent1.contains(contWord);
        //System.out.println(cont);

        String[] words = {"hello", "give", "learn"};

        for (int i = 0; i <= words.length - 1; i++) {
            System.out.println(words[i]);
        }
        System.out.println("");
        for (int i = 1; i <= words.length; i++) {
            System.out.println(words[words.length - i]);
        }
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
        System.out.println("");
        for (int i = 0; i < words.length; i += 2) {
            System.out.println(words[i]);

        }
        char[] letters = {'l', 'k', 'j', 'h', 'm', 'o', 'p', 'i'};

        for (int i = 0; i < letters.length - 1; i++) {
            System.out.println("letter at index- " + i + " : " + letters[i]);
        }
        String word = "level";
        String[] sentSplit = word.split("");
        String sentReverse = "";
        boolean palindrome = false;
        for (int i = 1; i <= sentSplit.length; i++) {
            sentReverse += sentSplit[sentSplit.length - i];
            palindrome = word.equals(sentReverse);

        }
        // System.out.println(palindrome);


        String[] array = {"car", "plane", "ship", "jet"};
        String wordd = "";
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max) {
                max = array[i].length();
                wordd = array[i];
            }

        }
        System.out.println(wordd);

        TestMethod ans = new TestMethod();
        int[] num = {32, 54, 12, 67, 2, 5};
        int[] sortNum = ans.sortArray(num);
        System.out.println(Arrays.toString(sortNum));

        int nums = 123;
        int answer = ans.addNumString(nums);
        System.out.println(answer);


    }
}

