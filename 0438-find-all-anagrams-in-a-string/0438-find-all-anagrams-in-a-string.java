class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] pmap=new int[26];
        int[] smap=new int[26];
        int r=0;
        int l=0;
        for(char ch:p.toCharArray()){
            pmap[ch - 'a']++; //to increase freq of char in p
        }
        while(r<s.length()){
            smap[s.charAt(r) - 'a']++;
           while(r-l+1>p.length()){
            smap[s.charAt(l) - 'a']--; //is window size exceeds p length then decrease the freq and shift the window
            l++;
        }
        if(r-l+1==p.length() && Arrays.equals(pmap,smap)){
            ans.add(l);
        }
        r++;
        }
    return ans;
    }
}