class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=i;
        }
        for(int i=0;i<n;i++){
            if(a[i]==nums[i])
            { 
            continue;
            }
            else
            {
                return a[i];
            }
        }
        return n;
    }
}