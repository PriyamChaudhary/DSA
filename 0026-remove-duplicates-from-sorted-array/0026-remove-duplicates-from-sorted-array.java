class Solution {
    public int removeDuplicates(int[] nums) {
    //try solving using set
    int i=0;
    for(int j=1;j<nums.length;j++){
        if(nums[j]!=nums[i]){
            nums[i+1]=nums[j];
            i++;
        }
    }
    return i+1;
    }
}