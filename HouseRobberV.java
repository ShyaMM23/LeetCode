class Solution {
    public long rob(int[] nums, int[] colors) {
        if(nums.length==1) return nums[0];
        int n=nums.length;
        long[] arr=new long[n];
        arr[0]=nums[0];
        long[] arr2=new long[n];
        arr2[0]=0;
        for(int i=1;i<nums.length;i++){
            arr2[i]=Math.max(arr2[i-1],arr[i-1]);
            if(colors[i]==colors[i-1]){
                arr[i]=arr2[i-1]+nums[i];
            }
            else{
                arr[i]=Math.max(arr[i-1],arr2[i-1])+nums[i];
            }
        }
        return Math.max(arr[n-1],arr2[n-1]);
    }
}
