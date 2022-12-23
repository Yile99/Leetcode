class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m -1;
        int k = n -1;
        int cur = nums1.length-1;
        while (k >= 0){
            if (i>=0 && nums1[i]>nums2[k]){
                nums1[cur]=nums1[i];
                cur--;
                i--;
            }
            else{
                nums1[cur] = nums2[k];
                cur--;
                k--;
                
            }
        }    
    }
}
