package RecursionAndDynamicProgramming;

public class Stairs {
    public static void main(String[] args) {
        int n = 3;
        int value = countWays(n);
        System.out.println("Number of ways to climb steps: " + value);
    }

    public static int countWays(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return countWays(n-1) + countWays(n-2) + countWays(n-3);
        }
    }
}
