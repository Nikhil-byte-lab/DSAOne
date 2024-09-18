import java.util.Arrays;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        // Convert the integer array to a string array
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort the string array using a custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating the sorted strings
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(ln.largestNumber(nums)); // Output: "9534330"
    }
}
