class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
   //its giving TLE because we are recalculating the max in each windwo again and again
    //     int n=nums.length;
    //     int[] res=new int[n-k+1];
    //     int l=0,r=0;
    //     int idx=0;
    //     while(r<n){
    //         int len=r-l+1;
    //         if(len<k){
    //             r++;
    //         }
    //         else if(len==k){
    //             res[idx++]=maxi(l,r,nums);
    //             l++;
    //             r++;
    //         }
    //         // if(len>k){
    //         //     break;
    //         // }
    //     }
    //     return res;
    // }
    // private static int maxi(int start,int end, int[] nums){
    //        int max=nums[start];
    //         for(int i=start+1;i<=end;i++){
    //             if(nums[i]>max){
    //                 max=nums[i];
    //             }
    //         }
    //         return max;

    //optimized because agar max ele ka index left boundary se bahar nikal gya then only we need to recalculate it again for the window.
    // int n=nums.length;
    // int[] res=new int[n-k+1];
    // int l=0,r=0,idx=0;
    // int currmax=Integer.MIN_VALUE;
    // int maxidx=-1;
    // while(r<n){
    //     int len=r-l+1;
    //     if(len<k){
    //         r++;
    //     }
    //     else if(len==k){
    //         if(maxidx<l){ //here we are taking index bacause what is prev leftmost element is the maximum and when we shift one ahead it will be out of the window
    //             currmax=nums[l];
    //             maxidx=l;
    //         for(int i=l+1;i<=r;i++){
    //             if(nums[i]>currmax){
    //                 currmax=nums[i];
    //                 maxidx=i;
    //             }
    //         }
    //         }
    //         else if(nums[r]>currmax){//values isliye compare kr rhe hai b/c right side me to humesha hi window k andar hi value aayegi and when we will shift it one point ahead if that point is greater than the perv max then it will be the max
    //             currmax=nums[r];
    //             maxidx=r;
    //         }
    //         res[idx++]=currmax;
    //         l++;
    //         r++;
    //     }
    // }
    // return res;

    //using queue data str because we want something that can be traversed from both the ends
    int n=nums.length;
    int l=0,r=0;
    Deque<Integer> q=new ArrayDeque<>();
    int[] res=new int[n-k+1];
    int idx=0;
    while(r<n){
        while(q.size()>0 && q.peekLast()<nums[r]){
            q.pollLast();
        }
        q.addLast(nums[r]);
        if(r-l+1<k){
            r++;
        }
       else if(r-l+1==k){
            res[idx++]=q.getFirst();
            if(q.getFirst()==nums[l]) q.pollFirst();
            l++;
            r++;
        }
    }
     return res;
    }
}