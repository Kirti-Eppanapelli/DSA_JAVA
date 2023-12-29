class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(x>0)
        {
            int digit = x%10;
            rev = (rev * 10) + digit;
            x = x/10;
        }
        if(rev==temp)
        {
            return true;
        }
        return false;
        
    }
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        int a = 121;
        boolean result = sol.isPalindrome(a);
        System.out.println(result);
    }
}