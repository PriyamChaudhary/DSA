class Solution {
    public int longestConsecutive(int[] arr) {
        Set<Integer> set=new HashSet<>();
        for(int i:arr) set.add(i);
        
        int maxi=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currnum=num;
                int count=1;
                while(set.contains(currnum+1)){
                    currnum+=1;
                    count+=1;
                }
                maxi=Math.max(maxi,count);
            }
            
        }
        return maxi;
    }
}