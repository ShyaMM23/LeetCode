class Solution {
    public int compress(char[] chars) {
        StringBuilder a = new StringBuilder(); 
        int i = 0;
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }
            a.append(currentChar);
            if (count > 1) {
                a.append(count);
            }
        }
        for (int j = 0; j < a.length(); j++) {
            chars[j] = a.charAt(j);
        }
        return a.length();
    }
}
