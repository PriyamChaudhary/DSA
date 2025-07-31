class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int left=0;
        int right=0;
        int count=0;
        int maxcount=0;
        while(right<n){
        if(isVowel(s.charAt(right))){
                count++;
                }
            if(right-left+1<k){
                right++;
            }
            else if(right-left+1==k){
                maxcount=Math.max(maxcount,count);
                
                if(isVowel(s.charAt(left))){
                    count--;
                }
                left++;
                right++;
            }
        }
        return maxcount;
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}