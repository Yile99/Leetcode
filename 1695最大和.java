class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sums = 0;
        int largest = 0;
        HashSet<Integer> hash = new HashSet<>();
        int start = 0;
        for(int end = 0; end < nums.length; end++){
            while(hash.contains(nums[end])){
                sums = sums - nums[start];
                hash.remove(nums[start]);
                start++;
            }
            sums += nums[end];
            hash.add(nums[end]);
            largest = Math.max(largest,sums);
        }
        return largest;
    }
}