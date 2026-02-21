class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        HashMap<Integer,Integer> ff=new HashMap<>();
        for(int f:freq.values()){
            ff.put(f,ff.getOrDefault(f,0)+1);
        }
        for(int n:nums){
            int fr=freq.get(n);
            if(ff.get(fr)==1){
                return n;
            }
        }
        return -1;
    }
}
