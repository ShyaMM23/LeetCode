class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> r=new ArrayList<>();
        for(int x:nums){
            r.add((long)x);
        }
        int i=0;
        while(i<r.size()-1){
            if(r.get(i).equals(r.get(i+1)))
            {
                r.set(i,(r.get(i)+r.get(i+1)));
                r.remove(i+1);
                if(i>0){
                    i--;
                }
            }
            else{
                i++;
            }
        }
        return r;
    }
}
