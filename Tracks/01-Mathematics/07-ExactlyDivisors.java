class Solution
{
    
    public int exactly3Divisors(int n)
    {
        //Your code here
        int c = 0;
        boolean flag = true;
        for(int i = 2; i*i<=n; i++){
            flag = true;
            for(int j = 2; j*j<=i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag)
             c++;
        }
        return c;
    }
}
