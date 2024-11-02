package com.dsa;

public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String caselower = sentence.toLowerCase();

        if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)){
            return false;
        }

        for(int i=0; i<caselower.length(); i++){
            if(caselower.charAt(i) == ' '){
                if(caselower.charAt(i-1) != caselower.charAt(i+1)){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        CircularSentence obj = new CircularSentence();
        System.out.println(obj.isCircularSentence("Leetcode eisc cool"));
    }
}
