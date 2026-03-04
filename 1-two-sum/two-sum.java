class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> n=new HashMap<>();
        int n1=nums.length;
        for(int i=0;i<n1;i++){
            int c=target-nums[i];
            if(n.containsKey(c)){
                return new int[] {n.get(c),i};

            }
            n.put(nums[i],i);
        }
        return new int[]{};
    }
}