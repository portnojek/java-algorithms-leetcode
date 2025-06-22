package leetcode.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PrefixNumbers1480 calculator = new PrefixNumbers1480();
        int[] input = {1, 3, 5, 6, 9};
        int[] result = calculator.runningSum(input);
        System.out.println("Result: " + Arrays.toString(result));

        LongestPrefix longestPrefix = new LongestPrefix();

        String[] input1 = {"flower", "flow", "flight"};
        String result1 = longestPrefix.longestCommonPrefix(input1);
        System.out.println("Longest common prefix: " + result1);  // Output: fl

        String[] input2 = {"dog", "racecar", "car"};
        String result2 = longestPrefix.longestCommonPrefix(input2);
        System.out.println("Longest common prefix: " + result2);  // Output: (empty string)
    }
}
