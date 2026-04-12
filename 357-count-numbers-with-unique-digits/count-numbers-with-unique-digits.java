class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        if (n == 0) return 1;
        int result = 10; 
        int unique = 9;
        int avail= 9;
        for (int i = 2; i <= n; i++) {
            unique*= avail;
            result += unique;
            avail--;
        }

        return result;
    }
}