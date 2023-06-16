class Solution {
    public static long sumUnderModulo(long a, long b){
        // code here
        long mod;
      mod=(long)Math.pow(10,9)+7;
        
        return ((a%mod)+(b%mod))%mod;
    }   
}
