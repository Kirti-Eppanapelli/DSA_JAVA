class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int rd=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[rd]!=nums[i])
            {
                rd++;
                nums[rd]=nums[i];
            }
        }
        return rd+1;
    }
    public static void main(String[] args)
    {
        int nums[] = {1,1,2,2,3,4,5,6,6,6,7};
        Solution sol=new Solution();
        int result=sol.removeDuplicates(nums);
        for(int i=1;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}