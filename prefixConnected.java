class Solution {
    public int prefixConnected(String[] words, int k) {
        int c=0;
        String[] res=new String[words.length];
        for(int i=0;i<words.length;i++){
            if(words[i].length()<k){
                res[i]=null;
            }
            else{
                res[i]="";
                for(int j=0;j<k;j++){
                    res[i]+=words[i].charAt(j);
                }
            } 
        }
        int[] arr=new int[words.length];
        for(int i=0;i<words.length;i++){
            if(res[i]==null||arr[i]==1) continue;
            int c1=1;
            for(int j=i+1;j<words.length;j++){
                if(res[j]!=null && res[i].equals(res[j])){
                    c1++;
                    arr[j]=1;
                }
            }
            if(c1>=2){
                c++;
                arr[i]=1;
            }
        }
        return c;
    }
}
