bool hasIncreasingSubarrays(int* nums, int numsSize, int k) {
    if (k == 1) return true;
    int count = 1;
    for (int i = 1; i+k < numsSize; ++i) {
        if (nums[i] > nums[i-1] && nums[i+k] > nums[i+k-1]) {
            if (++count == k) return true;
        }
        else count = 1;
    }
    return false;
}
