class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;    
        boolean case1=true, case2=true, case3=true, case4=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(case1 && mat[i][j]!=target[i][j]){
                    case1=false;
                }
                if(case2 && mat[i][j]!=target[j][n-i-1]){
                    case2=false;
                }
                if(case3 && mat[i][j]!=target[n-i-1][n-j-1]){
                    case3=false;
                }
                if(case4 && mat[i][j]!=target[n-j-1][i]){
                    case4=false;
                }
            }
        }
        return case1||case2||case3||case4;  
    }
}