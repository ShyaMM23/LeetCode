class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int[] arr=new int[(int)Math.pow(2,nums.length)];
        for(String s: nums) arr[Integer.parseInt(s,2)]++;
        for(int i=0;i<Math.pow(2,nums.length);i++){
            if(arr[i] == 0){ 
                String ans=Integer.toBinaryString(i);
                while(ans.length()<nums.length){
                    ans="0" + ans;
                }
                return ans;
            }
        }
        String ans = Integer.toBinaryString(0);
        while(ans.length() < nums.length){
            ans = "0" + ans;
        }
        return ans;
    }
}