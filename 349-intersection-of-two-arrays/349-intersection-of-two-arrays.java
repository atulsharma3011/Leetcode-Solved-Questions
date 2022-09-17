class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        for(int i:nums1)
        {
            a.add(i);
        }
        Set<Integer> ans=new HashSet<>();
        for(int i:nums2)
        {
            if(a.contains(i))
            {
                ans.add(i);
            }
        }
        int[] n=new int[ans.size()];
        int index=0;
        for(int i:ans)
        {
            n[index++]=i;
        }
        return n;
    }
}