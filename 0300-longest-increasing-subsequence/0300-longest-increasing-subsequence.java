class Solution {
    public int lengthOfLIS(int[] arr) {
        int n=arr.length;
        if(n==0) return 0;
        int len=1;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                  dp[i]=Math.max(dp[i],1+dp[j]);  
                }
            }
            len=Math.max(len,dp[i]);
        }
        return len;
    }
}