class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1) return true;
        return !s.contains("01");
    }
}