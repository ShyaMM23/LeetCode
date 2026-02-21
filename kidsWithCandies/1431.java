class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        LinkedList<Boolean> ret = new LinkedList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i=0;i<candies.length;i++){
            if(max<=(candies[i]+extraCandies)){
                ret.add(true);
            }
            else{
                ret.add(false);
            }
        }
        return ret;
    }
}
