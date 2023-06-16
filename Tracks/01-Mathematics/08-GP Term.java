class Solution
{
    
    public double termOfGP(int a,int b,int n)
    {
        //Your code here
        double r = (double) b/a;
        return a*Math.pow(r,n-1);
    }

}
