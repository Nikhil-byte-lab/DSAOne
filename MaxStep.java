public class MaxStep {
    public int maxStep(int arr[]) {
        int maximumStep = 0;
        int currStep = 0;

        for(int i = 1; i < arr.length; i++){
            if((arr[i] - arr[i-1]) > 0){
                currStep++;
            }else{
                currStep = 0;
            }
            if(currStep > maximumStep){
                maximumStep = currStep;
            }

        }

        return maximumStep;
    }

    public static void main(String[] args) {
        MaxStep ms = new MaxStep();
        System.out.println(ms.maxStep(new int[]{3, 6, 3, 12, 13, 14, 11, 11, 1, 9, 18, 3, 17, 18, 9, 6, 1, 13}));
    }
}
