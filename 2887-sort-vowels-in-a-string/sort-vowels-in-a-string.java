import java.util.*;
class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains("" + s.charAt(i))){
                list.add(s.charAt(i));
            }
        }
        Collections.sort(list);
        StringBuilder res = new StringBuilder();
        int k = 0;
        for(int i = 0; i < s.length(); i++){
            if(vowels.contains("" + s.charAt(i))){
                res.append(list.get(k++));
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}