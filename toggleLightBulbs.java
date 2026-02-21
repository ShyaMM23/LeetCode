class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        int[] arr=new int[101];
        for(int a:bulbs){
            arr[a]++;
        }
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]%2!=0){
                li.add(i);
                
            }
        }
        return li;
    }
}
