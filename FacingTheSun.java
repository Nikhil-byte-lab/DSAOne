import java.util.*;

public class FacingTheSun {
    // Returns count of buildings that can see sunlight
    public int countBuildings(int[] height) {
        int count = 1;  // The first building always sees sunlight
        int maxHeight = height[0];
        
        for (int i = 1; i < height.length; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        FacingTheSun solution = new FacingTheSun();
        
        // Example input
        int[] height = {7, 4, 8, 2, 9};
        
        // Count the number of buildings that can see sunlight
        int result = solution.countBuildings(height);
        
        // Print the result
        System.out.println(result);  // Output: 3
    }
}
