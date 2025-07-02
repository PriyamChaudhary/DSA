class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int maxL=0;
        int r=0,l=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[j]==0){
                    count++;
                }
                if(count<=k){
                    int len=j-i+1;
                    maxL=Math.max(len,maxL);
                }
                else break;
            }
        }
        return maxL;
    }
}