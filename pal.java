class Solution {
    public boolean isPalindrome(String s) {
        String s1="";
        s=s.toLowerCase();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)||Character.isDigit(ch)){
                s1+=ch;
            }
        }
        StringBuilder r=new StringBuilder(s1);
        r.reverse();
        return r.toString().equals(s1)?true:false;
    }
}
