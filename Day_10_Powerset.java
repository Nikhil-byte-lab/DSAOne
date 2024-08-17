package DSAOne;

public class Day_10_Powerset {
    public static void main(String[] args) {
        powerset("abc", 0, "");
    }

    public static void powerset(String S, int i, String curr){
        if(i == S.length()){
            System.out.println(curr);
            return;
        }
        powerset(S, i+1, curr + S.charAt(i));
        powerset(S, i+1, curr);
    }
}
