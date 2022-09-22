class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] e=new int[nums.length/2];
        int[] o=new int[nums.length/2];
        int j=0,k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                e[j++]=nums[i];
            }
            else
            {
                o[k++]=nums[i];
            }
        }
        int[] result=new int[nums.length];
        int k1=0,k2=0;
        for(int i=0;i<result.length;i++)
        {
            if(i%2==0)
                result[i]=e[k1++];
            else
                result[i]=o[k2++];
        }
        return result;
    }
}