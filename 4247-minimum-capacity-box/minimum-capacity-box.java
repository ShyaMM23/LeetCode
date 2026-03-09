class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min=99999,r=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>= itemSize)
            { 
                if(min>capacity[i])
                { 
                    min=capacity[i];
                    r=i;
                }
            }
        }
        return r;
    }
}