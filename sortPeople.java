class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int i=0;
        while(i<names.length) {
            int j=i+1;
            while (j<heights.length) {
                if (heights[i]<heights[j]) {
                    int t1=heights[i];
                    heights[i]=heights[j];
                    heights[j]=t1;
                    String s2=names[i];
                    names[i]=names[j];
                    names[j]=s2;
                }
                j++;
            }
            i++; 
        }
        return names;
    }
}
