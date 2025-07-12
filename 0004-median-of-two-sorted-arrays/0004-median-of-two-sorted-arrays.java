class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[] merged=new int[m+n];
        for(int i=0;i<n;i++){
           merged[i]=arr1[i];
        }
        for(int i=0;i<m;i++){
           merged[i+n]=arr2[i];
        }

        Arrays.sort(merged);

        int mid=0;
        double median=0;
        if(merged.length%2==0){
            mid=merged.length/2;
            median=(merged[mid]+merged[mid-1])/2.0;
        }
        else{
            mid=merged.length/2;
            median=merged[mid];
        }
        return median;
    }
}