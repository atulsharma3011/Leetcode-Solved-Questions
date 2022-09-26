class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans=new StringBuilder();
        int i=word.indexOf(ch);
        if(i==-1)
            return word;
        if(i+1==word.length()) {
            ans.append(word);
            return (ans.reverse()).toString();
        }
        ans.append(word.substring(0,i+1));
        return ((ans.reverse()).append(word.substring(i+1,word.length()))).toString();
      }
}