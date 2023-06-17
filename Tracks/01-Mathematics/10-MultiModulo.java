class Solution
{
    static long multiplicationUnderModulo(long a, long b)
    {
        // add your code here
        long mod = 1000000000+7;
        return ((a%mod)*(b%mod)%mod);
    }
}
