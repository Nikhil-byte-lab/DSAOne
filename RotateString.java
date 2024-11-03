public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            if(sb.toString().equals(goal)){
                return true;
            }
            char temp = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(temp);

        }
        return false;
    }

    public static void main(String[] args){
      RotateString obj = new RotateString();
      System.out.println(obj.rotateString());
    }
}
