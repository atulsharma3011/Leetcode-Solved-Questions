class Solution {
    public int lengthOfLastWord(String s) {
       String[] str=s.split(" ");
       int i=str.length-1;
       int n=str[i].length();
        return n;
    }
}