class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,m=1;
        while(n>0)
        {
            int num=n%10;
            m=m*num;
            sum=sum+num;
            n=n/10;
        }
        int result=m-sum;
        return result;
    }
}