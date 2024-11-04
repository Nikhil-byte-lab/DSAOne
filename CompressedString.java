package com.dsa;

public class CompressedString {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        char prev = word.charAt(0);
        for(int i=1; i<word.length(); i++){
            if(count < 9 && prev == word.charAt(i)){
                count++;
            }else{
                sb.append(count);
                sb.append(prev);
                count = 1;
            }


            prev = word.charAt(i);
        }
        sb.append(count);
        sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }

    public static void main(String[] args) {
        CompressedString obj = new CompressedString();
        System.out.println(obj.compressedString("aaaaaaaaaaaaaabb"));
    }
}
