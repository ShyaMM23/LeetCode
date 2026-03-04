class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min=nums[0],max=nums[0];
        for (int n:nums){
            if (n<min) min=n;
            if (n>max) max=n;
        }
        int[] freq=new int[max-min+1];
        for (int n :nums){
            freq[n-min]++;
        }
        int[] s=freq.clone();
        Arrays.sort(s);
        int t=s[s.length-k];
        ArrayList<Integer> li=new ArrayList<>();
        for (int i=0;i<freq.length;i++){
            if (freq[i] >= t){
                li.add(i+min); 
            }
            if (li.size()==k) break; 
        }
        int[] ret=new int[k];
        for (int i=0;i<k;i++){
            ret[i]=li.get(i);
        }
        return ret;
    }
}
