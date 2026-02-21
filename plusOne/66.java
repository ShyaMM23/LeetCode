class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        if(n==99){
            int[] ne=new int[100];
            ne[0]=1;
            for(int i=1;i<n;i++){
                ne[i]=0;
            }
            return ne;
        }
        if(n>=7){
            if(digits[n-1]==9){
                digits[n-1]=0;
                digits[n-2]+=1;
            }
            else{
                digits[n-1]+=1;
            }
            return digits;
        }
        String num="";
        for(int i=0;i<n;i++){
            num+=digits[i];
        }
        int no=Integer.parseInt(num);
        no=no+1;
        int length = String.valueOf(no).length();
        int[] arr=new int[length];
        while(no>0){
            arr[--length]=no%10;
            no=no/10;
        }
        return arr;
    }
}
