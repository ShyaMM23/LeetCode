class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0) return "";
        String p=strs[0];
        int len=p.length();
        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            while(len>s.length()||!p.equals(s.substring(0,len))){
                len--;
                if(len==0){
                    return  "";
                }
                p=p.substring(0,len);
            }
        }
        return p;
    }
}
