class Solution {
    public String defangIPaddr(String address) {
    StringBuilder defang=new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
                defang.append("[.]");
            else
                defang.append(address.charAt(i));
        }
        return defang.toString();
    }
}