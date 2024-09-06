//Kadane's Algorithm
public class MaxSubarraySum {
    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {
        long maxSum = Long.MIN_VALUE;
        long currSum = 0L;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum > maxSum){
                maxSum = currSum;
            }
            if (currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubarraySum maxSum = new MaxSubarraySum();
        System.out.println(maxSum.maxSubarraySum(new int[]{-1, -2, -3, -4}));
    }
}
