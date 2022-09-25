class Solution {
    public String reverseWords(String s) {
        StringBuilder res=new StringBuilder();
        String[] str=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            StringBuilder r=new StringBuilder();
            r.append(str[i]);
            r.reverse();
            res.append(r.toString()+" ");
        }
        res.setLength(res.length()-1);
        return res.toString();
    }
}