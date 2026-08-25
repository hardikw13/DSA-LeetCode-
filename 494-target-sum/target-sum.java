class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;

     
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }

        if ((total + target) % 2 != 0 || Math.abs(target) > total) {
            return 0;
        }

        int sum = (total + target) / 2;

        int[] dp = new int[sum + 1];
        dp[0] = 1;

        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            for (int j = sum; j >= num; j--) {
                dp[j] = dp[j] + dp[j - num];
            }
        }

        return dp[sum];
    }
}