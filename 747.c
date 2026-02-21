int dominantIndex(int* nums, int n){
    int max=0,ret=0;
    for(int i=0;i<n;i++){
        if(nums[i]>max){
            max=nums[i];
        }
    }
    for(int i=0;i<n;i++){
        if(nums[i]==max) ret=i;
        if(nums[i]!=max&&nums[i]*2>max)return -1;
        else continue;
    }
    return ret;
}
