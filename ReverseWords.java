public class ReverseWords {
    String reverseWords(String str) {
        String[] strArr = str.split("\\.", 0);
        String result = "";
        int n = strArr.length;

        for (int i = n-1; i >= 0; i--) {
            result = result + strArr[i];
            if (i != 0){
                result = result + ".";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("i.like.this.program.very.much"));
    }
}
