public class FindNth {
    long findNth(long n) {

        long result = 0;
        long multiplier = 1;

        // Convert n into a number in base-9
        while (n > 0) {
            result += (n % 9) * multiplier;
            n /= 9;
            multiplier *= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        FindNth fn = new FindNth();
        System.out.println(fn.findNth(19));
    }
}
