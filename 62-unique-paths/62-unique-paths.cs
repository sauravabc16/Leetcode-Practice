public class Solution {
    public int UniquePaths(int m, int n) {
     //int dp[][]=new int[m+1][n+1];
        int[,] dp = new int[m+1, n+1];
        return Fundp(m,n,dp);
        
    }
    
    public int Fundp(int m, int n, int[,] dp)
    {
        if(m==1 || n==1)
            dp[m,n]=1;
    
        if(dp[m,n]==0)
            dp[m,n]=Fundp(m-1,n,dp)+Fundp(m,n-1,dp);
        return dp[m,n];
    }
}