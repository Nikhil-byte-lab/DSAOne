//You are given a string s consisting of lowercase English letters, and an integer k.
//
//First, convert s into an integer by replacing each letter with its position in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26). Then, transform the integer by replacing it with the sum of its digits. Repeat the transform operation k times in total.
//
//For example, if s = "zbax" and k = 2, then the resulting integer would be 8 by the following operations:
//
//Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
//Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
//Transform #2: 17 ➝ 1 + 7 ➝ 8
//Return the resulting integer after performing the operations described above.


public class GetLucky {
    public int getLucky(String s, int k) {
        StringBuilder number = new StringBuilder();
        for (char c : s.toCharArray()){
            int value = (c - 'a') + 1;
            number.append(value);
        }

        int result = 0;
        for (int i = 0; i < k; i++) {
            result = 0;
            for (char digit : number.toString().toCharArray()) {
                result += digit - '0';  // Sum the digits
            }
            number = new StringBuilder(String.valueOf(result));

        }
        return result;
    }

    public static void main(String[] args) {
        GetLucky gl = new GetLucky();
        System.out.println(gl.getLucky("leetcode", 2));
    }
}
