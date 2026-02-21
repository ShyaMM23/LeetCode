class Solution {
    public boolean isThree(int n) {
        if(n<=3){return false;}
        else{
            List<Integer> l=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    l.add(i);
                }
            }
            int c=l.size();
            if(c==3){
                return true;
            }
        }
        return false;
    }
}
