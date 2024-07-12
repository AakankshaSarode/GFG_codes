class Solution {
    public int minimizeCost(int arr[], int N, int K) {
        // code here
          int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = Math.abs(arr[0] - arr[1]);
        if (N == 2) return dp[1];

        for (int i = 2; i < N; i++) {
            for (int j = i - 1; j >= 0 && j >= i - K; j--) {
                dp[i] = Math.min(dp[i], dp[j] + Math.abs(arr[i] - arr[j]));
            }
        }
        return dp[N - 1];
    }
}