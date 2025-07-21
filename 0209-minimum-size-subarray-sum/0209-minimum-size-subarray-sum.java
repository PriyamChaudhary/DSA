class Solution {
    public int minSubArrayLen(int target, int[] arr) {
   // brute force
    //    int n=arr.length;
    //    int minlen=Integer.MAX_VALUE;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum+=arr[j];
    //         if(sum>=target){
    //             minlen=Math.min(j-i+1,minlen);
    //         }
    //         // else if(sum<target){
    //         //     break;
    //         // }  useful for max len question
    //         }
    //     }
    //     return (minlen==Integer.MAX_VALUE)? 0 : minlen;


    //better
    int n=arr.length;
    int minlen=Integer.MAX_VALUE;
    int l=0,r=0,sum=0;
    while(r<n){
        sum+=arr[r];
        while(sum>=target){
            minlen=Math.min(minlen,r-l+1);
            sum-=arr[l];
            l++;
        }
        r++;
    }
    return (minlen==Integer.MAX_VALUE) ? 0 : minlen;
    }
}