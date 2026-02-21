class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(c>max){ 
                    max=c;
                    c=0;
                }
                else{c=0;}
            }
            else{
                c++;
            }
        }
        return (max>c)?max:c;
    }
}
