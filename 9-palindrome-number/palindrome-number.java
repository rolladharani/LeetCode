class Solution {
    public boolean isPalindrome(int x) {
         int rev=0,temp,r;
         temp=x;
         while(x>0)
         {
            r=x%10;
            rev=rev*10+r;
            x/=10;
         }
         if(temp==rev)
         {
            return true;
         }
         else
         {
            return false;
         }
    }

}