class Solution {
    public int lengthOfLongestSubstring(String s) {
    //brute force
    //    int n=s.length();
    //    int maxL=0;
    //     for(int i=0;i<n;i++){
    //         int[] hash=new int[256];
            
    //         for(int j=i;j<n;j++){
    //             if(hash[s.charAt(j)]==1) break;
    //             int len=j-i+1;
    //             maxL=Math.max(len,maxL);
    //             hash[s.charAt(j)]=1;
    //         }
    //     }
    //     return maxL;

    //optimal
    int n=s.length();
    int[] hash=new int[256];
    for(int i=0;i<=255;i++){
        hash[i]=-1;
    }
    int l=0,r=0;
    int maxL=0;
    while(r<n){
        if(hash[s.charAt(r)]!=-1 && hash[s.charAt(r)]>=l){
            
                l=hash[s.charAt(r)]+1;
        }
           int len=r-l+1;
         maxL=Math.max(maxL,len);
            // hash[s.charAt(r)]=r;
            // r++;
        
         hash[s.charAt(r)]=r;
            r++;
    }
    return maxL;
    }
}