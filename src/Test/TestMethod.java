package Test;

import java.util.Arrays;

public class TestMethod {


    public int[] sortArray(int[] num) {

        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j] < num[j - 1]) {
                    num[j] = num[j] + num[j - 1];
                    num[j - 1] = num[j] - num[j - 1];
                    num[j] = num[j] - num[j - 1];
                }
            }
        }
        return num;


    }
    public int addNumString(int numbers) {

        int nums = numbers;
        String numsToString = Integer.toString(nums);
        String[] numsToStringSplit = numsToString.split("");
        int total = 0;
        for (String num : numsToStringSplit) {
            total += Integer.valueOf(num);
        }
        return total;


    }
    public int[] removeNumFromArr ( int num , int[] numArr) {
        int[] nums = numArr;
        int remove = num;
        int[] restOfValuesArr = new int[nums.length - 1];
        int i = 0;
        for (int nummm : nums) {
            if (nummm != remove) {
                restOfValuesArr[i] = nummm;
                i++;
            }
        }return restOfValuesArr;
    }


    public void commonWordsInArray(String[] words1, String[] words2) {
        for (String fromwords1 : words1) {
            for (String fromwords2 : words2) {
                if (fromwords1.equalsIgnoreCase(fromwords2)) {
                    System.out.println(fromwords1.toLowerCase());
                }
            }
        }
    }
}