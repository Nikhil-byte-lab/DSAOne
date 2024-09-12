//You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
//
////Return the number of consistent strings in the array words.


import java.util.HashSet;

public class CountConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allowedSet = new HashSet<>();

        for (char c: allowed.toCharArray()){
            allowedSet.add(c);
        }


        int count = 0;

        for (String s : words){
            boolean isConsistent = true;
            for (char ch : s.toCharArray()){
                if (!allowedSet.contains(ch)){
                    isConsistent = false;
                    break;
                }


            }
            if (isConsistent){
                count++;
            }



        }
        return count;
    }

    public static void main(String[] args) {
        CountConsistentStrings ccs = new CountConsistentStrings();
        System.out.println(ccs.countConsistentStrings("ab", new String[]{"ad","bd","aaab","baa","badab"}));
    }
}
