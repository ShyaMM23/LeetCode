class Solution {
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        List<Integer> d=new ArrayList<>();
        for (int i=0;i<n;i++){
            d.add(nums[i][i]);          
            d.add(nums[i][n-i-1]);   
        }
        Collections.sort(d);
        int[] arr=new int[d.size()];
        for (int i=0;i<d.size();i++) 
        {
            arr[i]=d.get(i);
        }
        for(int i=arr.length-1;i>=0;i--){
            if (isPrime(arr[i])){
                return arr[i]; 
            }
        }
        return 0;
    }
    private boolean isPrime(int num){
        if (num<2) return false;
        for(int i=2; i*i<=num;i++){
            if (num%i==0) return false;
        }
        return true;
    }
}
