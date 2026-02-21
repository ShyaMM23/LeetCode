class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> li=new ArrayList<>();
        li.add(Integer.toString(1));
        if(n==1){return li;}
        li.add(Integer.toString(2));
        for(int i=3;i<=n;i++){
            if(i%15==0)
            {
                li.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                li.add("Fizz");
            }
            else if(i%5==0){
                li.add("Buzz");
            }
            else{li.add(Integer.toString(i));}
        }
        return li;
    }
}
