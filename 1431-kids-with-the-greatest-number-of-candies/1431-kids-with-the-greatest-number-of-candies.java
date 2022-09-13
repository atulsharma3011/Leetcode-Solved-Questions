class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length,maxCandies=0;
        for(int i=0;i<n;i++)
        {
            if(candies[i]>maxCandies)
            {
                maxCandies=candies[i];
            }
        }
        List <Boolean> result=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if((candies[i]+extraCandies)>=maxCandies)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}