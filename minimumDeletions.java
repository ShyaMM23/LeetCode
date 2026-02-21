class Solution {
    public int minimumDeletions(String s) {
        int b=0; 
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                b++; 
            } 
            else if(b>0){
                b--; 
                c++;
            }
        }
        return c;
    }
}
