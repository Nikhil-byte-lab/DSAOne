package com.dsa;

public class MinChanges {
    public int minChanges(String s) {
        int count = 0;
        for(int i = 0; i < s.length()-1; i=i+2){
            if(s.charAt(i) != s.charAt(i+1)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MinChanges obj = new MinChanges();
        System.out.println(obj.minChanges("010010"));
    }
}
