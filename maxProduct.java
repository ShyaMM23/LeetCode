class Solution {
    public int maxProduct(int n) {
        int[] a=new int[String.valueOf(n).length()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=n%10;
            n=n/10;
        }
        Arrays.sort(a);
        return a[a.length-1]*a[a.length-2];
    }
}
