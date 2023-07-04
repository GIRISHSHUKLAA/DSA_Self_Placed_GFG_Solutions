class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int ans = (int) ((Math.log10(n & -n)) / Math.log10(2)) + 1;   
        if(ans>0)
        return ans;
        
        return 0;
    }
}
