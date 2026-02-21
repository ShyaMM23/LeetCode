class Solution {
    public int valueAfterKSeconds(int n, int k) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,1);
        arr[0]=0;
        for(int j=0;j<k;j++){
            for(int i=1;i<=n;i++)
            {
                arr[i]=arr[i-1]+arr[i];
                arr[i]=arr[i]%(int)((Math.pow(10,9))+7);
            }
        }
        return arr[n];
    }
}
