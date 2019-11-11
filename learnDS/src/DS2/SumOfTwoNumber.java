package DS2;

import java.util.HashSet;

/***
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17
 */

public class SumOfTwoNumber {

    private static boolean getPair(int[] nums, int total){
        HashSet s = new HashSet();
        for (int i : nums){
            int temp = total - i;
            if (s.contains(temp)){

                return true;
            }
            s.add(i);

        }
        return false;

    }

    public static void main(String[] args) {
        int[] a = {};
        System.out.println(SumOfTwoNumber.getPair(a, 17));
    }
}
