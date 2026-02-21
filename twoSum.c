int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int* mad=(int*)malloc(sizeof(int)*2);
    *returnSize=2;
    for(int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++)
        {
            if(nums[i]+nums[j]==target){
                mad[0]=i;
                mad[1]=j;
                return mad;
            }
        }
    }
    *returnSize=0;
    return NULL;
}
