public class OneD2TwoD {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] arr = new int[m][n];

        if(m*n != original.length){
            return new int[0][0];
        } else {
            int k = 0;
            int original_length = original.length;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(original_length > 0){
                        arr[i][j] = original[k++];
                        original_length--;
                    }
                }
            }
            return arr;
        }
    }
}

// 5ms Runtime (m*n) Time complexity