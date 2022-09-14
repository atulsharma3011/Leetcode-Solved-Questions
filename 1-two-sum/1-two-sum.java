class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int num1=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            num1=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                sum=num1+nums[j];
                if(sum==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
                    
            }
        }
        return ans;
    }
}