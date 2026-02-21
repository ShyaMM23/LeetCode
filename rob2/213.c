int max(int a, int b)
{
    return (a>b)?a:b;
}

int rob(int* nums, int numsSize) {
    int dp[numsSize];
    dp[0]=0;
    if(numsSize == 1)
    {
        return nums[0];
    }
    dp[1]=nums[1];
    for(int i=2;i<numsSize;i++)
    {
        dp[i] = max(dp[i-1],nums[i]+dp[i-2]);
    }
    int ma=dp[numsSize-1];
    dp[0]=nums[0];
    for(int i = 1; i < numsSize-1; i++)
    {
        if(i == 1)  dp[i] = max(dp[0], nums[1]);
        else    dp[i] = max(dp[i-1], nums[i] + dp[i-2]);
    }
    ma = max(ma, dp[numsSize-2]);
    return ma;
}
