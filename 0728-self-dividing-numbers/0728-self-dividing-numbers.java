class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isDivisible(i))
                list.add(i);
        }
        return list;
    }
    public boolean isDivisible(int x){
        int temp=x;
        while(x!=0){
            int rem=x%10;
            if(rem==0 || temp%rem!=0)
                return false;
            x/=10;
        }
        return true;
    }
}