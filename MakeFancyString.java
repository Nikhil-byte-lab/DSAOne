package com.dsa;

//A fancy string is a string where no three consecutive characters are equal.
//
//Given a string s, delete the minimum possible number of characters from s to make it fancy.
//
//Return the final string after the deletion. It can be shown that the answer will always be unique.

public class MakeFancyString {
    public String makeFancyString(String s) {

        if(s.length() < 2){
            return s;
        }
        StringBuilder sb = new StringBuilder("");

        sb.append(s.charAt(0));
        sb.append(s.charAt(1));

        for(int i=2; i<s.length(); i++){
            int cur = s.charAt(i);
            int prev = sb.charAt(sb.length()-1);
            int prevP = sb.charAt(sb.length()-2);

            if(!(cur == prev && cur == prevP)){
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MakeFancyString obj = new MakeFancyString();
        System.out.println(obj.makeFancyString("Leeetcode"));
    }
}
