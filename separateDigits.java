class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<nums.length;i++) 
        {
            s.append(nums[i]);
        }
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            arr[i]=s.charAt(i)-'0';
        }
        return arr;
    }
}
