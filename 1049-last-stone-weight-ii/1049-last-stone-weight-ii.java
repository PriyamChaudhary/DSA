class Solution {
    public int lastStoneWeightII(int[] arr) {
        int range=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            range+=arr[i];
        }
        
        boolean[][] dp=new boolean[n+1][range/2+1];
        
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=range/2;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int minDiff=Integer.MAX_VALUE;
        for(int s1=0;s1<=range/2;s1++){
            if(dp[n][s1]){
                int s2=range-s1;
                minDiff=Math.min(minDiff,Math.abs(s1-s2));
            }
        }
        return minDiff;
    }
}