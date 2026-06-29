class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n*2];
        // int a = n*2 nu  kuduthu store pannalam
        for(int i=0;i<n;i++){
            arr[i] =nums[i];
            arr[i+n] = nums[i];

        }
        return arr;

        
    }
}