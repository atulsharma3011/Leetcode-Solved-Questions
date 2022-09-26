class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int n, w1=word1.length(), w2=word2.length();
        n=Math.min(w1,w2);
        for(int i=0;i<n;i++)
        {
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }
        if(w1<w2)
            ans.append(word2.substring(n));
        else
            ans.append(word1.substring(n));
        return ans.toString();
    }
}