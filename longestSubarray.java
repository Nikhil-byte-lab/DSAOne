class Solution {
    public int longestSubarray(int[] nums) {
        // Step 1: Find the maximum value in the array
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }
        
        // Step 2: Find the longest subarray where all elements are equal to maxVal
        int maxLength = 0;
        int currentLength = 0;
        
        for (int num : nums) {
            if (num == maxVal) {
                currentLength++;  // increment the length of the current subarray
            } else {
                currentLength = 0;  // reset the length when the value is not maxVal
            }
            maxLength = Math.max(maxLength, currentLength);  // update the maximum length
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 3, 2, 3};
        System.out.println(sol.longestSubarray(nums));  // Output should be 2
    }
}
