class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target=='z') return letters[0]; 
        int l=0,h=letters.length-1,ans=0;
        while(l<=h){
            int m=(l+h)/2;
            if(letters[m]>target){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return letters[ans];
    }
}
