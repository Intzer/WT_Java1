package main.java.by.bsuir.lab1.task5;

public class Resolver {
    public static int findMinToRemove(int[] A) {
        if (A == null || A.length <= 1) {
            return 0;
        }

        int n = A.length;
        int[] dp = new int[n];
        int maxLength = 1;

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (A[i] > A[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return n - maxLength;
    }
}