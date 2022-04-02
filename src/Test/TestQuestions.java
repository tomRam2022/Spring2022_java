package Test;

import java.util.Arrays;

public class TestQuestions {
    public static void main(String[] args) {


        /**
         * Ques-1:
         * Create a method to return an int-array after sorting a given input-int-array
         * points: 10
         */
        /*
         *
         * eg:
         * input -> [32, 54, 12, 67, 2, 5]
         * returned array -> [2, 5, 12, 32, 54, 67]
         */
        int[] num = {32, 54, 12, 67, 2, 5};
        int[] result = {};

        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    num[j] = num[j] + num[j - 1];
                    num[j - 1] = num[j] - num[j - 1];
                    num[j] = num[j] - num[j - 1];
                    result = num;
                }
            }
            //System.out.println(Arrays.toString(result));
        }
        System.out.println(Arrays.toString(result));
        /**
         * Ques-2:
         * Create a method to return the sum of digits in input-int-value
         * points: 20
         */
        /*
         *
         * eg:
         * input -> 123
         * returned value -> 6  (1 + 2 + 3)
         */
        int numms = 123;
        String numsToString = Integer.toString(numms);
        String[] numsToStringSplit = numsToString.split("");
        int total = 0;
        for (String numm : numsToStringSplit) {
            total += Integer.valueOf(numm);
        }
        System.out.println(total);


        /**
         * Ques-3:
         * Create a method to return an int-array after removing input-int-value from an input-int-array
         * points: 30
         */
        /*
         *
         * eg:
         * input -> 23, {23, 54, 67, 12, 34, 23, 56}
         * returned array -> {54, 67, 12, 34, 56}
         */
        int[] nums = {23, 54, 67, 12, 34, 23, 56};
        int remove = 67;
        int[] restOfValuesArr = new int[nums.length - 1];
        int i=0;
        for (int nummm : nums) {
            if (nummm != remove) {
                restOfValuesArr[i] = nummm;
                i++;
            }
        }
                System.out.println(Arrays.toString(restOfValuesArr));

                /**
                 * Ques-4:
                 * Create a method to print the common Strings values in two input-String-arrays
                 * points: 40
                 * Note: two input-String-arrays can be of same size or different size
                 */
                /*
                 *
                 * String[] inputArr3 = {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”};
                 * String[] inputArr4 = {“abcde”, “jhuy”, “plot”, “koli”};
                 *
                 * printCommons(inputArr3, inputArr4);
                 * abcde
                 * koli
                 */
                String[] words1 = {"ab", "abcd", "abc", "abcde", "defg", "koli"};
                String[] words2 = {"abcde", "jhuy", "plot", "koli"};
                for (String fromwords1 : words1) {
                    for (String fromwords2 : words2) {
                        if (fromwords1.equalsIgnoreCase(fromwords2)) {
                            //System.out.println(fromwords1.toLowerCase());
                        }


                    }
                }
            }
        }
