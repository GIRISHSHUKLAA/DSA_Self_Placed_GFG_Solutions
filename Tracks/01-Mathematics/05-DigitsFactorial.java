
class Solution{
    public int digitsInFactorial(int N){
        // code here
            double res=0;
        for(long i=2;i<=N;i++)
        {
            res+=Math.log10(i);
            
        }
        
        return (int) (res+1);
    }
}
