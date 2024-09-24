import java.util.Arrays;

public class FindTwoElement {
    int[] findTwoElement(int arr[]) {
        Arrays.sort(arr);

        int[] result = new int[2];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]){
                result[0] = arr[i];
            }
        }

        int currSum = 0;
        int originalSum = 0;

        for (int i : arr){
            currSum += i;
        }
        currSum = currSum - result[0];

        for (int i = 1; i <= arr.length; i++) {
            originalSum += i;
        }

        result[1] = originalSum - currSum;

        return result;
    }

    public static void main(String[] args) {
        FindTwoElement fte = new FindTwoElement();
        int[] res = fte.findTwoElement(new int[]{
                13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37, 39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45});
        System.out.println(res[0] + " " + res[1]);
    }
}
