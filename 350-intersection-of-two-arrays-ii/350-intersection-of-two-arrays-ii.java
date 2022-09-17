class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:nums2)
        {
            int count=map.getOrDefault(i,0);
            if(count>0)
            {
                ans.add(i);
                map.put(i,count-1);
            }
        }
        int[] a=new int[ans.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i]=ans.get(i);
        }
        return a;
    }
}