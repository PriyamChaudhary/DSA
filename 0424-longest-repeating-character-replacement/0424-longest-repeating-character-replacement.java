class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map=new HashMap<>();
        int left=0,right=0,maxF=0,maxlen=0;
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);//increases the freq
            maxF=Math.max(maxF,map.get(ch));
            int len=right-left+1;
            if(len-maxF>k){
                char lch=s.charAt(left);
                map.put(lch,map.getOrDefault(lch,0)-1);
                left++;
            }
            maxlen=Math.max(right-left+1,maxlen);
            right++;
        }
        return maxlen;
    }
}