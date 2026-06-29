  // dei inga paaru two sum naale trt gnayabagam vachikko
  
  
  class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap <Integer,Integer> m = new HashMap <>();
        for(int i=0;i<n;i++){
            int c = target-nums[i];
            if(m.containsKey(c)){
                return new int [] {m.get(c),i};
            }
            m.put(nums[i],i);
        }
        return new int[] {};
    }
}
