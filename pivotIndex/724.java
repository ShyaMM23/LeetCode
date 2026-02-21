class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if (n == 0) return -1;

        int[] a1 = new int[n]; 
        int[] a2 = new int[n]; 
        a1[0] = 0;
        for (int i = 1; i < n; i++) {
            a1[i] = a1[i - 1] + nums[i - 1];
        }

        a2[n - 1] = 0; 
        for (int i = n - 2; i >= 0; i--) {
            a2[i] = a2[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            if (a1[i] == a2[i]) {
                return i;
            }
        }

        return -1;
    }
}
