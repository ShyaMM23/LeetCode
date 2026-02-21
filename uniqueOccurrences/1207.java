class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> f=new HashMap<>();
        for (int num:arr){
            f.put(num, f.getOrDefault(num, 0) + 1);
        }
        Set<Integer> o=new HashSet<>(f.values());
        return (f.size()==o.size())?true:false;
    }
}
