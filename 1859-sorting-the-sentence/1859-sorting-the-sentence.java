class Solution {
    public String sortSentence(String s) {
        String[] str=s.split(" ");
        String[] st=new String[str.length];
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length;i++)
        {
            int n=str[i].charAt(str[i].length()-1)-'0';
            st[n-1]=str[i].substring(0,str[i].length()-1);
        }
        for(String j:st)
        {
            ans.append(j);
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}