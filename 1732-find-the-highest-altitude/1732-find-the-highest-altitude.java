class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int sum=0;
        int n= gain.length;
        for(int i=0;i<n;i++)
        {
            sum=sum+gain[i];
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}