class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            int sum=0;
            for(int j=0;j<s.length();j++){
                char ch=s.charAt(j);
                int ind=ch-'a';
                sum+=weights[ind];
            }
            int m=sum%26;
            res+=(char)('z'-m);
        }
        return res;
    }
}
