import java.util.ArrayList;
import java.util.List;

public class DiffWaysToCompute {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '*' || c == '+' || c == '-'){
                String left = expression.substring(0, i);
                String right = expression.substring(i+1);

                List<Integer> leftAns = diffWaysToCompute(left);
                List<Integer> rightAns = diffWaysToCompute(right);

                for(int x:leftAns){
                    for(int y:rightAns){
                        if(c == '*'){
                            ans.add(x*y);
                        }else if(c == '+'){
                            ans.add(x+y);
                        }else if(c == '-'){
                            ans.add(x-y);
                        }
                    }
                }
            }
        }
        if(ans.size() == 0) ans.add(Integer.parseInt(expression));
        return ans;
    }

    public static void main(String[] args) {
        DiffWaysToCompute dfc = new DiffWaysToCompute();
        System.out.println(dfc.diffWaysToCompute("2-1-1"));
    }
}
