class Solution {
    public int findComplement(int num) {
        /*int digits=0;
        int temp=num;
        while(temp!=0){
            digits++;
            temp/=2;
        }
        
        return num^(int)(Math.pow(2,digits)-1); */
        
        int i=0;
        int j=0;
        while(i<num)
        {
            i+=Math.pow(2,j);
            j++;
        }
        return i-num;
    }
}