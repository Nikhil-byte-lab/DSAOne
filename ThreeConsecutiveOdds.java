//Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.

public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        boolean isOddConsecutive = false;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & 1) == 1){
                count++;
                if (count >= 3){
                    isOddConsecutive = true;
                    return isOddConsecutive;
                }
            } else {
                count = 0;
            }
        }
        return isOddConsecutive;
    }

    public static void main(String[] args) {
        ThreeConsecutiveOdds obj = new ThreeConsecutiveOdds();
        System.out.println(obj.threeConsecutiveOdds(new int[] {1,2,34,3,4,5,7,23,12}));
    }
}
