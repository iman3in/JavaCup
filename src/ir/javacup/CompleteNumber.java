package ir.javacup;

public class CompleteNumber {
    public static void main(String[] args) {
        for (int i = 2; i < 10_000; i++)
            if (isComplete(i))
                System.out.println(i);
    }

    // Best Practice
    private static boolean isComplete(int n) {
        int sum = 0;
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0)
                sum += i + (n / i);
        return sum + 1 == n;
    }

    private static boolean isComplete_LowPerformance(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0)
                sum += i;
        return sum == n;
    }
}
