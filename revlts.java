class Solution {
    public String reverseByType(String s) {
        String s1="";
        String s2="";
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)){
                s1=ch+s1;
            }
            else{
                s2=ch+s2;
            }
        }
        int k=0,j=0;
        String res="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                res+=s1.charAt(k++);
            }
            else{
                res+=s2.charAt(j++);
            }
        }
        return res;
    }
}
