class Solution {
    public boolean isFascinating(int n) {
        String s=""+n+(n*2)+(n*3);
        if (s.length()!=9) return false;
        boolean[] d=new boolean[10];
        for (char c:s.toCharArray())
        {
            int di=c-'0';
            if(di==0||d[di]) return false;
            d[di]=true;
        }
        return true;
    }
}
