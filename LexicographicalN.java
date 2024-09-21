import java.util.ArrayList;
import java.util.List;

class LexicographicalN {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(i, n, result);
        }
        return result;
    }
    
    private void dfs(int curr, int n, List<Integer> result) {
        if (curr > n) {
            return;
        }
        result.add(curr);
        for (int i = 0; i <= 9; i++) {
            int next = curr * 10 + i;
            if (next > n) {
                return;
            }
            dfs(next, n, result);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 13; // Test case input
        List<Integer> result = solution.lexicalOrder(n);
        System.out.println("Lexicographical order from 1 to " + n + ":");
        System.out.println(result);
    }
}
