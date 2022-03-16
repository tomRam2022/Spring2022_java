package Practice;

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
        System.out.println(containKing);


        String sent1 = "I love yo";
        String contWord = "you";
        boolean cont = sent1.contains(contWord);
        System.out.println(cont);

    }

}
