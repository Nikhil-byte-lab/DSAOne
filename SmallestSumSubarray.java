//Smallest sum contiguous subarray


public class SmallestSumSubarray {
    static int smallestSumSubarray(int a[], int size)
    {
        int smallSum = Integer.MAX_VALUE;
        int currSum = 0;

        for (int i = 0; i < size; i++) {
            currSum = currSum + a[i];
            if (currSum < smallSum){
                smallSum = currSum;
            }
            if (currSum > 0){
                currSum = 0;
            }
        }

        return smallSum;
    }

    public static void main(String[] args) {

        System.out.println(SmallestSumSubarray.smallestSumSubarray(new int[]{3,-4, 2,-3,-1, 7,-5}, 7));
    }
}
