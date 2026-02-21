class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] n2 = new int[nums.length * 2];
        System.arraycopy(nums, 0, n2, 0, nums.length);
        System.arraycopy(nums, 0, n2, nums.length, nums.length);
        return n2;

    }
}
