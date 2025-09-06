class Solution {
    public boolean isPalindrome(int x) {
         int r=0,rev=0;
    int temp=x;
    while(x>0)
    {
        r=x%10;
        rev=rev*10+r;
        x/=10;
    }
    if(rev==temp)
    {
        return true;
    }
       return false;
    }
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     Solution sol=new Solution();
    //     bool res=
    //     sol.isPalindrome(n);
    //     System.out.println(res);
    // }
}