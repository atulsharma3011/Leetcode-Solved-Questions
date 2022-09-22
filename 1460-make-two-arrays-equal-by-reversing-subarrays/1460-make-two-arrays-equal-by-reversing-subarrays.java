class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> ans=new HashMap();
        for(int t:target)
        {
            int count=ans.getOrDefault(t,0);
            ans.put(t,count+1);
        }
        for(int a:arr)
        {
            if(ans.containsKey(a) && ans.get(a)>0)
                ans.put(a,ans.get(a)-1);
            else
                return false;
        }
        return true;
    }
}