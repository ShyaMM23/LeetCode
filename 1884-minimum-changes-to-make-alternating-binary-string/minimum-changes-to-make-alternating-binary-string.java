class Solution {
    public int minOperations(String s) {
        return Math.min(check(s,'0'), check(s,'1'));
    }
    public int check(String s, char start){
        StringBuilder sb = new StringBuilder(s);
        int c = 0;
        if(sb.charAt(0)!=start){
            c++;
            sb.setCharAt(0,start);
        }
        for(int i=1;i<sb.length();i++){
            if(sb.charAt(i)==sb.charAt(i-1)){
                c++;
                sb.setCharAt(i, sb.charAt(i)=='0' ? '1' : '0');
            }
        }
        return c;
    }
}