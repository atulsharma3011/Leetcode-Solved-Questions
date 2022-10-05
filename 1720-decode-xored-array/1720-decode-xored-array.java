class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int[] ans=new int[n+1];
        ans[0]=first;
        int i=0;
        while(i<n)
        {
            ans[i+1]=ans[i]^encoded[i];
            i++;
        }
        return ans;
    }
}