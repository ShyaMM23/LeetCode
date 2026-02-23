class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int i=0,j=0;
        int c=0;
        while (i < s.length() && s.charAt(i) != '1') {
            i++;
        }
        j = i + 1;
        while(i<s.length()&&j<s.length()){
            if(s.charAt(i)=='1'&& s.charAt(j)=='1'){
                int t=j-i;
                i=j;
                j++;
                if(t>c){
                    c=t;
                }
            }
            else{
                j++;
            }
        }
        return c;
    }
}